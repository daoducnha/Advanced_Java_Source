/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainMeanOfTransport {

    public static void main(String[] args) throws IOException {
        Car[] car = new Car[100];
        Ship[] ship = new Ship[100];
        MngCar mCar = new MngCar(car);
        MngShip mShip = new MngShip(ship);

        boolean flag = true;

        while (flag == true) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("do you want add new Mean of transport? y/n");
            String yRrN = input.readLine();
            if (yRrN.equalsIgnoreCase("n")) {
                flag = false;
            } else if (yRrN.equalsIgnoreCase("y")) {
                System.out.println("Input Distance: ");
                double distanc = Double.parseDouble(input.readLine());
                System.out.println("Input time moving(h):");
                double time = Double.parseDouble(input.readLine());
                System.out.println("Input fuel: ");
                double fuel = Double.parseDouble(input.readLine());
                System.out.println("Input Id: ");
                String id = input.readLine();
                System.out.println("Input color: ");
                String color = input.readLine();
                System.out.println("Input Publisher: ");
                String Publisher = input.readLine();
                System.out.println("Choise Car(1) or Ship(2)");
                int choiseType = Integer.parseInt(input.readLine());
                if (choiseType == 1) {
                    Car newC = mCar.inputInfoCar(distanc, time, fuel, id, color, Publisher);
                    mCar.addCar(newC);
                    mCar.outputArrCar();
                } else if (choiseType == 2) {
                    Ship newS = mShip.inputInfoShip(distanc, time, fuel, id, color, Publisher);
                    mShip.addShip(newS);
                    mShip.outputArrShip();
                } else {
                    System.out.println("Choise Wrong");
                }
            } else {
                System.out.println("Choise wrong!");
            }

        }
    }
}
