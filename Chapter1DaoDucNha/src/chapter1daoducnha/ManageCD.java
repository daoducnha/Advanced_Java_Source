/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ManageCD {

    CD[] cd;

    public ManageCD() {
    }

    public ManageCD(CD[] cd) {
        this.cd = cd;
    }

    public CD[] getCd() {
        return cd;
    }

    public void setCd(CD[] cd) {
        this.cd = cd;
    }

    public CD inputInformation() throws IOException, NumberFormatException {
        try {

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Input id of CD: ");
            String id = input.readLine();
            System.out.println("Input name of CD: ");
            String name = input.readLine();
            System.out.println("Input singer: ");
            String singer = input.readLine();
            System.out.println("Input numeber of songs: ");
            int numOfSongs = Integer.parseInt(input.readLine());
            System.out.println("Input price of CD: ");
            double price = Double.parseDouble(input.readLine());

            CD cd = new CD(id, name, singer, numOfSongs, price);
            return cd;
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    //check a CD is exist in Array cd
    public boolean checkCD(CD c) {
        for (CD cd1 : cd) {
            if(c.equals(cd1))
                return true;
        }
        return false;
    }

    //Add a CD , return true id success else return false

  

    
    public boolean addCD(CD c) {
        for (int i = 0; i < cd.length; i++) {
            if (cd[i] == null) {
                cd[i] = c;
                return true;
            }
        }
        return false;
    }

    //calculate all price of cd of array CD
    public double calAllPrice() {
        double allPrice = 0;
        for (int i = 0; i < cd.length; i++) {
            if (cd[i] != null) {
                allPrice += cd[i].price;
            }
        }
        return allPrice;
    }

    public void PrintArrayCD() {
        for (CD cd1 : cd) {
            if (cd1 != null) {
                System.out.println(cd1.toString());
            }
        }
    }
}
