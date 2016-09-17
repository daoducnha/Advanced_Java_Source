/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

import com.mysql.jdbc.Connection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NHA
 */
public class ProductController {

    Database db = new Database();

    public void transection1() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
            conn = db.connect();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String s = dateFormat.format(date);
            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            String sql = "insert into product values (null, 'Strawbrrey Cookies', 45000, 50, 'strawbrreyCookies.jpg', 4, '" + s + "',1)";
            statement.executeUpdate(sql);
            sql = "update product set price = 45000, amount =  50 where id = 1";
            statement.executeUpdate(sql);
            sql = "delete from product where id = 19";
            statement.executeUpdate(sql);
            conn.commit();
            conn.close();
            System.out.println("transection 1 susscess");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

            conn.rollback();
            System.out.println("comit wrong");
        }
    }

    public void transection2() throws SQLException , IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Connection conn = null;
        try {
            conn = db.connect();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String s = dateFormat.format(date);
            String nameProduct = input.readLine();
            while (nameProduct.length()<150) {
                System.out.println("Input name length >= 150 character: ");
                nameProduct=input.readLine();
                
            }
            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            String sql = "insert into product values (null, '"+nameProduct+"', 45000, 50, 'strawbrreycookies.jpg', 1, '" + s + "',1)";
            statement.executeUpdate(sql);
            sql = "update product set price = 125000, amount =  45 where id = 13";
            statement.executeUpdate(sql);
            sql = "delete from product where id = 24";
            statement.executeUpdate(sql);
            conn.commit();
            conn.close();
            System.out.println("transection 2 susscess");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

            conn.rollback();
            System.out.println("comit wrong");
        }
    }
    
    public void transection3() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
            conn = db.connect();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String s = dateFormat.format(date);
            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            String sql = "insert into product values (null, 'Strawbrrey Cookies', 45000, 50, 'strawbrreyCookies.jpg', 4, '" + s + "',0)";
            statement.executeUpdate(sql);
            sql = "delete from product where id = 10";
            statement.executeUpdate(sql);
            conn.commit();
            sql = "update product set price = 5000, amount =  50 where id = 10";
            statement.executeUpdate(sql);
            conn.commit();
            
            System.out.println("transection 1 susscess");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

            conn.rollback();
            System.out.println("comit wrong");
        }
    }
}
