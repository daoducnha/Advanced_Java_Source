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
 * @version 1.0 Class for Ship
 */
public class Ship extends MeansOfTransport {

    double weight;
    double burden;
    double upStream;
    double downStream;
    double consumeFuel;
    String typeFuel;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBurden() {
        return burden;
    }

    public void setBurden(double burden) {
        this.burden = burden;
    }

    public double getUpStream() {
        return upStream;
    }

    public void setUpStream(double upStream) {
        this.upStream = upStream;
    }

    public double getDownStream() {
        return downStream;
    }

    public void setDownStream(double downStream) {
        this.downStream = downStream;
    }

    public double getConsumeFuel() {
        return consumeFuel;
    }

    public void setConsumeFuel(double consumeFuel) {
        this.consumeFuel = consumeFuel;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
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
        double velocity = distance / time + upStream - downStream;
        return velocity;
    }

    @Override
    double calConsume() {
        double consume = distance / (fuel - consumeFuel);
        return consume;
    }

}
