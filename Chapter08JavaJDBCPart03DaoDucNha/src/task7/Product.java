/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

import java.sql.Date;

/**
 *
 * @author NHA
 */
public class Product {
    int id;
    String name;
    double price;
    int amount;
    String image;
    int catagoryID;
    Date date;
    boolean onSell;

    public Product(int id, String name, double price, int amount, String image, int catagoryID, Date date, boolean onSell) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.image = image;
        this.catagoryID = catagoryID;
        this.date = date;
        this.onSell = onSell;
    }

    public Product(String name, double price, int amount, String image, int catagoryID, Date date, boolean onSell) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.image = image;
        this.catagoryID = catagoryID;
        this.date = date;
        this.onSell = onSell;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCatagoryID() {
        return catagoryID;
    }

    public void setCatagoryID(int catagoryID) {
        this.catagoryID = catagoryID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isOnSell() {
        return onSell;
    }

    public void setOnSell(boolean onSell) {
        this.onSell = onSell;
    }
        
}
