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
public class MainPointer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, NumberFormatException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            Pointer a = new Pointer();
            Pointer b = new Pointer();

            System.out.println("Input x of A: ");
            int ax = Integer.parseInt(input.readLine());
            a.setX(ax);
            System.out.println("Input y of A: ");
            int ay = Integer.parseInt(input.readLine());
            a.setY(ay);

            System.out.println("Input x of B: ");
            int bx = Integer.parseInt(input.readLine());
            a.setX(bx);
            System.out.println("Input y of B: ");
            int by = Integer.parseInt(input.readLine());
            a.setY(by);

            double dis = a.calDistance(b);
            System.out.println("Distance A and B: " + dis);
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
