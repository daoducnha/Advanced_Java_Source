/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainEmployee {
    public static void main(String[] args) throws IOException{        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Input your name: ");
        String name = input.readLine();
        System.out.println("Input your pay rate: ");
        double pr = Double.parseDouble(input.readLine());
        System.out.println("Input num people appendant: ");
        int npa = Integer.parseInt(input.readLine());
        System.out.println("Input your Fringe Benefits: ");
        double fb = Double.parseDouble(input.readLine());
        
        Employee e = new Employee(name, pr, npa, fb);
        
        System.out.println("Personal Income: "+String.format("%f", e.calPersonalIncome()));
        System.out.println("Tax Income: "+String.format("%f", e.calTaxIncome()));
        System.out.println("Tax Persionnal Income: "+String.format("%f", e.calTaxPersionnal()));
        System.out.println("Real Income: "+String.format("%f", e.calRealIncome()));
    }
}
