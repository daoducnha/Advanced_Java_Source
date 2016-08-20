/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

/**
 *
 * @author NHA
 */
public class CD {

    String id;
    String name;
    String singer;
    int numOfSing;
    double price;

    public CD(String id, String name, String singer, int numOfSing, double price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.numOfSing = numOfSing;
        this.price = price;
    }

    public CD() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumOfSing() {
        return numOfSing;
    }

    public void setNumOfSing(int numOfSing) {
        this.numOfSing = numOfSing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String output = id + " " + name + " " + singer + " " + numOfSing + " " + price;
        return output;
    }

    boolean equals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
