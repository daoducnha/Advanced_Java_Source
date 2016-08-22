/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_10;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nameClass);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.semester1) ^ (Double.doubleToLongBits(this.semester1) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.semester2) ^ (Double.doubleToLongBits(this.semester2) >>> 32));
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
        final Student other = (Student) obj;
        if (Double.doubleToLongBits(this.semester1) != Double.doubleToLongBits(other.semester1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.semester2) != Double.doubleToLongBits(other.semester2)) {
            return false;
        }
        if (!Objects.equals(this.nameClass, other.nameClass)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+" AVG point: "+this.calPointAverage();
    }
    
    
}
