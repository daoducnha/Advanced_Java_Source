/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author:Dao Duc Nha
 * Date: 22/8/2016
 * Version: 1.0 Class  trade
 */
public class Trade {

    String id;
    String date;
    int amount;
    String typeTrade;

    public Trade(String id, String date, int amount, String typeTrade) {
        this.id = id;
        this.date = date;        
        this.amount = amount;
        this.typeTrade = typeTrade;
    }

    public Trade() {
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String regex = "([0]?[1-9]|[1-2][0-9]|[3][01])/([0]?[1-9]|[1][0-2])/([0-9]{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        boolean flag = matcher.matches();
        if (flag == true) {
            this.date = date;
        }
        else{
            this.date = "0/0/0";
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTypeTrade() {
        return typeTrade;
    }

    public void setTypeTrade(String typeTrade) {
        this.typeTrade = typeTrade;
    }
    //String id, String date, double price, int amount, String typeTrade
    /*public Trade inputInfoTrade()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        
        
    }*/
}
