/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerCD;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 19-9-2016 Class CDController to manager list cd
 */
public class CDController {

    List<CD> listCds = new ArrayList<>();
    Database db = new Database();

    //Create new cd output a new cd
    public CD createNewCD() throws IOException, NumberFormatException {
        CD nCd = new CD();
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input Name CD: ");
            String name = input.readLine();
            System.out.println("Input Name Singer: ");
            String singer = input.readLine();
            System.out.println("Input number song of CD: ");
            int numberSongs = Integer.parseInt(input.readLine());
            System.out.println("Input price of CD: ");
            double price = Double.parseDouble(input.readLine());
            nCd = new CD(name, singer, numberSongs, price);
            return nCd;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return nCd;
    }

    //Add a cd to SQL file
    public void addNewCD(CD c) throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            String sql = "insert into cd values (null, '" + c.getName()
                    + "', '" + c.getSinger() + "', " + c.getNumberSongs()
                    + ", " + c.getPrice() + ");";
            PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.execute();
            System.out.println("Add a new CD susscess!!!");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Eror: " + ex.getMessage());
        }
    }

    //return list cd from sql file
    public List<CD> getListCD() throws SQLException, ClassNotFoundException {
        List<CD> lsCd = null;
        try (Connection conn = db.connect()) {
            lsCd = new ArrayList<>();
            java.sql.Statement statement = conn.createStatement();
            String sql = "SELECT * FROM `cd`";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                CD cd = new CD();
                cd.setId(resultSet.getInt("id"));
                cd.setName(resultSet.getString("name"));
                cd.setSinger(resultSet.getString("singer"));
                cd.setNumberSongs(resultSet.getInt("numbersongs"));
                cd.setPrice(resultSet.getDouble("price"));
                lsCd.add(cd);
            }
            conn.close();

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lsCd;
    }

    //Search cd by name and output list cd have name like
    public void searchCD(String name) throws IOException, NumberFormatException, SQLException, ClassNotFoundException {
        List<CD> lCDs;
        try (Connection conn = db.connect()) {
            lCDs = new ArrayList<>();
            java.sql.Statement statement = conn.createStatement();
            String sql = "select * from cd where name like '%" + name + "%';";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                CD cd = new CD();
                cd.setId(resultSet.getInt("id"));
                cd.setName(resultSet.getString("name"));
                cd.setSinger(resultSet.getString("singer"));
                cd.setNumberSongs(resultSet.getInt("numbersongs"));
                cd.setPrice(resultSet.getDouble("price"));
                lCDs.add(cd);
            }
            conn.close();
            lCDs.stream().forEach((CD element) -> System.out.println(element.toString()));
        } catch (NumberFormatException | SQLException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.toString());
        }
    }

    //check list has id want search, return true if has, else return false
    public boolean searchCDByID(int id) throws SQLException, ClassNotFoundException {
        List<Integer> listID = null;
        try (Connection conn = db.connect()) {
            String sql = "select * from cd";
            java.sql.Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                listID = new ArrayList<>();
                listID.add(resultSet.getInt("id"));
            }
            conn.close();
            if (listID.contains(id)) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
        }
        return false;
    }

    //update number song and price of CD by id
    public void updateCD(int id) throws IOException, SQLException, ClassNotFoundException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try (Connection conn = db.connect()) {

            System.out.println("Input new number song of CD: ");
            int newNumberSongs = Integer.parseInt(input.readLine());
            System.out.println("Input new Pricer of CD: ");
            double newPrice = Double.parseDouble(input.readLine());
            String sql = "update cd set  numbersongs = " + newNumberSongs + ", price = " + newPrice + " where id = " + id;

            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            System.out.println("Update susscess!!!");
        } catch (IOException | SQLException | ClassNotFoundException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    //remove  a CD by id
    public void removeCD(int id) throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            String sql = "delete from cd where id = " + id;
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            System.out.println("Remove CD susscess!!!");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    //output list cd in database
    public void printListCD() throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            List<CD> l = this.getListCD();
            l.stream().forEach((CD c) -> System.out.println(c.toString()));
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void addCDToFile() throws IOException, SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            List<CD> list = this.getListCD();
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/managerCD/cd.txt"));
            out.writeInt(list.size());

            for (CD element : list) {
                out.writeObject(element);
                out.flush();
            }
            out.reset();
            out.close();
            System.out.println("Add List Cd from database susscess!!!");
        } catch (IOException | SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void readCDtoFile()throws IOException, ClassNotFoundException{
        
        List<CD> l = new ArrayList<>();
        FileInputStream file = new FileInputStream("src/managerCD/cd.txt");
        if(file.available()!=0){
            ObjectInputStream in = new ObjectInputStream(file);
            int size = in.readInt();
            
            for (int i = 0; i < size; i++) {
                l.add((CD)in.readObject());
            }
            in.close();
            l.stream().forEach((CD cd)->System.out.println(cd.toString()));
        }
    }
}