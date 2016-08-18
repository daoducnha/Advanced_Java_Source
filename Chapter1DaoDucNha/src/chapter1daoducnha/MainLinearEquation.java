/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

import java.io.BufferedReader;

public class MainLinearEquation extends LinearEquation{
    
    public static void main(String[] args) {
        LinearEquation le = new LinearEquation(0,10);
        le.setA(0);
        le.setB(10);
        double root = le.findRoot();
        if (root == Double.MAX_VALUE) {
            System.out.println("equations infinitely many solution");
        }else if (root == Double.MIN_VALUE) {
            System.out.println("the equation has no solution");
        }else{
            System.out.println("root is: "+root);
        }
        
    }
    
}
