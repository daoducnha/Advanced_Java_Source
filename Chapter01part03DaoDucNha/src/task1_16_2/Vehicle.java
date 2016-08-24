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
 * Class abstract Vehicle;
 */
public abstract class Vehicle extends Moving{
    String name;
    String manufacturer;
    String color;
    String owner;

    public Vehicle(double distance, double time, double fuel) {
        super(distance, time, fuel);
    }

    public Vehicle(String name, String manufacturer, String color, String owner, double distance, double time, double fuel) {
        super(distance, time, fuel);
        this.name = name;
        this.manufacturer = manufacturer;
        this.color = color;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public abstract void showInfo();    
    
}
