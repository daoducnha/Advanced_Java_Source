/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

/**
 *
 * @author hv
 */
public class Rectangle {

    Pointer a;
    Pointer c;

    public Rectangle(Pointer a, Pointer c) {
        this.a = a;
        this.c = c;
    }

    public Pointer getA() {
        return a;
    }

    public void setA(Pointer a) {
        this.a = a;
    }

    public Pointer getC() {
        return c;
    }

    public void setC(Pointer c) {
        this.c = c;
    }
    // calculate Perimeter of rectangle, output Perimeter
    public int calPerimeter() {
        int length = Math.abs(a.x - c.x);
        int height = Math.abs(a.y - c.y);

        int per = 2 * (length + height);
        return per;
    }
    //calculate Area of rectangle, output Area
    public int calArea() {
        int length = Math.abs(a.x - c.x);
        int height = Math.abs(a.y - c.y);

        int ar = length * height;
        return ar;
    }
}
