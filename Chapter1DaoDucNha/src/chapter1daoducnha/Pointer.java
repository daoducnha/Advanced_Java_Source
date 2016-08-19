/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

public class Pointer {
    int x;
    int y;

    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pointer() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
     public double calDistance(Pointer a) {
        double distance = Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
        return distance;
    }
}
