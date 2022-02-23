package Task_2.DatabaseConnection;/*
 * Created by Vaishnavi Chaurasia
 * 23-Feb-22
 * 4:45 PM
 * IoT83 Internship
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connection {

    /**
     * interfaces are used to execute static SQL query and
     * parameterized SQL query, respectively.
     * Statement is the super interface o f the PreparedStatement interface.
     */
    PreparedStatement preparedStatement;

    /** Connection interface - represents from which
     *  we can create statements to execute queries and retrieve results,
     *  get metadata about the database, close connection, etc.
     */
    private Connection connection = null;
    private final static String URL="jdbc:mysql://localhost:3306/company";
    private final static String username="root";
    private final static String password="7983909427";

    public Connection getConnection(){
        return connection;
    }

    public boolean attemptConnection() throws SQLException {

        /**
         * Driver Manager -
         * class is used to register driver for a specific database type
         * (e.g. MySQL) and
         * to establish a database connection with the server via its getConnection() method.
         */
        connection= DriverManager.getConnection(URL,username,password);
        return connection!=null;
    }

    public void closeConnection() throws SQLException {
        getConnection().close();
    }

    /**
     * Insert Record into Database
     */
//    public void insertRecord() {
//
//        String sqlQuery = "Insert into ";
//
//    }



}
