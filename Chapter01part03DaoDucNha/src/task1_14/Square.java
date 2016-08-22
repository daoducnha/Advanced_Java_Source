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
public class Square extends Shape{
    int length;
    

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    

    @Override
    public double perimeter() {
        double per = length*4;
        return per;
    }

    @Override
    public double area() {
        double area = length*length;
        return area;
    }
}
