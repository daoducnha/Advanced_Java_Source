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
public class Cricle extends Shape{
    double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double area() {
        return r*r*Math.PI;
    }
    
}
