/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_13;

/**
 *
 * @author Dao Duc Nha
 * date 24/8/2016
 * @version 1.0
 * Class EmploySale incude information of Employee Sale
 */
public class EmploySale extends Employee {

    double salaryBusiness;
    double rateSale;

    public EmploySale() {
    }

    public EmploySale(double salaryBusiness, double rateSale, String name, double payRate, int numAppendant, double fringeBenefits) {
        super(name, payRate, numAppendant, fringeBenefits);
        this.salaryBusiness = salaryBusiness;
        this.rateSale = rateSale;
    }

    public double getSalaryBusiness() {
        return salaryBusiness;
    }

    public void setSalaryBusiness(double salaryBusiness) {
        this.salaryBusiness = salaryBusiness;
    }

    public double getRateSale() {
        return rateSale;
    }

    public void setRateSale(double rateSale) {
        this.rateSale = rateSale;
    }

    //calculate Bonus input salaryBusiness, rateSale output bonus
    public double calBonus() {
        double bonus = this.salaryBusiness * this.rateSale;
        return bonus;
    }

    //calculate PersonalIncome input payRate, BASICPAY, Bonus output income
    @Override
    public double calPersonalIncome() {
        double income = payRate * BASICPAY + this.calBonus();
        return income;
    }

    //output infomation of employee Sale 
    @Override
    public String toString() {
        return "Name: " + name + " - Pay Rate: "
                + payRate + " - Number Appendant: " + numAppendant
                + " - Fringe Benefits: " + fringeBenefits
                + " - Salary Business: " + salaryBusiness
                + " - Rate Sale: " + rateSale;
    }

}
