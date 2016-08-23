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
public class MngShip implements ManageShip {

    Ship[] ship;

    public MngShip(Ship[] ship) {
        this.ship = ship;
    }

    
    public Ship[] getShip() {
        return ship;
    }

    public void setShip(Ship[] ship) {
        this.ship = ship;
    }

    @Override
    public boolean addShip(Ship s) {
        for (int i = 0; i < ship.length; i++) {
            if (ship[i] == null) {
                ship[i] = s;
                return true;
            }
        }
        return false;
    }

    @Override
    public Ship inputInfoShip(double distance, double time, double fuel, String id, String color, String Publisher) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input weight: ");
        double weight = Double.parseDouble(input.readLine());
        System.out.println("Input burden: ");
        double burden = Double.parseDouble(input.readLine());
        System.out.println("Input velocity up stream: ");
        double upStream = Double.parseDouble(input.readLine());
        System.out.println("Input velocity down stream: ");
        double downStream = Double.parseDouble(input.readLine());
        System.out.println("Input consume fuel: ");
        double consumeFuel = Double.parseDouble(input.readLine());
        System.out.println("Input type of fuel");
        String typeFuel = input.readLine();
        
        Ship s = new Ship();
        s.setDistance(distance);
        s.setTime(time);
        s.setFuel(fuel);
        s.setId(id);
        s.setColor(color);
        s.setPublisher(Publisher);
        s.setWeight(weight);
        s.setBurden(burden);
        s.setUpStream(upStream);
        s.setDownStream(downStream);
        s.setConsumeFuel(consumeFuel);
        s.setTypeFuel(typeFuel);
        return s;
    }

    @Override
    public void outputArrShip() {
        for (Ship values : ship) {
            if (values != null) {
                System.out.println("ID: "+values.getId()+ " - Velocity: "+values.calVelocity()+" - Consume: "+values.calConsume());
            }
        }
    }

}
