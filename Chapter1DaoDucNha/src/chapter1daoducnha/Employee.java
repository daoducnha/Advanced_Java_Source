/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

enum rateTax {

    RATE1(250000), RATE2(500000), RATE3(1200000), RATE4(2800000), RATE5(5000000), RATE6(8400000);
    double rank;

    private rateTax(double rank) {
        this.rank = rank;
    }
    
    public double getRank(){
        return rank;
    }
}

public class Employee {

    final double BASICPAY = 1260000;

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

}
