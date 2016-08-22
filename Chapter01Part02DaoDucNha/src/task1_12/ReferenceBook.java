/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_12;

/**
 *
 * @author hv
 */
public class ReferenceBook extends Book{
    double tax;

    public ReferenceBook() {
    }

    public ReferenceBook(double tax, String id, String tittle, String date, double price, int amount, String publisher) {
        super(id, tittle, date, price, amount, publisher);
        this.tax = tax;
    }

    

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    
    
}
