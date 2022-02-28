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
     *
     * @param empId
     * @param empFirstName
     * @param empLastName
     * @param empAge
     * @param empCity
     * @param empSalary
     * @param department
     */
    public void insertIntoEmployeeTable(int empId , String empFirstName , String empLastName , int empAge , String empCity , int empSalary , Department department) {

        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();;

        try {

            // Set Values
            Employee employee = new Employee();
             employee.setEmpId(empId);
             employee.setFirstName(empFirstName);
             employee.setLastName(empLastName);
             employee.setAge(empAge);
             employee.setCity(empCity);
             employee.setSalary(empSalary);
             employee.setDepartment(department);



//             department.setDeptId(deptId);
//            department.setDeptName("IT");
//            department.setDeptCity("GGN");

             // Set of employees
//            Set<Employee> empSet = new HashSet<>();
//            empSet.add(employee);
//
//            department.setEmployees(empSet);
//
//            employee.setDepartment(department);
//

            //start the transaction/work
            transaction = session.beginTransaction();


            //session.save(department);

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

}
