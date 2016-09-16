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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class ProductController {

    Database db = new Database();

    public void viewListProduct() {
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
            listProduct.stream().forEach((Product p) -> System.out.println(p.toString()));
        } catch (Exception e) {
        }

    }

    //String sql = "insert into product values (null, '"+product.getName()+"', "+product.getPrice()+","+product.getAmount()+", 'butbi.jpg',"+product.getCategoryId()+", '2015-11-07', 1);";
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
            if (listCat.contains(product.getCategoryId())) {
                String sql1 = "insert into product values (null, '" + product.getName()
                        + "', " + product.getPrice() + "," + product.getAmount() + ", 'butbi.jpg',"
                        + product.getCategoryId() + ", '2015-11-07', 1);";
                PreparedStatement statement = conn.prepareStatement(sql1);
                statement.execute();
                System.out.println("Add product susscess!!!");
            }else {
                System.out.println("not found category!!!");
            }

        } catch (Exception e) {
            System.out.println("");
        }
    }

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
}
