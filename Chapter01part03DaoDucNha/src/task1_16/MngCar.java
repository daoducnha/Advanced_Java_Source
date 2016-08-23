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
public class MngCar implements ManageCar {

    Car[] car;

    public MngCar(Car[] car) {
        this.car = car;
    }

    @Override
    public boolean addCar(Car c) {
        for (int i = 0; i < car.length; i++) {
            if (car[i] == null) {
                car[i] = c;
                return true;
            }
        }
        return false;
    }
 
    

    @Override
    public void outputArrCar() {
        for (Car values : car) {
            if(values!=null)
                System.out.println("ID: "+values.getId()+ " - Velocity: "+values.calVelocity()+" - Consume: "+values.calConsume());
        }
    }

    @Override
    public Car inputInfoCar(double distance, double time, double fuel, String id, String color, String Publisher) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choise Gear Box: Aotu-gear (1), Gear(2)");
        int gearBox = Integer.parseInt(input.readLine());
        System.out.println("Input Car Type: ");
        String typeCar = input.readLine();
        
        Car c = new Car();
        c.setColor(color);
        c.setDistance(gearBox);
        c.setFuel(fuel);
        c.setGearBox(gearBox);
        c.setId(id);
        c.setTime(time);
        c.setTypeCar(typeCar);
        c.setPublisher(Publisher);
        return c;
    }

}
