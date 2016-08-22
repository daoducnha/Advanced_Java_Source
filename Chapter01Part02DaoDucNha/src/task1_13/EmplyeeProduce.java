/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_13;

/**
 *
 * @author hv
 */
public class EmplyeeProduce extends Employee {

    int norm;
    int amount;
    double rateBonus;

    public EmplyeeProduce() {
    }

    public EmplyeeProduce(int norm, int amount, double rateBonus, String name, double payRate, int numAppendant, double fringeBenefits) {
        super(name, payRate, numAppendant, fringeBenefits);
        this.norm = norm;
        this.amount = amount;
        this.rateBonus = rateBonus;
    }

    public int getNorm() {
        return norm;
    }

    public void setNorm(int norm) {
        this.norm = norm;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getRateBonus() {
        return rateBonus;
    }

    public void setRateBonus(double rateBonus) {
        this.rateBonus = rateBonus;
    }

    public double calBonus() {
        double bonus = (amount - norm) * rateBonus;
        return bonus;
    }

    @Override
    public double calPersonalIncome() {
        double income = super.calPersonalIncome() + this.calBonus();
        return income;
    }

    @Override
    public String toString() {
        return "Name: " + name + " - Pay Rate: " + payRate + " - Number Appendant: "
                + numAppendant + " - Fringe Benefits: " + fringeBenefits + " - Norms: "
                + norm + " - Amount: " + amount + "Rate Bonus: " + rateBonus
                + " - Bonus: " + calBonus();
    }

}
