/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0 Date 13/9/2016 Class CD include information a cd
 */
public class CD implements Comparable<CD> {

    String idCD;
    String nameCD;
    String singer;
    int numofSong;
    double price;

    public CD() {
    }

    public CD(String idCD, String nameCD, String singer, int numofSong, double price) {
        this.idCD = idCD;
        this.nameCD = nameCD;
        this.singer = singer;
        this.numofSong = numofSong;
        this.price = price;
    }

    public String getIdCD() {
        return idCD;
    }

    public void setIdCD(String idCD) {
        this.idCD = idCD;
    }

    public String getNameCD() {
        return nameCD;
    }

    public void setNameCD(String nameCD) {
        this.nameCD = nameCD;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumofSong() {
        return numofSong;
    }

    public void setNumofSong(int numofSong) {
        this.numofSong = numofSong;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return idCD + nameCD + singer + numofSong + price;
    }

    @Override
    public int compareTo(CD o) {
        return (this.nameCD).compareTo(o.nameCD);
    }

}
