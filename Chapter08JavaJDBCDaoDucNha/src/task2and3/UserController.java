/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2and3;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hv
 */
public class UserController {

    DatabaseJDBC db = new DatabaseJDBC();

    public User loginUser(String username, String password) throws SQLException, ClassNotFoundException {
        User user = null;
        try (Connection conn = db.connect()) {
            java.sql.Statement statement = conn.createStatement();
            String sql = "select * from user where username like '"+username+"' and password like '"+password+"'";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                user = new User();                
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                break;
            }
            conn.close();
        } catch (Exception e) {
        }
        return user;
    }
    
    public void  addUser(User user){
        try (Connection conn = db.connect()){
            String sql = "insert into user values (null, '"+user.getUsername()+"', '"+user.getPassword()+"')";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            System.out.println("Add user is susscess");            
        } catch (Exception e) {
        }
    }
}
