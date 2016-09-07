/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 9/7/2016
 * Class MainDictionary 
 */
public class MainDictionary {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Set<Word> dictionary = new TreeSet();
        boolean flag = true;
        while (flag == true) {
            System.out.println("====================");
            System.out.println("1. View all dictionary");
            System.out.println("2. Add a new word");
            System.out.println("3. Search a word");
            System.out.println("4. Remove a word");
            System.out.println("5. Exit");
            System.out.println("Please input your choise: ");
            int choise = Integer.parseInt(input.readLine());
            System.out.println("====================");
            if (choise == 1) {
                for (Object values : dictionary) {
                    Word element = (Word) values;
                    System.out.println(element.toString());
                }
            } else if (choise == 2) {                
                System.out.println("Input Word English: ");
                String work = input.readLine();
                System.out.println("Input mean of work: ");
                String mean = input.readLine();
                Word w = new Word(work, mean);
                dictionary.add(w);
            } else if (choise == 3) {
                System.out.println("Please input word want search: ");
                String search = input.readLine();
                for (Word values : dictionary) {
                    Word element = values;
                    if((element.wordEnglish).equalsIgnoreCase(search)){
                        System.out.println(element.toString());
                    }
                }
            } else if (choise == 4) {
                System.out.println("Please input word want remove: ");
                String remove = input.readLine();
                for (Word values : dictionary) {
                    Word element = values;
                    if((element.wordEnglish).equalsIgnoreCase(remove)){
                        dictionary.remove(element);
                    }
                }
            } else if (choise == 5) {
                flag = false;
            }
        }
    }

    
}
