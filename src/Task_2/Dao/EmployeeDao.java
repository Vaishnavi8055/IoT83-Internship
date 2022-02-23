package Task_2.Dao;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 5:38 PM
 * IoT83 Internship
 */

import Task_2.Data.Employee;

import java.sql.*;

/**
 * CRUD Operation class
 */
public class EmployeeDao {

    /**
     * INSERT Record INTO EMPLOYEE TABLE
     * @param connection
     * @param employee
     * @return
     * @throws SQLException
     */

    public boolean insertEmployee(Connection connection , Employee employee) throws SQLException {

        int empId = employee.getEmpId();
        String firstName = employee.getFirstName();
        String lastName = employee.getLastName();
        int empAge = employee.getAge();
        String empCity = employee.getCity();
        int deptId = employee.getDeptId();
        int empSalary = employee.getSalary();

        PreparedStatement preparedStatement = connection.prepareStatement
                ("INSERT INTO employee(empId,firstName,lastName,age,city, deptId , salary) Values(?,?,?,?,?,?,?);");

        preparedStatement.setInt(1,empId);
        preparedStatement.setString(2,firstName);
        preparedStatement.setString(3,lastName);
        preparedStatement.setInt(4, empAge);
        preparedStatement.setString(5,empCity);
        preparedStatement.setInt(6,deptId);
        preparedStatement.setInt(7,empSalary);

        // Returns number of rows Inserted
        int rowsInserted = preparedStatement.executeUpdate();

     return rowsInserted>=1;
    }

    /**
     * UPDATE EMPLOYEE Record
     * @param connection
     * @param employee
     * @return
     * @throws SQLException
     */

    public boolean updateEmployee(Connection connection , Employee employee) throws SQLException {

        String updateQuery = "UPDATE Employee SET firstName=?, lastName=? age=? city=? deptId=? salary=? WHERE empId=?";

        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

        // Returns number of rows Inserted
        int rowsUpdated = preparedStatement.executeUpdate();

       return rowsUpdated > 0;
    }

    /**
     * RETRIEVE Employee Data Using EmployeeID
     * @param connection
     * @throws SQLException
     */
    public void retrieveEmployeeUsingID(Connection connection , int empId) throws SQLException {

        // Select Query
        String retrieveQuery = "SELECT empId, firstName, lastName, age, city, deptId, salary FROM Employee WHERE empId=?";


        PreparedStatement preparedStatement = connection.prepareStatement(retrieveQuery);
        preparedStatement.setInt(1,empId);

        // Run Query in Result set
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){

            System.out.println("Employee's ID :- " +  resultSet.getInt(1));
            System.out.println("Employee's First Name :- " + resultSet.getString(2));
            System.out.println("Employee's Last Name :- " + resultSet.getString(3));
            System.out.println("Employee's Age :- " + resultSet.getInt(4));
            System.out.println("Employee's salary :- " + resultSet.getInt(6));
            System.out.println("Employee's City :- " + resultSet.getString(5));
            System.out.println("Employee's DepartmentId :- " + resultSet.getInt(7));

        }

        resultSet.close();
        preparedStatement.close();

    }

    /**
     *
     * @param connection
     * @param empIdToDelete
     * @return
     * @throws SQLException
     */

    public boolean deleteEmployeeUsingID(Connection connection , int empIdToDelete) throws SQLException {

        String deleteQuery = "DELETE FROM Employee WHERE empID=?";

        // for a SQL Query with Parameter
        PreparedStatement statement = connection.prepareStatement(deleteQuery);
        statement.setInt(1, empIdToDelete);

        // executeUpdate Method to Insert, Update, Delete (not Select)
        int rowsDeleted = statement.executeUpdate();


       return rowsDeleted > 0;
    }

    /**
     *
     * @param connection
     * @throws SQLException
     */

    public void retrieveAllEmployeesData(Connection connection) throws SQLException {

        String selectAllQuery = "SELECT * FROM Employee";


        // for a static SQL Query with no Parameter
       Statement statement = connection.createStatement();


        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery(selectAllQuery);

        while (resultSet.next()){

            System.out.println("Employee's ID :- " +  resultSet.getInt(1));
            System.out.println("Employee's First Name :- " + resultSet.getString(2));
            System.out.println("Employee's Last Name :- " + resultSet.getString(3));
            System.out.println("Employee's Age :- " + resultSet.getInt(4));
            System.out.println("Employee's salary :- " + resultSet.getInt(5));
            System.out.println("Employee's City :- " + resultSet.getString(6));
            System.out.println("Employee's DepartmentId :- " + resultSet.getInt(7));


            System.out.println( "############################################################################### ");

        }

    }

    /**
     *
     * @param connection
     * @param deptId
     * @throws SQLException
     */

    public void retrieveAllEmployeesDataUsingDeptId(Connection connection , int deptId) throws SQLException {

        String selectAllQueryDeptId = "SELECT * FROM Employee WHERE deptId=? LIMIT 10";

       // System.out.println("Query run");

        // for a static SQL Query with no Parameter
        //Statement statement = connection.createStatement();

        PreparedStatement statement = connection.prepareStatement(selectAllQueryDeptId);
        statement.setInt(1, deptId);


        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {

            System.out.println("Employee's ID :- " + resultSet.getInt(1));
            System.out.println("Employee's First Name :- " + resultSet.getString(2));
            System.out.println("Employee's Last Name :- " + resultSet.getString(3));
            System.out.println("Employee's Age :- " + resultSet.getInt(4));
            System.out.println("Employee's salary :- " + resultSet.getInt(5));
            System.out.println("Employee's City :- " + resultSet.getString(6));
            System.out.println("Employee's DepartmentId :- " + resultSet.getInt(7));


            System.out.println("############################################################################### ");

        }
    }







}
