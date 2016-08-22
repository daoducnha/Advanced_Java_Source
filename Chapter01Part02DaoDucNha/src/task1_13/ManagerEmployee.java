/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class ManagerEmployee {
    EmploySale[] employSales;
    EmplyeeProduce[] emplyeeProduces;

    public ManagerEmployee(EmploySale[] employSales, EmplyeeProduce[] emplyeeProduces) {
        this.employSales = employSales;
        this.emplyeeProduces = emplyeeProduces;
    }

    public EmploySale[] getEmploySales() {
        return employSales;
    }

    public void setEmploySales(EmploySale[] employSales) {
        this.employSales = employSales;
    }

    public EmplyeeProduce[] getEmplyeeProduces() {
        return emplyeeProduces;
    }

    public void setEmplyeeProduces(EmplyeeProduce[] emplyeeProduces) {
        this.emplyeeProduces = emplyeeProduces;
    }
    //double salaryBusiness;
    //double rateSale;
    public EmploySale inputInfoEmplySale(String name, double payRate, int numAppendant, double fringeBenefits)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Salary Business: ");
        double salaryBusiness = Double.parseDouble(input.readLine());
        System.out.println("Input Rate Sale: ");
        double rateSale = Double.parseDouble(input.readLine());
        EmploySale newS = new EmploySale(salaryBusiness, rateSale, name, payRate, numAppendant, fringeBenefits);
        return newS;
    }
    
    //int norm;
    //int amount;
    //double rateBonus;
    public EmplyeeProduce inputInfoEmplyeeProduce(String name, double payRate, int numAppendant, double fringeBenefits)throws IOException, NumberFormatException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input norm: ");
        int norm = Integer.parseInt(input.readLine());
        System.out.println("Input amount: ");
        int amount = Integer.parseInt(input.readLine());
        System.out.println("Input Rate Bonus");
        Double rateBonus = Double.parseDouble(input.readLine());
        
        EmplyeeProduce newP = new EmplyeeProduce(norm, amount, rateBonus, name, payRate, numAppendant, fringeBenefits);
        return newP;
    }
    /*
    *
String name;
    double payRate;
    int numAppendant;
    double fringeBenefits;    */
    public void outputArrEmploySale(){
        for (EmploySale values : employSales) {
            if(values!=null)
                System.out.println("Name: "+values.name);
        }
    }
}
