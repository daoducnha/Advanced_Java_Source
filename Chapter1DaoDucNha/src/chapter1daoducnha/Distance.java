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
public class Distance {
    Pointer a;
    Pointer b;

    public Distance() {
    }

    public Distance(Pointer a, Pointer b) {
        this.a = a;
        this.b = b;
    }

    public Pointer getA() {
        return a;
    }

    public void setA(Pointer a) {
        this.a = a;
    }

    public Pointer getB() {
        return b;
    }

    public void setB(Pointer b) {
        this.b = b;
    }
    
    
     public double calDistance() {
        double distance = Math.sqrt((b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y));
        return distance;
    }
}
