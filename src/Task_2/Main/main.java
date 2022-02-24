package Task_2.Main;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 5:49 PM
 * IoT83 Internship
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import Task_2.Dao.EmployeeDao;
import Task_2.Data.Employee;
import Task_2.DatabaseConnection.connection;

public class main {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);


        /*********************************************** INSERT ************************************************************/

        // connection class object
        connection c = new connection();

        // connection created
        c.attemptConnection();

         // Take data from user input

            // Employee ID
        /*    System.out.println("Enter Employee ID");
            int empId = sc.nextInt();

            // FirstName
            System.out.println("Enter Employee's First Name");
            String firstName = sc.next();

            // LastName
            System.out.println("Enter Employee's LastName");
            String lastName = sc.next();

            // Age
            System.out.println("Enter Employee's age");
            int empAge = sc.nextInt();

            // Salary
            System.out.println("Enter Employee's salary");
            int empSalary = sc.nextInt();

            System.out.println("Enter Employee's city");
            String empCity = sc.next();

            System.out.println("Enter Employee's deptID");
            int empDeptId = sc.nextInt();

            Employee employee = new Employee(empId, firstName, lastName, empAge, empSalary, empCity, empDeptId);

            EmployeeDao dao = new EmployeeDao();

            if (dao.insertEmployee(c.getConnection(), employee)) {
                System.out.println("Records Inserted Successfully !!!");
                System.out.println();
                System.out.println("#######################################################################");
                dao.retrieveAllEmployeesData(c.getConnection());
            } else {
                System.out.println("Sorry! No Records Inserted");
            }

         */

    /************************************************* RETRIEVE DATA USING EMPLOYEE ID *******************************************************************/

/*
       EmployeeDao dao = new EmployeeDao();

        System.out.println("Enter Employee ID to retrieve it's data");

        int empId = sc.nextInt();

        dao.retrieveEmployeeUsingID(c.getConnection() , empId);

 */

      /***************************************************** DELETE EMPLOYEE USING ID **************************************************************/

      /*  EmployeeDao dao = new EmployeeDao();

        System.out.println("Enter Employee ID to delete it's data");

        int empId = sc.nextInt();

        if (dao.deleteEmployeeUsingID(c.getConnection() , empId)){
            System.out.println("Employer with ID :- " + empId + " is deleted Successfully !!");
            System.out.println();
            System.out.println("Record after deletion");
            System.out.println(" ############################################################################################# ");
            dao.retrieveAllEmployeesData(c.getConnection());
        }
        else{
            System.out.println("Sorry ! No Record Found");
        } */

        /*************************************************RETRIEVE DATA OF ALL EMPLOYEES *******************************************************************/


      /* EmployeeDao dao = new EmployeeDao();

        System.out.println(" ####################################################################### ");

        dao.retrieveAllEmployeesData(c.getConnection());

       */

        /*************************************************RETRIEVE DATA OF ALL EMPLOYEES WITH DEPTID (MAX 10) *******************************************************************/

         /*   EmployeeDao dao = new EmployeeDao();

            System.out.println("Enter Department Id");
            int deptId = sc.nextInt();

            System.out.println("#######################################################################");
            dao.retrieveAllEmployeesDataUsingDeptId(c.getConnection(), deptId);

          */

        /************************************************* UPDATE DATA OF EMPLOYEE *******************************************************************/

      /*  EmployeeDao dao = new EmployeeDao();


        Employee employee = new Employee();



        dao.updateEmployee(c.getConnection() , employee);


       */


        /********
         *
         *                                      TASK - 3 BEGINS
         *
         *********/

        /************************************************* Select Top 5 Employee with highest salary *******************************************************************/

       /* EmployeeDao dao = new EmployeeDao();

        System.out.println("#######################################################################");
        dao.fiveEmployeeWithHighestSalary(c.getConnection()); */


        /************************************************* Select Employee with MAX salary *******************************************************************/

       /* EmployeeDao dao = new EmployeeDao();

        System.out.println("#######################################################################");
        dao.employeeWithMaxSalary(c.getConnection()); */

        /************************************************* Select Employee with MIN salary *******************************************************************/

       /* EmployeeDao dao = new EmployeeDao();

        System.out.println("#######################################################################");
        dao.employeeWithMinSalary(c.getConnection());

        */

        /************************************************* Total Salary Paid *******************************************************************/

      /*  EmployeeDao dao = new EmployeeDao();

        System.out.println("#######################################################################");
        dao.totalSalaryPaid(c.getConnection());

       */

        /************************************************* Avg Salary Paid Dept Wise*******************************************************************/


       /* EmployeeDao dao = new EmployeeDao();

        System.out.println("#######################################################################");
        dao.avgSalaryDeptWise(c.getConnection());

        */

        /***************************************** Employee's salary greater than average salary of any department*******************************************************************/


      /*  EmployeeDao dao = new EmployeeDao();

        System.out.println("#######################################################################");
        dao.empSalaryGreaterThanAvg(c.getConnection());

       */

        /***************************************** Retrieve Employee data using city ******************************************************************/


     /*  EmployeeDao dao = new EmployeeDao();

        System.out.println("Enter the Employee's city");
       String city = sc.next();

        System.out.println("#######################################################################");
        dao.retrieveAllEmployeesDataUsingCity(c.getConnection(),city);

      */

        /***************************************** Retrieve Employee data with deptName ******************************************************************/


       /* EmployeeDao dao = new EmployeeDao();

        System.out.println("#######################################################################");
        dao.retrieveAllEmployeesDataWithDeptName(c.getConnection());


        */

        /***************************************** Employee's age greater than average age  ******************************************************************/


      /*  EmployeeDao dao = new EmployeeDao();

        System.out.println("#######################################################################");
        dao.empAgeGreaterThanAvg(c.getConnection());


       */

        /***************************************** Salary Sorted in ASCENDING ORDER  ******************************************************************/


      /*  EmployeeDao dao = new EmployeeDao();

        System.out.println("#######################################################################");
        dao.retrieveSalaryInAscOrder(c.getConnection());


       */


        /***************************************** Salary Sorted in DESCENDING ORDER  ******************************************************************/


        EmployeeDao dao = new EmployeeDao();

        System.out.println("#######################################################################");
        dao.retrieveSalaryInDescOrder(c.getConnection());


        /********
         *
         *                                      TASK - 3 ENDS
         *
         *********/




    }

}
