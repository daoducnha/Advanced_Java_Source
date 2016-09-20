
package managerCD;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 20-9-2016
 * Class Database to manager connect database by JDBC
 */
public class Database {
    private static final String JDBC_URL = 
            "jdbc:mysql://localhost:3306/cdstore?useUnicode=true&characterEncoding=utf8";
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
