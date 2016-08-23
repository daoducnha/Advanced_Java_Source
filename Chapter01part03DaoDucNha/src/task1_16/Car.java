/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_16;

/**
 *
 * @author Dao Duc Nha
 * @date 23/8/2016
 * @version 1.0
 * Class  for Car
 */
public class Car extends MeansOfTransport {

    int gearBox;
    String typeCar;

    public int getGearBox() {
        return gearBox;
    }

    public void setGearBox(int gearBox) {
        this.gearBox = gearBox;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    @Override
    double calVelocity() {
        double velocity = distance / time;
        return velocity;
    }

    @Override
    double calConsume() {
        double consume = distance / fuel;
        return consume;
    }

}
