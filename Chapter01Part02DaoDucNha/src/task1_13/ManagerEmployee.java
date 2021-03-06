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
 * @author Dao Duc Nha
 * date 24/8/2016
 * @version 1.0
 * Class ManagerEmployee for manage employee sale and produce
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

    //input information of InfoEmply Sale output a new EmplySale
    public EmploySale inputInfoEmplySale(String name, double payRate, int numAppendant, double fringeBenefits) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Salary Business: ");
        double salaryBusiness = Double.parseDouble(input.readLine());
        System.out.println("Input Rate Sale: ");
        double rateSale = Double.parseDouble(input.readLine());
        EmploySale newS = new EmploySale(salaryBusiness, rateSale, name, payRate, numAppendant, fringeBenefits);
        return newS;
    }

    //input information of Emplyee Produce output a new EmplyeeProduce
    public EmplyeeProduce inputInfoEmplyeeProduce(String name, double payRate, int numAppendant, double fringeBenefits) throws IOException, NumberFormatException {
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

    //output infomation array Employ sale 
    public void outputArrEmploySale() {
        for (EmploySale values : employSales) {
            if (values != null) {
                System.out.println(values.toString());
                System.out.println("Personal Income: " + String.format("%f", values.calPersonalIncome()));
                System.out.println("Tax Income: " + String.format("%f", values.calTaxIncome()));
                System.out.println("Tax Persionnal Income: " + String.format("%f", values.calTaxPersionnal()));
                System.out.println("Real Income: " + String.format("%f", values.calRealIncome()));
                System.out.println("----------------------------------------------------");
            }
        }
    }

    //output infomation array Employ produce
    public void outputArrEmployProduce() {
        for (int i = 0; i < emplyeeProduces.length; i++) {
            if (emplyeeProduces[i] != null) {
                System.out.println(emplyeeProduces[i].toString());
                System.out.println("Personal Income: " + String.format("%f", emplyeeProduces[i].calPersonalIncome()));
                System.out.println("Tax Income: " + String.format("%f", emplyeeProduces[i].calTaxIncome()));
                System.out.println("Tax Persionnal Income: " + String.format("%f", emplyeeProduces[i].calTaxPersionnal()));
                System.out.println("Real Income: " + String.format("%f", emplyeeProduces[i].calRealIncome()));
                System.out.println("-----------------------------------------------");
            }
        }
    }

    //add a EmploySale into array EmploySale
    public boolean addEmploySale(EmploySale newS) {
        for (int i = 0; i < employSales.length; i++) {
            if (employSales[i] == null) {
                employSales[i] = newS;
                return true;
            }
        }
        return false;
    }

    //add a Employproduce into array Employproduce
    public boolean addEmplyeeProduce(EmplyeeProduce newP) {
        for (int i = 0; i < emplyeeProduces.length; i++) {
            if (emplyeeProduces[i] != null) {
                emplyeeProduces[i] = newP;
                return true;
            }
        }
        return false;
    }
}
