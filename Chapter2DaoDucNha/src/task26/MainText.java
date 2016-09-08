/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author hv
 */
public class MainText {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please input your text");
        String text = input.readLine();

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
