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
     *
     * @param connection
     * @param employee
     * @return
     * @throws SQLException
     */

    public boolean insertEmployee(Connection connection, Employee employee) throws SQLException {

        int empId = employee.getEmpId();
        String firstName = employee.getFirstName();
        String lastName = employee.getLastName();
        int empAge = employee.getAge();
        String empCity = employee.getCity();
        int deptId = employee.getDeptId();
        int empSalary = employee.getSalary();

        PreparedStatement preparedStatement = connection.prepareStatement
                ("INSERT INTO employee(empId,firstName,lastName,age,city, deptId , salary) Values(?,?,?,?,?,?,?);");

        preparedStatement.setInt(1, empId);
        preparedStatement.setString(2, firstName);
        preparedStatement.setString(3, lastName);
        preparedStatement.setInt(4, empAge);
        preparedStatement.setString(5, empCity);
        preparedStatement.setInt(6, deptId);
        preparedStatement.setInt(7, empSalary);

        // Returns number of rows Inserted
        int rowsInserted = preparedStatement.executeUpdate();

        return rowsInserted >= 1;
    }

    /**
     * UPDATE EMPLOYEE Record
     *
     * @param connection
     * @param employee
     * @return
     * @throws SQLException
     */

    public boolean updateEmployee(Connection connection, Employee employee) throws SQLException {

        String updateQuery = "UPDATE Employee SET firstName=?, lastName=? age=? city=? deptId=? salary=? WHERE empId=?";

        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

        // Returns number of rows Inserted
        int rowsUpdated = preparedStatement.executeUpdate();

        return rowsUpdated > 0;
    }

    /**
     * RETRIEVE Employee Data Using EmployeeID
     *
     * @param connection
     * @throws SQLException
     */
    public void retrieveEmployeeUsingID(Connection connection, int empId) throws SQLException {

        // Select Query
        String retrieveQuery = "SELECT empId, firstName, lastName, age, city, deptId, salary FROM Employee WHERE empId=?";


        PreparedStatement preparedStatement = connection.prepareStatement(retrieveQuery);
        preparedStatement.setInt(1, empId);

        // Run Query in Result set
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {

            System.out.println("Employee's ID :- " + resultSet.getInt(1));
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
     * @param connection
     * @param empIdToDelete
     * @return
     * @throws SQLException
     */

    public boolean deleteEmployeeUsingID(Connection connection, int empIdToDelete) throws SQLException {

        String deleteQuery = "DELETE FROM Employee WHERE empID=?";

        // for a SQL Query with Parameter
        PreparedStatement statement = connection.prepareStatement(deleteQuery);
        statement.setInt(1, empIdToDelete);

        // executeUpdate Method to Insert, Update, Delete (not Select)
        int rowsDeleted = statement.executeUpdate();


        return rowsDeleted > 0;
    }

    /**
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

    /**
     * @param connection
     * @param deptId
     * @throws SQLException
     */

    public void retrieveAllEmployeesDataUsingDeptId(Connection connection, int deptId) throws SQLException {

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

    /**
     * @param connection
     * @throws SQLException
     */

    public void fiveEmployeeWithHighestSalary(Connection connection) throws SQLException {


        String empWithHighestSalaryQuery = "SELECT a.* FROM Employee a ORDER BY salary desc LIMIT 5";


        Statement statement = connection.createStatement();

        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery(empWithHighestSalaryQuery);

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

    /**
     * @param connection
     * @throws SQLException
     */

    public void employeeWithMaxSalary(Connection connection) throws SQLException {

        String empMaxSalary = "SELECT a.* FROM Employee a ORDER BY salary desc LIMIT 1";

        Statement statement = connection.createStatement();

        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery(empMaxSalary);

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

    /**
     * @param connection
     * @throws SQLException
     */

    public void employeeWithMinSalary(Connection connection) throws SQLException {

        String empMinSalary = "SELECT a.* FROM Employee a ORDER BY salary asc LIMIT 1";

        Statement statement = connection.createStatement();

        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery(empMinSalary);

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

    /**
     * @param connection
     * @throws SQLException
     */
    public void totalSalaryPaid(Connection connection) throws SQLException {

        String totalSalary = "SELECT SUM(salary) FROM Employee";

        Statement statement = connection.createStatement();

        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery(totalSalary);


        while (resultSet.next()) {

            System.out.println("Total salary paid by company :- " + resultSet.getInt(2));

            System.out.println("############################################################################### ");

        }
    }

    /**
     * @param connection
     * @throws SQLException
     */
    public void avgSalaryDeptWise(Connection connection) throws SQLException {

        String avgSalaryByDept =
                "SELECT department.deptId , department.deptName , AVG(salary) as AVG_SALARY FROM Employee INNER JOIN Department on employee.deptId = department.deptId GROUP BY department.deptId";

        Statement statement = connection.createStatement();

        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery(avgSalaryByDept);

        while (resultSet.next()) {

            System.out.println("Department ID :- " + resultSet.getInt(1));
            System.out.println("Department Name :- " + resultSet.getString(2));
            System.out.println("Average Salary :- " + resultSet.getInt(3));

            System.out.println("############################################################################### ");


        }
    }

    /**
     *
     * @param connection
     * @throws SQLException
     */

    public void empSalaryGreaterThanAvg(Connection connection) throws SQLException {

        String empWithSalaryHigherThanAvg =
                "SELECT * FROM Employee HAVING salary > AVG(salary)";

        Statement statement = connection.createStatement();

        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery(empWithSalaryHigherThanAvg);

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

    /**
     *
     * @param connection
     * @param city
     * @throws SQLException
     */

    public void retrieveAllEmployeesDataUsingCity(Connection connection, String city) throws SQLException {

        String selectAllQueryCity = "SELECT * FROM Employee WHERE city=?";

        // for a static SQL Query with no Parameter
        //Statement statement = connection.createStatement();

        PreparedStatement statement = connection.prepareStatement(selectAllQueryCity);
        statement.setString(1, city);


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

    /**
     *
     * @param connection
     * @throws SQLException
     */

    public void retrieveAllEmployeesDataWithDeptName(Connection connection) throws SQLException {

        String selectAllQueryDeptName = "SELECT employee.empId, employee.firstName, employee.lastName, employee.age, employee.salary, employee.city, employee.deptId, department.deptName FROM Employee INNER JOIN department WHERE employee.deptId = department.deptId";

        // for a static SQL Query with no Parameter
        Statement statement = connection.createStatement();


        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery(selectAllQueryDeptName);

        while (resultSet.next()) {

            System.out.println("Employee's ID :- " + resultSet.getInt(1));
            System.out.println("Employee's First Name :- " + resultSet.getString(2));
            System.out.println("Employee's Last Name :- " + resultSet.getString(3));
            System.out.println("Employee's Age :- " + resultSet.getInt(4));
            System.out.println("Employee's salary :- " + resultSet.getInt(5));
            System.out.println("Employee's City :- " + resultSet.getString(6));
            System.out.println("Employee's DepartmentId :- " + resultSet.getInt(7));
            System.out.println("Employee's Department Name :- " + resultSet.getString(8));


            System.out.println("############################################################################### ");

        }
    }

    /**
     *
     * @param connection
     * @throws SQLException
     */

    public void empAgeGreaterThanAvg(Connection connection) throws SQLException {

        String empWithAgeHigherThanAvg =
                "SELECT empId , firstName,age,AVG(age) as AVG_AGE FROM Employee HAVING age > AVG(age)";

        Statement statement = connection.createStatement();

        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery(empWithAgeHigherThanAvg);

        while (resultSet.next()) {

            System.out.println("Employee's ID :- " + resultSet.getInt(1));
            System.out.println("Employee's First Name :- " + resultSet.getString(2));
            System.out.println("Employee's Age :- " + resultSet.getInt(4));

            System.out.println("############################################################################### ");

        }
    }

    /**
     *
     * @param connection
     * @throws SQLException
     */

    public void retrieveSalaryInAscOrder(Connection connection) throws SQLException {

        String sortSalaryQuery = "SELECT a.* FROM Employee a ORDER BY salary asc";

        Statement statement = connection.createStatement();

        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery(sortSalaryQuery);

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

    /**
     *
     * @param connection
     * @throws SQLException
     */

    public void retrieveSalaryInDescOrder(Connection connection) throws SQLException {

        String sortSalaryQuery = "SELECT a.* FROM Employee a ORDER BY salary desc";

        Statement statement = connection.createStatement();

        // Run Query in Result set
        // executeQuery Method to Select
        ResultSet resultSet = statement.executeQuery(sortSalaryQuery);

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
