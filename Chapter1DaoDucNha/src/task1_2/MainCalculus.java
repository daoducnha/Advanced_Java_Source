/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainCalculus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, NumberFormatException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            Calculate cal = new Calculate();
            System.out.println("Input number 1: ");
            int num1 = Integer.parseInt(input.readLine());
            cal.setNum1(num1);
            System.out.println("Input number 2: ");
            int num2 = Integer.parseInt(input.readLine());
            cal.setNum2(num2);

            System.out.println("Addition: " + cal.addition());
            System.out.println("Subtraction: " + cal.subtraction());
            System.out.println("Multiplication: " + cal.multiplication());
            if (cal.num2 != 0) {
                System.out.println("Division: " + cal.division());
            } else {
                System.out.println("Division Error: / by zero");
            }
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
