/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4ToTask6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 9-2016
 * Class MainManager to manager list product
 */
public class MainManager {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ProductController productController = new ProductController();
        List<Product> lpProducts = new ArrayList<>();
        boolean flag = true;
        while (flag == true) {
            System.out.println("1. View list Product");
            System.out.println("2. Add a product");
            System.out.println("3. Search a product");
            System.out.println("4. update a product");
            System.out.println("5. delete a product");
            System.out.println("Please input your choise");
            int choise = Integer.parseInt(input.readLine());
            switch (choise) {
                case 1:
                    lpProducts = productController.getListProduct();
                    if (lpProducts != null) {
                        lpProducts.stream().forEach((Product p) -> System.out.println(p.toString()));
                    }
                    break;
                case 2:
                    Product p = productController.createProduct();
                    productController.addProduct(p);
                    break;
                case 3:
                    System.out.println("Input name product want search: ");
                    String nameP = input.readLine();
                    List<Product> listSearch = productController.searchProduct(nameP);
                    if (listSearch.size() > 0) {
                        listSearch.stream().forEach((Product pp) -> System.out.println(pp.toString()));
                    } else {
                        System.out.println("cannot find product!!!");
                    }
                    break;
                case 4:
                    lpProducts = productController.getListProduct();
                    lpProducts.stream().forEach((Product product) -> System.out.println(product.toString()));
                    
                    System.out.println("Input Id product you want update: ");
                    int id = Integer.parseInt(input.readLine());
                    
                    Product product = productController.searchByID(id);
                    
                    if (product != null) {
                        System.out.println("Input new Price: ");
                        Double price = Double.parseDouble(input.readLine());
                        System.out.println("Input new amount: ");
                        int amount = Integer.parseInt(input.readLine());
                        product.setPrice(price);
                        product.setAmount(amount);
                        productController.updateProduct(product);

                        System.out.println("Update susscess");
                    } else {
                        System.out.println("cannot find product");
                    }
                    break;
                case 5:
                    System.out.println("Input id product want delete: ");
                    int idd = Integer.parseInt(input.readLine());
                    productController.deleteProduct(idd);
                    break;
            }
        }

    }
}
