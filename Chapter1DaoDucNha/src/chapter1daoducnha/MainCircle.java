/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.imageio.IIOException;

/**
 *
 * @author hv
 */
public class MainCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, NumberFormatException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            Circle c = new Circle();
            Pointer o = new Pointer();
            Pointer r = new Pointer();
            System.out.println("Input x of O: ");
            int ox = Integer.parseInt(input.readLine());
            System.out.println("Input y of O: ");
            int oy = Integer.parseInt(input.readLine());
            System.out.println("Input x of R: ");
            int rx = Integer.parseInt(input.readLine());
            System.out.println("Input y of R: ");
            int ry = Integer.parseInt(input.readLine());

            o.setX(ox);
            o.setY(oy);
            r.setX(rx);
            r.setY(ry);
            
            c.setO(o);
            c.setR(r);

            double cir = c.calCircumference();
            double ar = c.calArea();

            System.out.println("Circumference is: " + cir);
            System.out.println("Area is: " + ar);
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
