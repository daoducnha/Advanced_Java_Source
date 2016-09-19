/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerCD;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class CDController {

    List<CD> listCds = new ArrayList<>();
    Database db = new Database();

    public CD createNewCD() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Name CD: ");
        String name = input.readLine();
        System.out.println("Input Name Singer: ");
        String singer = input.readLine();
        System.out.println("Input number song of CD: ");
        int numberSongs = Integer.parseInt(input.readLine());
        System.out.println("Input price of CD: ");
        double price = Double.parseDouble(input.readLine());
        CD nCd = new CD(name, singer, numberSongs, price);
        return nCd;
    }

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

    public boolean searchCDByID(int id) {
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
        } catch (Exception e) {
        }
        return false;
    }

    public void updateCD(int id) throws IOException {
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
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

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

    public void printListCD() throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            List<CD> l = this.getListCD();
            l.stream().forEach((CD c)->System.out.println(c.toString()));
        } catch (Exception e) {
        }

    }
}
