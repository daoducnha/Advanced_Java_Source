/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.singer);
        hash = 89 * hash + this.numOfSing;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CD other = (CD) obj;
        if (this.numOfSing != other.numOfSing) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.singer, other.singer)) {
            return false;
        }
        return true;
    }

    
}
