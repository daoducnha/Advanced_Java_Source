/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_16_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainVehicle {

    public static void main(String[] args) throws IOException {
        Car[] car = new Car[100];
        Ship[] ship = new Ship[100];

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int j = 0;
        boolean flag = true;
        while (flag == true) {
            System.out.println("do you want add a vehicle? y/n");
            String yorn = input.readLine();
            if (yorn.equalsIgnoreCase("n")) {
                flag = false;
            } else if (yorn.equalsIgnoreCase("y")) {
                System.out.println("Input information of Transport");
                System.out.println("Input id:");
                String id = input.readLine();
                System.out.println("Input owner:");
                String owner = input.readLine();;
                System.out.println("Input color:");
                String color = input.readLine();
                System.out.println("Input manufacturer:");
                String manufacturer = input.readLine();
                System.out.println("Input distance:");
                double distance = Double.parseDouble(input.readLine());
                System.out.println("Input time:");
                double time = Double.parseDouble(input.readLine());
                System.out.println("Input number liter of fuel");
                double numberLiterFuel = Double.parseDouble(input.readLine());

                System.out.println("1/Car\n2/Ship");
                int choose = Integer.parseInt(input.readLine());
                if (choose == 1) {
                    System.out.println("Input gear type: Auto(1) or Gear(2)");
                    String gearType = input.readLine();
                    System.out.println("Input car type:");
                    String carType = input.readLine();
                    car[i] = new Car(gearType, carType, owner, manufacturer, color, owner, distance, time, time);
                } else if (choose == 2) {
                    System.out.println("Input weight:");
                    double weight = Double.parseDouble(input.readLine());
                    System.out.println("Input capacity:");
                    double capacity = Double.parseDouble(input.readLine());
                    System.out.println("Input downstream speed:");
                    double downstreamSpeed = Double.parseDouble(input.readLine());
                    System.out.println("Input upstream speed:");
                    double upstreamSpeed = Double.parseDouble(input.readLine());
                    System.out.println("Input fuel consumption start:");
                    double fuelConsumptionStart = Double.parseDouble(input.readLine());
                    System.out.println("Input fuel type:");
                    String fuelType = input.readLine();
                    ship[j] = new Ship(weight, capacity, downstreamSpeed, upstreamSpeed, fuelConsumptionStart, fuelType, owner, manufacturer, color, owner, distance, time, time);
                    j++;
                } else {
                    System.out.println("Choise 1 or 2");
                }

            } else {
                System.out.println("chosie Y or N");
            }
        }

        for (Car values : car) {
            if (values != null) {
                values.showInfo();
                System.out.println("========================");
            }
        }

        for (Ship values : ship) {
            if(values!=null){
                values.showInfo();
                System.out.println("========================");
            }
        }
    }
}
