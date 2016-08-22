/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_9;

import task1_9.Laptop;
import task1_9.Destop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author NHA
 */
public class ManageComputer {

    Destop[] d;
    Laptop[] l;

    public ManageComputer(Destop[] d, Laptop[] l) {
        this.d = d;
        this.l = l;
    }

    public ManageComputer() {
    }

    public Destop[] getD() {
        return d;
    }

    public void setD(Destop[] d) {
        this.d = d;
    }

    public Laptop[] getL() {
        return l;
    }

    public void setL(Laptop[] l) {
        this.l = l;
    }
    //String CPU, String RAM, String numSign, double price, String production, int count) {

    public Destop inputInfoDes() throws IOException, NumberFormatException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input num Sign: ");
            String num = input.readLine();
            System.out.println("Input price: ");
            double price = Double.parseDouble(input.readLine());
            System.out.println("Input production: ");
            String production = input.readLine();
            System.out.println("input CPU: ");
            String cpu = input.readLine();
            System.out.println("Input Ram: ");
            String ram = input.readLine();
            System.out.println("Input count: ");
            int count = Integer.parseInt(input.readLine());

            Destop d = new Destop(cpu, ram, num, price, production, count);
            return d;
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
//double weight, int timePin, int sizeScreem, String numSign, double price, String production, int count

    public Laptop inputInfoLap() throws IOException, NumberFormatException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input num Sign: ");
            String num = input.readLine();
            System.out.println("Input price: ");
            double price = Double.parseDouble(input.readLine());
            System.out.println("Input production: ");
            String production = input.readLine();
            System.out.println("input Weight: ");
            double weight = Double.parseDouble(input.readLine());
            System.out.println("input time of PIN: ");
            int time = Integer.parseInt(input.readLine());
            System.out.println("Input size of screem: ");
            int size = Integer.parseInt(input.readLine());
            System.out.println("Input count: ");
            int count = Integer.parseInt(input.readLine());

            Laptop l = new Laptop(weight, time, size, num, price, production, count);
            return l;
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    public boolean addDestop(Destop dt) {
        for (int i = 0; i < d.length; i++) {
            if (d[i] == null) {
                d[i] = dt;
                return true;
            }
        }
        return false;
    }

    public boolean addLaptop(Laptop lt) {
        for (int i = 0; i < l.length; i++) {
            if (l[i] == null) {
                l[i] = lt;
                return true;
            }
        }
        return false;
    }
    
    public double calMoneyOfDestop(){
        double money = 0;
        for (int i = 0; i < d.length; i++) {
            money+=d[i].count*d[i].price;
        }
        return money;
    }
    
    public double calMoneyOfLaptop(){
        double money = 0;
        for (int i = 0; i < l.length; i++) {
            money+=l[i].price*l[i].count;
        }
        return money;
    }
    public void printArrDes(){
        for (int i = 0; i < d.length; i++) {
            if(d[i]!=null)
                System.out.println(d[i].toString());
        }
    }
    public void printArrLap(){
        for (int i = 0; i < l.length; i++) {
            if(l[i]!=null){
                System.out.println(l[i].toString());
            }
        }
    }
}
