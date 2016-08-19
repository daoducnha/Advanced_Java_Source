/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

public class Circle {

    Pointer o;
    Pointer r;

    public Circle(Pointer o, Pointer r) {
        this.o = o;
        this.r = r;
    }

    public Circle() {
    }

    public Pointer getO() {
        return o;
    }

    public void setO(Pointer o) {
        this.o = o;
    }

    public Pointer getR() {
        return r;
    }

    public void setR(Pointer r) {
        this.r = r;
    }

    //calculate Circumference of circle out Circumference
    public double calCircumference() {
        double radius = o.calDistance(r);
        double cir = 2 * radius * Math.PI;
        return cir;
    }
    //calculate area of circle out area
    public double calArea() {
        double radius = o.calDistance(r);
        double ar = radius * radius * Math.PI;
        return ar;
    }
}
