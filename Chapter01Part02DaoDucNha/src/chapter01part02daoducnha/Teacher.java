/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01part02daoducnha;

import java.util.Objects;

/**
 *
 * @author NHA
 */
public class Teacher extends Human {

    final double SALARYBASE = 1260000;
    String classHead;
    double rankSalary;
    double allowance;

    public Teacher() {
    }

    public Teacher(String classHead, double rankSalary, double allowance, String name, String dayOfBirth, String address, String phoneNumber) {
        super(name, dayOfBirth, address, phoneNumber);
        this.classHead = classHead;
        this.rankSalary = rankSalary;
        this.allowance = allowance;
    }

    

    public String getClassHead() {
        return classHead;
    }

    public void setClassHead(String classHead) {
        this.classHead = classHead;
    }

    public double getRankSalary() {
        return rankSalary;
    }

    public void setRankSalary(double rankSalary) {
        this.rankSalary = rankSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double calSalary() {
        double slr = rankSalary * SALARYBASE + allowance;
        return slr;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.SALARYBASE) ^ (Double.doubleToLongBits(this.SALARYBASE) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.classHead);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.rankSalary) ^ (Double.doubleToLongBits(this.rankSalary) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.allowance) ^ (Double.doubleToLongBits(this.allowance) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teacher other = (Teacher) obj;
        if (Double.doubleToLongBits(this.SALARYBASE) != Double.doubleToLongBits(other.SALARYBASE)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rankSalary) != Double.doubleToLongBits(other.rankSalary)) {
            return false;
        }
        if (Double.doubleToLongBits(this.allowance) != Double.doubleToLongBits(other.allowance)) {
            return false;
        }
        if (!Objects.equals(this.classHead, other.classHead)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+" Salary: "+this.calSalary(); 
    }
    
    
}
