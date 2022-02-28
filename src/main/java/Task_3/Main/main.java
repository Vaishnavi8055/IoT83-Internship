package Task_3.Main;/*
 * Created by Vaishnavi Chaurasia
 * 27-Feb-22
 * 1:11 AM
 * IoT83 Internship
 */

import Task_3.Dao.DepartmentDao;
import Task_3.Dao.EmployeeDao;
import Task_3.Data.Department;
import Task_3.Data.Employee;

import java.util.Scanner;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose any one -");

        System.out.println("------------------------------------------");
        System.out.println("1. Insert Employee Data");
        System.out.println("2. Update Employee Data");
        System.out.println("3. Delete Employee Data");
        System.out.println("4. Retrieve Employee Data");
        System.out.println("5. Insert Department Data");
        System.out.println("6. Retrieve Department Data");
        System.out.println("------------------------------------------");

        int choice = scanner.nextInt();

        switch (choice){

            case 1 : {
                /** Insert In Employee Table **/

               System.out.println("Data Inserting .............");

                Employee employee1 = new Employee();
                Department department = new Department();

                System.out.println("Enter Employee First name");
                String empFName = scanner.next();

                System.out.println("Enter Employee Last name");
                String empLName = scanner.next();


                System.out.println("Enter Employee Id");
                int empId = scanner.nextInt();

                System.out.println("Enter Employee city");
                String empCity = scanner.next();

                System.out.println("Enter Employee Age");
                int empAge = scanner.nextInt();

                System.out.println("Enter Employee Salary");
                int empSalary = scanner.nextInt();

                System.out.println("Enter Department Id");
                int dept_Id = scanner.nextInt();

                EmployeeDao employeeDao = new EmployeeDao();
                employeeDao.insertIntoEmployeeTable(empId , empFName , empLName , empAge , empCity , empSalary , department , dept_Id);


                /** Insert In Employee Table **/
            }

            case 2: {

                /** Update In Employee Table **/
                EmployeeDao employeeDao = new EmployeeDao();
                employeeDao.updateEmployeeTable();
                System.out.println("----- Data Updated Successfully !! --------");
                /** Update In Employee Table **/

            }
            case 3: {
                /** Delete In Employee Table **/

                EmployeeDao employeeDao = new EmployeeDao();
                employeeDao.deleteEmployeeTable();
                System.out.println("----- Data Deleted Successfully !! --------");

                /** Delete In Employee Table **/

            }

            case 4: {
                /** Retrieve In Employee Table **/

                EmployeeDao employeeDao = new EmployeeDao();
                employeeDao.getEmployeeTable();

                /** Retrieve In Employee Table **/

            }

            case 5: {
                /** Insert In Department Table **/

                DepartmentDao departmentDao = new DepartmentDao();
                departmentDao.insertIntoDepartmentTable(1001 , "IT" , "GGN");
                System.out.println("----- Data Inserted Successfully !! --------");

                /** Insert In Department Table **/

            }

            case 6: {
                /** Retrieve In Department Table **/

                DepartmentDao departmentDao = new DepartmentDao();
                departmentDao.getDepartmentTable();

                /** Retrieve In Department Table **/

            }

        }



    }

}
