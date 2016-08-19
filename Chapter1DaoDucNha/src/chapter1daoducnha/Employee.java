/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

import jdk.nashorn.internal.codegen.CompilerConstants;

enum rateTax {

    RATE1(5000000), RATE2(10000000), RATE3(18000000), RATE4(32000000), RATE5(52000000), RATE6(80000000);
    double rank;

    private rateTax(double rank) {
        this.rank = rank;
    }

    public double getRank() {
        return rank;
    }
}

public class Employee {

    final double BASICPAY = 1260000;
    final double SALARYMOTH = 9000000;
    final double PEOPLE = 3600000;
    String name;
    double payRate;
    int numAppendant;
    double fringeBenefits;

    public Employee() {
    }

    public Employee(String name, double payRate, int numAppendant, double fringeBenefits) {
        this.name = name;
        this.payRate = payRate;
        this.numAppendant = numAppendant;
        this.fringeBenefits = fringeBenefits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getNumAppendant() {
        return numAppendant;
    }

    public void setNumAppendant(int numAppendant) {
        this.numAppendant = numAppendant;
    }

    public double getFringeBenefits() {
        return fringeBenefits;
    }

    public void setFringeBenefits(double fringeBenefits) {
        this.fringeBenefits = fringeBenefits;
    }

    public double calPersonalIncome() {
        double income = payRate * BASICPAY + fringeBenefits;
        return income;
    }

    public double calTaxIncome() {
        if (this.calPersonalIncome() > SALARYMOTH) {
            double taxIncome = this.calPersonalIncome() - SALARYMOTH - numAppendant * PEOPLE;
            return taxIncome;
        } else {
            return 0;
        }
    }

    public double calTaxPersionnal() {

        double taxP;
        double taxI = this.calTaxIncome();
        if (taxI > rateTax.RATE6.getRank()) {
            taxP = (taxI - rateTax.RATE6.rank) * 0.35 + rateTax.RATE5.getRank() * 0.3
                    + rateTax.RATE4.getRank() * 0.25 + rateTax.RATE3.getRank() * 0.2
                    + rateTax.RATE2.getRank() * 0.15 + rateTax.RATE1.getRank() * 0.1 + rateTax.RATE1.getRank() * 0.05;
        } else if (taxI > rateTax.RATE5.getRank()) {
            taxP = (taxI - rateTax.RATE5.getRank()) * 0.3 + rateTax.RATE4.getRank() * 0.25
                    + rateTax.RATE3.getRank() * 0.2 + rateTax.RATE2.getRank() * 0.15
                    + rateTax.RATE1.getRank() * 0.1 + rateTax.RATE1.getRank() * 0.05;
        } else if (taxI > rateTax.RATE4.getRank()) {
            taxP = (taxI - rateTax.RATE4.getRank()) * 0.25 + rateTax.RATE3.getRank() * 0.2
                    + rateTax.RATE2.getRank() * 0.15 + rateTax.RATE1.getRank() * 0.1 + rateTax.RATE1.getRank() * 0.05;
        } else if (taxI > rateTax.RATE3.getRank()) {
            taxP = (taxI - rateTax.RATE3.getRank()) * 0.2 + rateTax.RATE2.getRank() * 0.15
                    + rateTax.RATE1.getRank() * 0.1 + rateTax.RATE1.getRank() * 0.05;
        } else if (taxI > rateTax.RATE2.getRank()) {
            taxP = (taxI - rateTax.RATE2.getRank()) * 0.15 + rateTax.RATE1.getRank() * 0.1;
        } else if (taxI > rateTax.RATE1.getRank()) {
            taxP = (taxI - rateTax.RATE1.getRank()) * 0.1 + rateTax.RATE1.getRank() * 0.05;
        } else {
            taxP = taxI * 0.05;
        }
        return taxP;
    }

    public double calRealIncome() {
        double real = this.calPersonalIncome() - this.calTaxPersionnal();
        return real;
    }
}
