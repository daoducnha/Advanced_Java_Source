/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import com.sun.jmx.snmp.Enumerated;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 9-2016
 * class output list word vietnamese and english
 */
public class ProcessEnglish {

    public static void main(String[] args) {
        String language;
        String country;

        Locale currentLocal = null;
        ResourceBundle message;
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choise language: Vietnamese(1) - English(2)");
        int choise = sc.nextInt();
        if (choise == 1) {
            language = "en";
            country = "US";
            currentLocal = new Locale(language, country);
            message = ResourceBundle.getBundle("task1/resource_vi_VN", currentLocal);
        } else {
            language = "vi";
            country = "VN";
            currentLocal = new Locale(language, country);
            message = ResourceBundle.getBundle("task1/resource_en_US", currentLocal);
        }
        
       List<String> list = new ArrayList<>();
        Enumeration <String> keys = message.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String values = message.getString(key);
            list.add(values);
        }
        
        for (Object obj : list) {
            String st = (String)obj;
            System.out.println(st);
        }
    }
}
