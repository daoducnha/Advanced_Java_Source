/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_14;

/**
 *
 * @author NHA
 */
public class Rectangle extends Shape {

    int length;
    int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    @Override
    public double area() {
        return length * width;
    }

}
