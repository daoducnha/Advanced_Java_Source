/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author NHA
 */
public class MainShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input your choise: Cricle(1) - Square(2) - Rectangle(3)");
        int choise = Integer.parseInt(input.readLine());
        switch (choise) {
            case 1:
                Cricle c = new Cricle();
                System.out.println("Input radius: ");
                int radius = Integer.parseInt(input.readLine());
                c.setR(radius);
                System.out.println("Perimeter: " + c.perimeter());
                System.out.println("Area: " + c.area());
                break;
            case 2:
                Square s = new Square();
                System.out.println("Input length: ");
                int length = Integer.parseInt(input.readLine());
                s.setLength(length);
                System.out.println("Perimeter: " + s.perimeter());
                System.out.println("Area: " + s.area());
                break;
            case 3:
                Rectangle r = new Rectangle();
                System.out.println("Input length: ");
                int len = Integer.parseInt(input.readLine());
                System.out.println("Input width: ");
                int width = Integer.parseInt(input.readLine());
                r.setLength(len);
                r.setWidth(width);
                System.out.println("Perimeter: " + r.perimeter());
                System.out.println("Area: " + r.area());
                break;
            default:
                System.out.println("Choise Wrong!");
                break;
        }
    }

}
