/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class MainManageCD to manage List CD include add new cd view list cd and tatal price, sort list cd by name
 */
public class MainManageCD {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List listCD = new ArrayList();

        boolean flag = true;
        while (flag == true) {
            System.out.println("1. Add a CD");
            System.out.println("2. Output List CD and Tatle Price");
            System.out.println("3. Sort list CD by name");
            System.out.println("4. Do you want continue? y/n");
            System.out.println("Please input your choise: ");
            int choise = Integer.parseInt(input.readLine());
            if (choise == 1) {
                CD nCD = new CD();
                listCD.add(inputInfoCD(nCD));
            } else if (choise == 2) {
                int tatalPrice = 0;
                for (int i = 0; i < listCD.size(); i++) {
                    CD element = (CD) listCD.get(i);
                    System.out.println(element.toString());
                    tatalPrice += element.price;
                }
                System.out.println("Tatal Price of list CD : " + tatalPrice);
            } else if (choise == 3) {
                Collections.sort(listCD);
                for (Object values : listCD) {
                    CD element = (CD) values;
                    System.out.println(element.toString());
                }
            } else if (choise == 4) {
                System.out.println("Please choise y/n");
                String choiseNext = input.readLine();
                if (choiseNext.equalsIgnoreCase("n")) {
                    flag = false;
                } else {
                    flag = true;
                }
            }
        }
    }

    //Input information a new CD and output a CD
    public static CD inputInfoCD(CD cd) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input id of CD: ");
        String id = input.readLine();
        System.out.println("Input name of CD: ");
        String name = input.readLine();
        System.out.println("Input name singer: ");
        String singer = input.readLine();
        System.out.println("Input numer song of CD: ");
        int num = Integer.parseInt(input.readLine());
        System.out.println("Input Price of CD: ");
        double price = Double.parseDouble(input.readLine());
        cd = new CD(id, name, singer, num, price);
        return cd;
    }
}
