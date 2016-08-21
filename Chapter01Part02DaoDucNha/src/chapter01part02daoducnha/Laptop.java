/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01part02daoducnha;

/**
 *
 * @author NHA
 */
public class Laptop extends Computer {

    double weight;
    int timePin;
    int sizeScreem;

    public Laptop() {
    }

    public Laptop(double weight, int timePin, int sizeScreem, String numSign, double price, String production, int count) {
        super(numSign, price, production, count);
        this.weight = weight;
        this.timePin = timePin;
        this.sizeScreem = sizeScreem;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTimePin() {
        return timePin;
    }

    public void setTimePin(int timePin) {
        this.timePin = timePin;
    }

    public int getSizeScreem() {
        return sizeScreem;
    }

    public void setSizeScreem(int sizeScreem) {
        this.sizeScreem = sizeScreem;
    }

    public String getNumSign() {
        return numSign;
    }

    public void setNumSign(String numSign) {
        this.numSign = numSign;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return super.toString() + "| Weight: " + weight + "" + "| Time of PIN: " + timePin + "| Size of Screem: " + sizeScreem;
    }
    
}
