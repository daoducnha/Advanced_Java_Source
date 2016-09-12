/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 12/09/2016
 * Class Student include information of a student
 */
public class Student {

    String name;
    int age;
    double mark1;
    double mark2;

    public Student() {
    }

    public Student(String name, int age, double mark1, double mark2) {
        this.name = name;
        this.age = age;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    public double avg() {
        return (mark1 + mark2) / 2;
    }

    @Override
    public String toString() {
        return name + "\tage = " + age + "\tmark1 = " + mark1 + " & mark 2 = " + mark2+ "\tavg = "+this.avg();
    }

}
