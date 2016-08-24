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
 * @author Dao Duc Nha Date 24/8/2016
 * @version 1.0 Class Manage Book
 */
public class ManageBook {

    TextBook[] textBook;
    ReferenceBook[] referenceBook;

    public ManageBook() {
    }

    public ManageBook(TextBook[] textBook, ReferenceBook[] referenceBook) {
        this.textBook = textBook;
        this.referenceBook = referenceBook;
    }

    public TextBook[] getTextBook() {
        return textBook;
    }

    public void setTextBook(TextBook[] textBook) {
        this.textBook = textBook;
    }

    public ReferenceBook[] getReferenceBook() {
        return referenceBook;
    }

    public void setReferenceBook(ReferenceBook[] referenceBook) {
        this.referenceBook = referenceBook;
    }

    //Input info of Text Book out put a TextBook
    public TextBook inputInfoTextBook(String id, String tittle, String date, double price, int amount, String publisher) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input Status of book: New(1) - Old(2)");
        int status = Integer.parseInt(input.readLine());

        TextBook tb = new TextBook(status, id, tittle, date, price, amount, publisher);
        return tb;
    }

    //Input info of Reference Book out put a ReferenceBook

    public ReferenceBook inputInfoReferenceBook(String id, String tittle, String date, double price, int amount, String publisher) throws IOException, NumberFormatException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input Tax of Reference Book");
            double tax = Double.parseDouble(input.readLine());
            ReferenceBook rb = new ReferenceBook(tax, id, tittle, date, price, amount, publisher);
            return rb;
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    //add a text book into array TextBook return true if susscess else retuen false
    public boolean addTextBook(TextBook newtb) {
        for (int i = 0; i < textBook.length; i++) {
            if (textBook[i] == null) {
                textBook[i] = newtb;
                return true;
            }
        }
        return false;
    }
    //add a reference book into array ReferenceBook return true if susscess else retuen false
    public boolean addReferanceBook(ReferenceBook newrb) {
        for (int i = 0; i < referenceBook.length; i++) {
            if (referenceBook[i] == null) {
                referenceBook[i] = newrb;
                return true;
            }
        }
        return false;
    }
    //output info array TextBook
    public void outputArrTextBook() {
        for (TextBook values : textBook) {
            if (values != null) {
                System.out.println("ID: " + values.id + " - Tittle: " + values.tittle
                        + " - Date: " + values.date + " - Price:" + values.price
                        + " - Amount: " + values.amount + " - Publisher: " + values.publisher
                        + " - Status: " + values.status);
            }
        }
    }
    //output info array ReferanceBook
    public void outputArrReferanceBook() {
        for (ReferenceBook values : referenceBook) {
            if (values != null) {
                System.out.println("ID: " + values.id + " - Tittle: " + values.tittle
                        + " - Date: " + values.date + " - Price:" + values.price
                        + " - Amount: " + values.amount + " - Publisher: " + values.publisher
                        + " - Tax: " + values.tax);
            }
        }
    }
    
    //calculate money of a TextBook
    public double CalMoneyTextBook() {
        double money = 0;
        for (TextBook values : textBook) {
            if (values != null && values.status == 1) {
                money += values.amount * values.price;
            }
            if (values != null && values.status == 2) {
                money += values.amount * values.price * 0.5;
            }
        }
        return money;
    }

    //calculate money of a ReferenceBook
    public double calMoneyReferenceBook() {
        double money = 0;
        for (ReferenceBook valuse : referenceBook) {
            if (valuse != null) {
                money += valuse.amount * valuse.price + (valuse.amount + valuse.price) * valuse.tax / 100;
            }
        }
        return money;
    }

    //calculate money AVG of array reference book
    public double calAVGReferenceBook() {
        double avg = 0;
        int count = 0;
        for (ReferenceBook values : referenceBook) {
            if (values != null) {
                avg += values.price;
                count++;
            }
        }
        avg = avg / count;
        return avg;
    }
}
