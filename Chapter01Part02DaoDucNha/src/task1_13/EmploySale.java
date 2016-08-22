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
public class EmploySale extends Employee{
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

    
    public double calBonus(){
        double bonus = this.salaryBusiness*this.rateSale;
        return bonus;
    }

    @Override
    public double calPersonalIncome() {
        double income =  super.calPersonalIncome() + this.calBonus();
        return income;
    }
    
}
