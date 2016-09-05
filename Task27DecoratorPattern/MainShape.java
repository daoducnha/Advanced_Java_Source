/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27DecoratorPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dao Duc Nha date 9/5/2016
 * @version 1.0 Class main of Shape
 */
public class MainShape {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ShapeDecorator sd = null;
        System.out.println("Please choise Shape: Circle(1) - Retangle(2)");
        int choise = Integer.parseInt(input.readLine());

        if (choise == 1) {
            Circle c = new Circle();
            sd = new RedShapeDecorator(c);
        } else if (choise == 2) {
            Retangle r = new Retangle();
            sd = new RedShapeDecorator(r);
        }
        System.out.println("Do you want decorator shape?y/n");
        String choiseD = input.readLine();

        if (choiseD.equalsIgnoreCase("y")) {
            System.out.println(sd.draw());
        } else if (choiseD.equalsIgnoreCase("n")) {
            System.out.println(sd.shape.draw() + " with normal border");
        }
    }

}
