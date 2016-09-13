/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import task2.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hv
 */
public class MaxOfArray {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(100);
        }
        System.out.println("Input num of Thread: ");
        int numThreads = sc.nextInt();
        int max = max(arr, numThreads);

        String strArr = "";
        for (int values : arr) {
            strArr += values + " ";
        }

        System.out.println("Aray: " + strArr);
        System.out.println("Max: " + max);
    }

    public static int max(int[] arr, int numThreads) throws InterruptedException {
        int len = arr.length;
        int max = 0;
        MaxThread[] ts = new MaxThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            ts[i] = new MaxThread((i * len) / numThreads, (i + 1) * len / numThreads, arr);
            ts[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            ts[i].join();                       
            if(max<ts[i].getMax())
                max = ts[i].getMax();
        }
        
        return max;
    }
}
