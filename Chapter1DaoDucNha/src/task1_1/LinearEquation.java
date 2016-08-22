/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_1;

/**
 * System.out.printf("a =%d, b = %d", a.x, b.x);Lin
 *
 * @author hv
 */
public class LinearEquation {

    int a;
    int b;

    public LinearEquation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public LinearEquation() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    //
    public double findRoot() throws ArithmeticException {
        double root = 0;
        if (a == 0 && b != 0) {
            root = Double.MIN_VALUE;
        } else if (a == 0 && b == 0) {
            root = Double.MAX_VALUE;
        } else {           
                root = -b / a;            
        }
        return root;
    }

}
