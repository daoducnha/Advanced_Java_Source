/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 9-2016
 * Class Product include information a product
 */
public class Product {

    int id;
    String name;
    double price;
    int amount;    
    int categoryId;

    public Product(int id, String name, double price, int amount, int categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.categoryId = categoryId;
    }

    public Product() {
    }

    public Product(String name, double price, int amount, int categoryId) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.categoryId = categoryId;
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

    

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    
    @Override
    public String toString() {
        return id + " - " + name + " - " + price + " - " + amount + " - "+ categoryId;
    }

}
