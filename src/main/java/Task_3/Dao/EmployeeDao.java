package Task_3.Dao;/*
 * Created by Vaishnavi Chaurasia
 * 27-Feb-22
 * 1:11 AM
 * IoT83 Internship
 */

import Task_3.Data.Department;
import Task_3.Data.Employee;

import Task_3.Utility.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDao {

    /**
     * @param empId
     * @param empFirstName
     * @param empLastName
     * @param empAge
     * @param empCity
     * @param empSalary
     * @param department
     * @param deptId
     */
    public void insertIntoEmployeeTable(int empId, String empFirstName, String empLastName, int empAge, String empCity, int empSalary, Department department, int deptId) {

        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        ;

        try {

            // Set Values
            Employee employee = new Employee();
            employee.setEmpId(empId);
            employee.setFirstName(empFirstName);
            employee.setLastName(empLastName);
            employee.setAge(empAge);
            employee.setCity(empCity);
            employee.setSalary(empSalary);

            department = new Department();

            department.setDeptId(deptId);
            employee.setDepartment(department);


            //start the transaction/work
            transaction = session.beginTransaction();


            // save the Employee object
            session.save(employee);

            System.out.println("------------------------------------------");
            System.out.println("Inserted Employee - " + employee.getFirstName() + " " + employee.getLastName());
            System.out.println("------------------------------------------");

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
     *  UPDATE
     */
    public void updateEmployeeTable() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try{
            // get Entity/Class
            // second parameter is the primary key
            Employee employee = (Employee) session.get(Employee.class , 19);
            System.out.println("Data Before Updating : " + employee.getLastName());
           // updated Last name of employee with id 12

           employee.setLastName("Sharma");

            //start the transaction/work
            transaction = session.beginTransaction();

            // update session
            session.update(employee);

           transaction.commit();
           System.out.println("Data After Updating : " + employee.getLastName());

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


    /**
     *  DELETE
     */
    public void deleteEmployeeTable() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try{
            // get Entity/Class
            // second parameter is the primary key
            Employee employee = (Employee) session.get(Employee.class , 20);

            System.out.println("Data Deleting of : " + employee.getFirstName() + " " + employee.getLastName());

            //start the transaction/work
            transaction = session.beginTransaction();

            // update session
            session.delete(employee);

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


    /**
     *  RETRIEVE
     */
    public void getEmployeeTable() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;

        try{
            // get Entity/Class
            // second parameter is the primary key
            Employee employee = (Employee) session.get(Employee.class , 17);

            System.out.println("------------------------------------------------");

            System.out.println("Employee's ID :- " + employee.getEmpId());
            System.out.println("Employee's First Name :- " + employee.getFirstName());
            System.out.println("Employee's Last Name :- " + employee.getLastName());
            System.out.println("Employee's Age :- " + employee.getAge());
            System.out.println("Employee's salary :- " + employee.getSalary());
            System.out.println("Employee's City :- " + employee.getCity());
            System.out.println("Employee's DepartmentId :- " + employee.getDepartment().getDeptId());

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
