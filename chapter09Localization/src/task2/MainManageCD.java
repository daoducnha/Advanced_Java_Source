/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0 
 * Date 13/9/2016 Class MainManageCD to manage List CD include add
 * new cd view list cd and tatal price, sort list cd by name
 */
public class MainManageCD {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List listCD = new ArrayList();
        System.out.println("Please choise langues:Vietnames(1) - English(2)");
        int lang = Integer.parseInt(input.readLine());
        String language = "";
        String country = "";

        ResourceBundle message = null;
        Locale currentLocal = null;

        //set languege 
        if (lang == 1) {
            language = "vi";
            country = "VN";
            currentLocal = new Locale(language, country);
            message = ResourceBundle.getBundle("task2/resource_vi_VN", currentLocal);

        } else if (lang == 2) {
            language = "en";
            country = "US";
            currentLocal = new Locale(language, country);
            message = ResourceBundle.getBundle("task2/resource_en_US", currentLocal);
        }
        boolean flag = true;
        while (flag == true) {
            System.out.println("1. " + message.getString("input"));
            System.out.println("2. " + message.getString("outputlist"));
            System.out.println("3. " + message.getString("sort"));
            System.out.println("5. " + message.getString("continue") + "? " + message.getString("yes") + "(1)/" + message.getString("no") + "(2)");
            System.out.println(message.getString("choise"));
            int choise = Integer.parseInt(input.readLine());
            if (choise == 1) {
                CD nCD = new CD();
                listCD.add(inputInfoCD(nCD, language, country));
            } else if (choise == 2) {
                int tatalPrice = 0;
                for (int i = 0; i < listCD.size(); i++) {
                    CD element = (CD) listCD.get(i);
                    System.out.println(element.toString());
                    tatalPrice += element.price;
                }
                System.out.println(message.getString("tatal")+ tatalPrice);
            } else if (choise == 3) {
                Collections.sort(listCD);
                for (Object values : listCD) {
                    CD element = (CD) values;
                    System.out.println(element.toString());
                }
            } else if (choise == 4) {
                System.out.println(message.getObject("continue"));
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
    public static CD inputInfoCD(CD cd, String language, String country) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        ResourceBundle message = null;
        Locale currentLocal = null;
        if (language.equals("vi") && country.equals("VN")) {

            currentLocal = new Locale(language, country);
            message = ResourceBundle.getBundle("task2/resource_vi_VN", currentLocal);
        } else if (language.equals("en") && country.equals("US")) {
            currentLocal = new Locale(language, country);
            message = ResourceBundle.getBundle("task2/resource_en_US", currentLocal);
        }

        System.out.println(message.getString("inputid"));
        String id = input.readLine();
        System.out.println(message.getString("inputname"));
        String name = input.readLine();
        System.out.println(message.getString("inputsinger"));
        String singer = input.readLine();
        System.out.println(message.getString("inputnumsong"));
        int num = Integer.parseInt(input.readLine());
        System.out.println(message.getString("inputprice"));
        double price = Double.parseDouble(input.readLine());
        cd = new CD(id, name, singer, num, price);
        return cd;
    }
}
