/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author NHA
 */
public class MainComputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Destop[] arrD = new Destop[100];
        Laptop[] arrL = new Laptop[100];
        ManageComputer mn = new ManageComputer(arrD, arrL);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int j = 0;
        boolean flag = true;
        do {
            System.out.println("what do you want in put a computer?y/n");
            String choise = input.readLine();
            if (choise.equalsIgnoreCase("n")) {
                flag = false;
            } else if (choise.equalsIgnoreCase("y")) {
                System.out.println("choise type of computer: Destop(1) - Laptop(2)");
                int choiseType = Integer.parseInt(input.readLine());
                if (choiseType == 1) {
                    arrD[i] = mn.inputInfoDes();
                    mn.printArrDes();                    
                    i++;
                } else if (choiseType == 2) {
                    arrL[j] = mn.inputInfoLap();                    
                    mn.printArrLap();
                    j++;                                                    
                }
            }

        } while (flag == true);
        for (Destop values : arrD) {
            
        }
    }

}
