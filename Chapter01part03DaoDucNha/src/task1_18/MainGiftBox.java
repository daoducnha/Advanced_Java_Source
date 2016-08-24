/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dao Duc Nha
 * Date: 24/08/2016
 * @version 1.0
 * Class main for output information a gift box
 */
public class MainGiftBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, NumberFormatException {
        try {
            //Input infomation of gift box
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input Shape: ");
            String shape = input.readLine();
            System.out.println("Input Color: ");
            String color = input.readLine();
            System.out.println("Input name:");
            String name = input.readLine();
            System.out.println("Input Weight:");
            double weight = Double.parseDouble(input.readLine());

            GiftBox gb = new GiftBox(shape, color);
            GiftBox.Gift g = gb.new Gift(name, weight);
            
            //output information a gift
            System.out.println("Information: ");
            System.out.println("Name: " + g.name);
            System.out.println("Shape: " + gb.shape);
            System.out.println("Color: " + gb.Color);
            System.out.println("Weight: " + g.weight);
            System.out.println("Fee: " + g.calFee());
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
