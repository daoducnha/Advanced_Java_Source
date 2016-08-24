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
 * @version 1.0 Class class Ship extends vehicle, implement consume, speed;
 */
public class Ship extends Vehicle implements IConsume, ISpeed {

    public double weight;
    public double capacity;
    public double downstreamSpeed;
    public double upstreamSpeed;
    public double fuelConsumptionStart;
    public String fuelType;

    public Ship(double distance, double time, double fuel) {
        super(distance, time, fuel);
    }

    public Ship(double weight, double capacity, double downstreamSpeed, double upstreamSpeed, double fuelConsumptionStart, String fuelType, String name, String manufacturer, String color, String owner, double distance, double time, double fuel) {
        super(name, manufacturer, color, owner, distance, time, fuel);
        this.weight = weight;
        this.capacity = capacity;
        this.downstreamSpeed = downstreamSpeed;
        this.upstreamSpeed = upstreamSpeed;
        this.fuelConsumptionStart = fuelConsumptionStart;
        this.fuelType = fuelType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDownstreamSpeed() {
        return downstreamSpeed;
    }

    public void setDownstreamSpeed(double downstreamSpeed) {
        this.downstreamSpeed = downstreamSpeed;
    }

    public double getUpstreamSpeed() {
        return upstreamSpeed;
    }

    public void setUpstreamSpeed(double upstreamSpeed) {
        this.upstreamSpeed = upstreamSpeed;
    }

    public double getFuelConsumptionStart() {
        return fuelConsumptionStart;
    }

    public void setFuelConsumptionStart(double fuelConsumptionStart) {
        this.fuelConsumptionStart = fuelConsumptionStart;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public double getConsume() {
        return distance / (fuel - fuelConsumptionStart);
    }

    @Override
    public double getSpeed() {
        return (distance / time) + (downstreamSpeed - upstreamSpeed);
    }

    @Override
    public void showInfo() {
        System.out.println("Owner: "+owner);       
        System.out.println("Weight: " + weight);
        System.out.println("Capacity: " + capacity);
        System.out.println("Downstream speed: " + downstreamSpeed);
        System.out.println("Upstream speed: " + upstreamSpeed);
        System.out.println("Fuel consumption start: " + fuelConsumptionStart);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Speed: " + getSpeed());
        System.out.println("Fuel consumption: " + getFuel());
    }

}
