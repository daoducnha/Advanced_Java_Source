/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dao Duc Nha
 * Date 9/9/2016
 * @version 1.0
 * Class Task1ArrayList use lambda expressions to output list number
 */
public class Task1ArrayList {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("No use Lambda");
        for (Integer n : list) {
            System.out.println(n);
        }
        System.out.println("Use Lambda");
        list.forEach(n->System.out.println(n));
    }
}
