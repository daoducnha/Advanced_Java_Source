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
}
