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
public class Student extends Human {

    String nameClass;
    double semester1;
    double semester2;

    public Student() {
    }

    public Student(String nameClass, double semester1, double semester2, String name, String dayOfBirth, String address, String phoneNumber) {
        super(name, dayOfBirth, address, phoneNumber);
        this.nameClass = nameClass;
        this.semester1 = semester1;
        this.semester2 = semester2;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getSemester1() {
        return semester1;
    }

    public void setSemester1(double semester1) {
        this.semester1 = semester1;
    }

    public double getSemester2() {
        return semester2;
    }

    public void setSemester2(double semester2) {
        this.semester2 = semester2;
    }

    public double calPointAverage() {
        double avg = (semester1 + semester2) / 2;
        return avg;
    }
}
