/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 17-09-2016
 * Class Database to manager connet Database
 */
public class Database {

   private static final String JDBC_URL = 
            "jdbc:mysql://localhost:3306/store?useUnicode=true&characterEncoding=utf8";
    private static final String JDBC_DRIVER_CLASS = 
            "com.mysql.jdbc.Driver";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "";
    
    public Connection connect() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER_CLASS);
        Connection conn = (Connection) DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        return conn;
    }
}
