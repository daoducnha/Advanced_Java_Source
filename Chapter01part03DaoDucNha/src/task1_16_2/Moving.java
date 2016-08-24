/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_16_2;

/**
 *
 * @author Dao Duc Nha
 * Date 24/8/2016
 * @version 1.0
 * Class Moving include information of distance, time, fuel consume
 */
public class Moving {
    double distance;
    double time;
    double fuel;

    public Moving(double distance, double time, double fuel) {
        this.distance = distance;
        this.time = time;
        this.fuel = fuel;
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
    
}
