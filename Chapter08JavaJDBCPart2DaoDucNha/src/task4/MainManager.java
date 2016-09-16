/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainManager {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ProductController productController = new ProductController();
        boolean flag = true;
        while (flag == true) {
            System.out.println("1. View list Product");
            System.out.println("2. Add a product");
            System.out.println("3. Exit");
            System.out.println("Please input your choise");
            int choise = Integer.parseInt(input.readLine());
            switch (choise) {
                case 1:
                    productController.viewListProduct();
                    break;
                case 2:
                    Product p = productController.createProduct();                    
                    productController.addProduct(p);
                    break;
            }
        }

    }
}
