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
 * @author NHA
 */
public class MainCD {

    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        CD[] arrCD = new CD[100];
        String choise;
        int count = 0;
        do {
            System.out.println("what do you want add a CD?Y/N");
            choise = input.readLine();
            if (choise.equals("y")) {
                ManageCD mCD = new ManageCD(arrCD);
                CD cd;
                cd = mCD.inputInformation();
              //  if (mCD.checkCD(cd) == false) {
                    mCD.addCD(cd);
                    System.out.println("add OK");                    
           //   }
                mCD.PrintArrayCD();
                System.out.println("All price: " + mCD.calAllPrice());
                count++;
            }
        } while (choise.equals("y"));

    }

}
