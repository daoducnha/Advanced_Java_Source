/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainEmployee {

    public static void main(String[] args) throws IOException, NumberFormatException {

        EmploySale[] ArrS = new EmploySale[100];
        EmplyeeProduce[] ArrP = new EmplyeeProduce[100];
        ManagerEmployee mng = new ManagerEmployee(ArrS, ArrP);

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag == true) {
            System.out.println("Do you want Add new employee? y/n");
            String choise = input.readLine();
            if (choise.equalsIgnoreCase("n")) {
                flag = false;
            } else if (choise.equalsIgnoreCase("y")) {
                System.out.println("Input your name: ");
                String name = input.readLine();
                System.out.println("Input your pay rate: ");
                double pr = Double.parseDouble(input.readLine());
                System.out.println("Input num people appendant: ");
                int npa = Integer.parseInt(input.readLine());
                System.out.println("Input your Fringe Benefits: ");
                double fb = Double.parseDouble(input.readLine());

                System.out.println("Do you want add Employe Sale(1) or Employe Produce(2)");
                int choiseType = Integer.parseInt(input.readLine());
                if (choiseType == 1) {
                    EmploySale newS = mng.inputInfoEmplySale(name, pr, npa, fb);
                        mng.addEmploySale(newS);
                        
                        mng.outputArrEmploySale();
                   
                } else if(choiseType==2){
                    EmplyeeProduce newP = mng.inputInfoEmplyeeProduce(name, pr, npa, fb);
                    mng.addEmplyeeProduce(newP);
                    mng.outputArrEmployProduce();
                } else {
                    System.out.println("Choise Type Wrong!");
                }
            } else {
                System.out.println("Choise wrong");
            }

        }

    }
}
