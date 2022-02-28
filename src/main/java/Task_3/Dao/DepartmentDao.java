package Task_3.Dao;/*
 * Created by Vaishnavi Chaurasia
 * 25-Feb-22
 * 11:45 PM
 * IoT83 Internship
 */

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import Task_3.Data.Department;

import java.util.List;
import Task_3.Utility.HibernateUtil;

/**
 * Transaction is a unit of work
 * Transaction -> commit -> work done!
 * Transaction -> rollback -> failed !
 */

public class DepartmentDao {

    /**
     *
     * @param deptId
     * @param deptName
     * @param deptCity
     */
    public void insertIntoDepartmentTable(int deptId , String deptName , String deptCity) {

        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();;

        try {

            //start the transaction/work
            transaction = session.beginTransaction();

            // Set Values
            Department department = new Department();
            department.setDeptId(deptId);
            department.setDeptName(deptName);
            department.setDeptCity(deptCity);

            // save the Department object
            session.save(department);

            System.out.println("Inserted Department - " + department.getDeptName());

            //commit all changes during transaction
            transaction.commit();

        } catch (HibernateException e) {

            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();

        } finally {
            try {
                if (session != null) session.close();
            } catch (Exception ex) {
            }
        }
    }

    /**
     *  RETRIEVE
     */
    public void getDepartmentTable() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try{
            // get Entity/Class
            // second parameter is the primary key
            Department department = (Department) session.get(Department.class , 1001);

            System.out.println("------------------------------------------------");

            System.out.println("Department ID :- " + department.getDeptId());
            System.out.println("Department Name :- " + department.getDeptName());
            System.out.println("Department City :- " + department.getDeptCity());

            System.out.println("------------------------------------------------");


            //start the transaction/work
            transaction = session.beginTransaction();


            transaction.commit();

        }
        catch (HibernateException e) {

            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();

        } finally {
            try {
                if (session != null) session.close();
            } catch (Exception ex) {
            }
        }
    }



}