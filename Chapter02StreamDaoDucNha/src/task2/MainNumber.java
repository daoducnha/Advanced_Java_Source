/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * Date 12/09/2016
 * Class MainNumber to manage list number integer
 */
public class MainNumber {

    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 20, 4, 3, 11, 12, 15, 17, 18);
        //print list Integer
        listInt.stream().forEach(System.out::println);
        //create list 2 have element  = square element of list 1;
        List<Integer> list2 = listInt.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println("List 2 is: " + list2);

        //print max, min, sum, Average values of list 2
        IntSummaryStatistics status = list2.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Max of list 2 is: " + status.getMax());
        System.out.println("Min of list 2 is: " + status.getMin());
        System.out.println("Sum of list 2 is: " + status.getSum());
        System.out.println("Average of list 2 is: " + status.getAverage());

        //create list 3
        List<Integer> list3 = list2.stream().filter(n -> checkPrimeNumber(n)).collect(Collectors.toList());
        System.out.println("List 3 is: " + list3);
        //create list 4
        List<Integer> list4 = list2.stream().filter(n-> checkSquareNumber(n)).collect(Collectors.toList());
        System.out.println("List 4 is: "+list4);
    }

    public static boolean checkPrimeNumber(int n) {
        if (n <= 0 | n == 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean checkSquareNumber(int n) {
        for (int i = 0; i <= n; i++) {
            if (n == i * i) {
                return true;
            }
        }
        return false;
    }
}
