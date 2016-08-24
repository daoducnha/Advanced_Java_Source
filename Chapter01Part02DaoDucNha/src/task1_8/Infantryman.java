/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_8;

/**
 *
 * @author:Dao Duc Nha
 * Date: 22/8/2016
 * Version: 1.0 Class Infantryman
 */
public class Infantryman extends Soldier{

    public Infantryman() {
    }

    public Infantryman(String name, int power, String weapon) {
        super(name, power, weapon);
    }

    //calculate figth of Infantryman
    public int fight(int power){
        return power - 2;
    }

    //show information of Infantryman
    @Override 
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
