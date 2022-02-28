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
    public static void insertIntoDepartmentTable(int deptId , String deptName , String deptCity) {

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
     * Hibernate Query Language (HQL) is an object-oriented query language, similar to SQL,
     * but instead of operating on tables and columns,
     * HQL works with persistent objects and their properties.
     */
    public List<Department> getDepartmentList() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Department");

        List<Department> deptList = query.list();
        session.close();

      return deptList;
    }


    /*public static void main(String[] args) {

        DepartmentDao deptDao = new DepartmentDao();
       // Department department = new Department()

        deptDao.insertIntoDepartmentTable(1001 , "IT" , "GGN");

        // To print
        System.out.println("------------------------------");

        List<Department> deptList = deptDao.getDepartmentList();
        System.out.println("emp size: "+ deptList.size());
        deptList.stream().forEach(System.out::println);

        System.out.println("-------------------------------");


    }*/
}