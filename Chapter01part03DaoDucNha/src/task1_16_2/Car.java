/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_16_2;

/**
 *
 * @author Dao Duc Nha
 * @date 24/8/2016
 * @version 1.0 
 * Class class Car extends vehicle, implement consume, speed;
 */
public class Car extends Vehicle implements IConsume, ISpeed {

    public String gearType;
    public String carType;

    public Car(double distance, double time, double fuel) {
        super(distance, time, fuel);
    }

    public Car(String gearType, String carType, String name, String manufacturer, String color, String owner, double distance, double time, double fuel) {
        super(name, manufacturer, color, owner, distance, time, fuel);
        this.gearType = gearType;
        this.carType = carType;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    //show info of car
    @Override
    public void showInfo() {
        System.out.println("Owner: "+owner);
        System.out.println("carType: "+carType);
        System.out.println("Gear type: " + gearType);
        System.out.println("Car type: " + carType);
        System.out.println("Speed: " + getSpeed());
        System.out.println("Fuel consumption: " + getFuel());
    }

    //calculate consume fuel of car
    @Override
    public double getConsume() {
        return distance / fuel;
    }

    //calculate speed fuel of car
    @Override
    public double getSpeed() {
        return distance / time;
    }
}
