/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_12;

import java.util.logging.Logger;

/**
 *
 * @author hv
 */
public class Book {
    String id;
    String tittle;
    String date;
    double price;
    int amount;
    String publisher;

    public Book() {
    }

    public Book(String id, String tittle, String date, double price, int amount, String publisher) {
        this.id = id;
        this.tittle = tittle;
        this.date = date;
        this.price = price;
        this.amount = amount;
        this.publisher = publisher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    
        
    
}
