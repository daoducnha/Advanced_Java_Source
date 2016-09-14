/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0 Date 9/7/2016 Class MainText to output frequency a word in text
 */
public class MainText {

    public static void main(String[] args) throws IOException {

        String string;
        String text = "";
        try (BufferedReader in = new BufferedReader(new FileReader("src/task2/document.txt"))) {
            while ((string = in.readLine()) != null) {
                text += string;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Document: " + text);
        System.out.println("====================");

        String[] arrWord = text.split(" ");                
        Map<String, Integer> mapWord = new TreeMap<>();
        int i = 0;
        while (i < arrWord.length) {
            if (mapWord.containsKey(arrWord[i]) == false) {
                mapWord.put(arrWord[i], 1);
            } else {
                mapWord.replace(arrWord[i], (int) mapWord.get(arrWord[i]) + 1);
            }
            i++;
        }
        System.out.println("List work: ");
        for (Object key : mapWord.keySet()) {
            Object values = mapWord.get(key);
            System.out.println(key + ": " + values);
        }
    }
}
