/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import com.mysql.jdbc.Connection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 9-2016
 * Class ProductController to manager product
 */
public class ProductController {

    Database db = new Database();

    // get list product form database
    public List<Product> getListProduct() {
        List<Product> listProduct = null;
        try (Connection conn = db.connect()) {
            listProduct = new ArrayList<>();
            java.sql.Statement statement = conn.createStatement();
            String sql = "SELECT * FROM `product`";
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()) {
                Product p = new Product();
                p.setId(resultset.getInt("id"));
                p.setName(resultset.getString("name"));
                p.setPrice(resultset.getDouble("price"));
                p.setAmount(resultset.getInt("amount"));
                p.setCategoryId(resultset.getInt("categoryId"));
                listProduct.add(p);
            }
            conn.close();
            return listProduct;
        } catch (Exception e) {
        }
        return listProduct;
    }

    //Add a product to database
    public void addProduct(Product product) {
        try (Connection conn = db.connect()) {
            java.sql.Statement statementa = conn.createStatement();
            List<Integer> listCat = new ArrayList<>();
            String sql = "SELECT id FROM `category`";

            ResultSet resultSet = statementa.executeQuery(sql);
            while (resultSet.next()) {
                int idCat = resultSet.getInt("id");
                listCat.add(idCat);
            }
            conn.close();
            if (listCat.contains(product.getCategoryId())) {
                String sql1 = "insert into product values (null, '" + product.getName()
                        + "', " + product.getPrice() + "," + product.getAmount() + ", 'butbi.jpg',"
                        + product.getCategoryId() + ", '2015-11-07', 1);";
                PreparedStatement statement = conn.prepareStatement(sql1);
                statement.execute();
                System.out.println("Add product susscess!!!");
            } else {
                System.out.println("not found category!!!");
            }

        } catch (Exception e) {
            System.out.println("");
        }
    }

    //Create a product and return a product
    public Product createProduct() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Product p = new Product();
        System.out.println("Input Name Product: ");
        String name = input.readLine();
        System.out.println("Input Price Product");
        double price = Double.parseDouble(input.readLine());
        System.out.println("Input Amount Product");
        int amount = Integer.parseInt(input.readLine());
        System.out.println("Input categoryId Product");
        int categoryId = Integer.parseInt(input.readLine());

        p = new Product(name, price, amount, categoryId);
        return p;
    }

    //search product by name and return list product have name like 
    public List<Product> searchProduct(String nameProduct) throws SQLException, ClassNotFoundException {
        List<Product> rs;

        try (Connection conn = db.connect()) {
            rs = new ArrayList<>();
            java.sql.Statement statement = conn.createStatement();
            String sql = "select * from product where name like '%" + nameProduct + "%'";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Product p = new Product();
                p.setId(resultSet.getInt("id"));
                p.setName(resultSet.getString("name"));
                p.setPrice(resultSet.getDouble("price"));
                p.setAmount(resultSet.getInt("amount"));
                p.setCategoryId(resultSet.getInt("categoryId"));
                rs.add(p);
            }
            conn.close();
            return rs;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
    //delete a product by id
    public void deleteProduct(int id) throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            List<Product> lpProducts = this.getListProduct();
            List<Product> l = lpProducts.stream().filter((Product prd) -> prd.getId() == id).collect(Collectors.toList());
            if (l.size() > 0) {
                String sql = "delete from product where id = '" + id + "'";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.execute();
                System.out.println("Delete a product is susscess");
            } else {
                System.out.println("cannot found product");
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Sreach a product by id and return a product if product is exist
    public Product searchByID(int id) throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            Product p = null;
            Statement statement = conn.createStatement();
            String s = "select * from product";

            ResultSet resultSet = statement.executeQuery(s);
            while (resultSet.next()) {
                if (resultSet.getInt("id") == id) {
                    p = new Product();
                    p.setId(resultSet.getInt("id"));
                    p.setName(resultSet.getString("name"));
                    p.setPrice(resultSet.getDouble("price"));
                    p.setAmount(resultSet.getInt("amount"));
                    p.setCategoryId(resultSet.getInt("categoryId"));
                }
            }
            conn.close();
            return p;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    //Update pricet and a mout a product 
    public void updateProduct(Product p) throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            String sql = "update product set price = " + p.getPrice() + ", amount = " + p.getAmount() + " where id = " + p.id;
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
