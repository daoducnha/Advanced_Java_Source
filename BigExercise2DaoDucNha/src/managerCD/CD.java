
package managerCD;

import java.io.Serializable;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 20-9-2016
 * Class CD contain information of a CD
 */
public class CD implements Serializable {

    int id;
    String name;
    String singer;
    int numberSongs;
    double price;

    public CD() {
    }

    public CD(String name, String singer, int numberSongs, double price) {
        this.name = name;
        this.singer = singer;
        this.numberSongs = numberSongs;
        this.price = price;
    }

    public CD(int id, String name, String singer, int numberSongs, double price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.numberSongs = numberSongs;
        this.price = price;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumberSongs() {
        return numberSongs;
    }

    public void setNumberSongs(int numberSongs) {
        this.numberSongs = numberSongs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + singer + " - " + numberSongs + " - " + price;
    }

    
}
