/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

public class ManageCD {
    String codeCD;
    String nameCD;
    String singer;
    int numOfSong;
    double price;

    public ManageCD() {
    }

    public ManageCD(String codeCD, String nameCD, String singer, int numOfSong, double price) {
        this.codeCD = codeCD;
        this.nameCD = nameCD;
        this.singer = singer;
        this.numOfSong = numOfSong;
        this.price = price;
    }

    public String getCodeCD() {
        return codeCD;
    }

    public void setCodeCD(String codeCD) {
        this.codeCD = codeCD;
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

    public int getNumOfSong() {
        return numOfSong;
    }

    public void setNumOfSong(int numOfSong) {
        this.numOfSong = numOfSong;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
