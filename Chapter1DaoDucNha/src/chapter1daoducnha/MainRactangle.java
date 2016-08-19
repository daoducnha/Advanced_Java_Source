/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainRactangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input x of A: ");
        int ax = Integer.parseInt(input.readLine());

        System.out.println("Input y of A: ");
        int ay = Integer.parseInt(input.readLine());

        System.out.println("Input x of C: ");
        int cx = Integer.parseInt(input.readLine());

        System.out.println("Input y of C: ");
        int cy = Integer.parseInt(input.readLine());

        Pointer a = new Pointer(ax, ay);
        Pointer c = new Pointer(cx, cy);
        if (a != c) {
            if (ax != cx && ay != cy) {
                Rectangle rtg = new Rectangle(a, c);
                System.out.println("Perimeter is: " + rtg.calPerimeter());
                System.out.println("Area is: " + rtg.calArea());
            } else {
                System.out.println("Not Retangle");
            }
        } else {
            System.out.println("Not Retangle");
        }

    }

}
