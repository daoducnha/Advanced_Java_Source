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
public class Destop extends Computer{
    String CPU;
    String RAM;

    public Destop() {
    }

    public Destop(String CPU, String RAM, String numSign, double price, String production, int count) {
        super(numSign, price, production, count);
        this.CPU = CPU;
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
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
        return super.toString()+"| CPU: "+CPU+"| RAM: "+RAM;
    }

    
}
