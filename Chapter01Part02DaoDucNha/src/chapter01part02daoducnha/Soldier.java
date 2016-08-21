/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01part02daoducnha;

/**
 *
 * @author NHA
 */
public class Soldier {

    String name;
    int power;
    String weapon;

    public Soldier() {
    }

    public Soldier(String name, int power, String weapon) {
        this.name = name;
        this.power = power;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int fight(int power) {
        return power - 1;
    }

    @Override
    public String toString() {
        return "name: "+name+"| power: "+power+"| weapon: "+weapon; //To change body of generated methods, choose Tools | Templates.
    }
    
}
