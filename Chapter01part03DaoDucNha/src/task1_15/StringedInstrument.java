/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_15;

/**
 *
 * @author NHA
 */
public class StringedInstrument extends Instrument{
    int amoutString;

    public int getAmoutString() {
        return amoutString;
    }

    public void setAmoutString(int amoutString) {
        this.amoutString = amoutString;
    }

    public String getNameIntrument() {
        return nameIntrument;
    }

    public void setNameIntrument(String nameIntrument) {
        this.nameIntrument = nameIntrument;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
    @Override
    void play() {
        System.out.println(this.getNameIntrument()+" - "+this.getAmoutString());
    }
    
}
