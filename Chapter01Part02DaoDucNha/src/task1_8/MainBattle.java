/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author:Dao Duc Nha
 * Date: 22/8/2016
 * Version: 1.0 Class main battle
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
        //Input information of Infantryman
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
        
        //input information of Trooper
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
        
        //discription a battle
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
