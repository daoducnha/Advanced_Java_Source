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
public class Computer {

    String numSign;
    double price;
    String production;
    int count;

    public Computer() {
    }

    public Computer(String numSign, double price, String production, int count) {
        this.numSign = numSign;
        this.price = price;
        this.production = production;
        this.count = count;
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
        String info = "num Sign: " + numSign + "| Price: " + price + "| Production" + production + "| Count" + count;
        return info;
    }

    public double calMoney() {
        return price * count;
    }
}
