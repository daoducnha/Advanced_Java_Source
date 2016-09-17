/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 *
 * @author NHA
 */
public class MainProduct {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException{
        ProductController productController = new ProductController();
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        boolean flag= true;
        while (flag==true) {            
            System.out.println("1. Transaction 1");
            System.out.println("2. Transaction 2");
            System.out.println("3. Transaction 3");
            System.out.println("Input your choise: ");
            int choise = Integer.parseInt(input.readLine());
            
            switch (choise){
                case 1:
                    productController.transection1();
                    break;
                case 2:
                    productController.transection2();
                    break;
                case 3: 
                    productController.transection3();
                    break;                    
            }
        }
    }
}
