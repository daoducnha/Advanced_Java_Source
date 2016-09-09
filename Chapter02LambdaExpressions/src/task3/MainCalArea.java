/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dao Duc Nha
 * Date 9/9/2016
 * @version 1.0
 * Class MainCalArea use lambda expressions to calculate area of circle and retangle
 */
public class MainCalArea{

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input Radius: ");
        double r = Double.parseDouble(input.readLine());

        Area cricle = (x1, x2) -> x1 * Math.pow(x2, 2);
        System.out.println("Area Cricle: "+cricle.calArea(Math.PI, r));
        
        System.out.println("Input height of Retangle: ");
        double height = Double.parseDouble(input.readLine());
        System.out.println("Input width of retangle: ");
        double width = Double.parseDouble(input.readLine());
        
        Area retangle = (x1, x2)->x1*x2;
        
        System.out.println("Area retangle: "+ retangle.calArea(height, width));
    }

    
}
