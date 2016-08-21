/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter01part02daoducnha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author NHA
 */
public class MainBattle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Soldier s = new Soldier();
        Infantryman i = new Infantryman();
        Trooper t = new Trooper();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("input name of Infantryman: ");
        String nameIn = input.readLine();
        System.out.println("input power of Infantryman:");
        int powerIn = Integer.parseInt(input.readLine());
        System.out.println("input weapon of Infantryman: ");
        String weaponIn = input.readLine();

        i.setName(nameIn);
        i.setPower(powerIn);
        i.setWeapon(weaponIn);        
        System.out.println(i.toString());
        
        System.out.println("input name of Trooper: ");
        String nameTr = input.readLine();
        System.out.println("input power of Trooper: ");
        int powerTr = Integer.parseInt(input.readLine());
        System.out.println("input weapon of Trooper: ");
        String weaponTr = input.readLine();

        t.setName(nameTr);
        t.setPower(powerTr);
        t.setWeapon(weaponTr);
        System.out.println(t.toString());
        
        while (t.power >= 0 && i.power >= 0) {
            System.out.println("Who will fight? Infantryman(1), Trooper(2)");
            int choise = Integer.parseInt(input.readLine());
            if (choise == 1) {
                t.power = i.fight(t.getPower());
                System.out.println(t.toString());
            } else if (choise == 2) {
                i.power = t.fight(i.getPower());
                 System.out.println(i.toString());
            }
        }
        if (powerIn >= 0) {
            System.out.println("Infantryman win!");
        }
        if (powerTr >= 0) {
            System.out.println("Trooper win");
        }
    }

}
