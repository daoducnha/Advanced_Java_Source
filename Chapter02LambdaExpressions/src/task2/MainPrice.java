/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Dao Duc Nha
 * Date 9/9/2016
 * @version 1.0
 * Class MainPrice use lambda expressions to calculate price of each element of list
 */
public class MainPrice {

    public static void main(String[] args) {
        List<Integer> amounts = Arrays.asList(new Integer[]{2, 3, 5, 7});
        int price = 5200;
        
        amounts.forEach(n -> System.out.println("Money: " + n * price + " vnd"));
    }
}
