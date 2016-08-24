/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_12;

/**
 *
 * @author Dao Duc Nha
 * Date 24/8/2016
 * @version 1.0 
 * Class TextBook include information Text Book
 */
public class TextBook extends Book{
    int status;

    public TextBook() {
    }

    public TextBook(int status, String id, String tittle, String date, double price, int amount, String publisher) {
        super(id, tittle, date, price, amount, publisher);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    } 
}
