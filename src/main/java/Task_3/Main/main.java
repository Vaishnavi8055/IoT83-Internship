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

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose any one -");

        System.out.println("------------------------------------------");
        System.out.println("1. Insert Employee Data");
        System.out.println("2. Delete Employee Data");
        System.out.println("3. Update Employee Data");
        System.out.println("4. Insert Employee Data");
        System.out.println("------------------------------------------");

        int choice = scanner.nextInt();

        switch (choice){

            case 1 : {
                /** Insert In Employee Table **/

                System.out.println("Data Inserting .............");

                EmployeeDao employeeDao = new EmployeeDao();
                Employee employees = new Employee();

                Department department = new Department();
                employees.setDepartment(department);

                //employees.getDepartment().getDeptId();

              //  Set<Employee> empList = new HashSet<Employee>()

                // deptDao.insertIntoDepartmentTable(1001 , "IT" , "GGN");

                employeeDao.insertIntoEmployeeTable(1 , "Vaishnavi" , "Chaurasia" , 21 ,  "Mathura" , 20000 , department);

                // employeeDao.insertIntoEmployeeTable(2 , "Kapil" , "Kumar" , 21 ,  "Naujheel" , 20000 , 1001);

                System.out.println("Data Inserted Successfully !!");
                /** Insert In Employee Table **/
            }

        }



//        System.out.println("Data Inserting .............");
//        DepartmentDao deptDao = new DepartmentDao();
//
//        // deptDao.insertIntoDepartmentTable(1001 , "IT" , "GGN");
//        deptDao.insertIntoDepartmentTable(1002, "HR", "Noida");
//        deptDao.insertIntoDepartmentTable(1003, "Admin", "Delhi");
//



    }

}
