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
 * @author Dao Duc Nha
 * Date 9/9/2016
 * @version 1.0
 * Class MainCalculate use lambda expressions to calculate Multiplication, Addition, Subtraction, Division of 2 number
 */
public class MainCalculate {

    public static void main(String[] args) throws IOException, ArithmeticException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input number 1: ");
        double num1 = Double.parseDouble(input.readLine());
        System.out.println("Input number 2: ");
        double num2 = Double.parseDouble(input.readLine());

        try {
            Operator operator1 = (x1, x2) -> x1 / x2;
            Operator operator2 = (x1, x2) -> x1 * x2;
            Operator operator3 = (x1, x2) -> x1 + x2;
            Operator operator4 = (x1, x2) -> x1 - x2;
            double div = operator1.operate(num1, num2);
            double mul = operator2.operate(num1, num2);
            double add = operator3.operate(num1, num2);
            double sub = operator4.operate(num1, num2);

            System.out.println("Multiplication:" + mul);
            System.out.println("Addition: " + add);
            System.out.println("Subtraction: " + sub);
            System.out.println("Division: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
