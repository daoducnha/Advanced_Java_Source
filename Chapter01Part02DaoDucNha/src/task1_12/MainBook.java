/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dao Duc Nha
 * Date 24/8/2016
 * @version 1.0 
 * Class main Book
 */
public class MainBook {

    public static void main(String[] args) throws IOException {
        TextBook[] arrTextBook = new TextBook[100];
        ReferenceBook[] arrReferanceBook = new ReferenceBook[100];
        ManageBook mng = new ManageBook(arrTextBook, arrReferanceBook);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        int j = 0;
        boolean flag = true;
        while (flag == true) {
            System.out.println("do you want input new book? y/n");
            String choise = input.readLine();
            if (choise.equalsIgnoreCase("n")) {
                flag = false;
            }
            if (choise.equals("y")) {
                System.out.println("Input ID: ");
                String id = input.readLine();
                System.out.println("Input name of book: ");
                String name = input.readLine();
                System.out.println("Input Date: ");
                String date = input.readLine();
                System.out.println("Input Price: ");
                double price = Double.parseDouble(input.readLine());
                System.out.println("Input amount: ");
                int amount = Integer.parseInt(input.readLine());
                System.out.println("Input Publisher: ");
                String publisher = input.readLine();

                System.out.println("Please choise Text Book(1) or Reference Book(2)");
                int choiseType = Integer.parseInt(input.readLine());
                if (choiseType == 1) {
                    TextBook newTB = mng.inputInfoTextBook(id, date, date, price, amount, publisher);
                    mng.addTextBook(newTB);
                    mng.outputArrTextBook();
                    mng.CalMoneyTextBook();
                } else if (choiseType == 2) {
                    ReferenceBook newrb = mng.inputInfoReferenceBook(id, date, date, price, amount, publisher);
                    mng.addReferanceBook(newrb);                    
                    mng.outputArrReferanceBook();
                    System.out.println("Money of book is: "+ mng.calMoneyReferenceBook());
                    System.out.println("Avg of Reference Book: " + mng.calAVGReferenceBook());
                } else {
                    System.out.println("Choise Wrong");
                }
            }
        }
    }
}
