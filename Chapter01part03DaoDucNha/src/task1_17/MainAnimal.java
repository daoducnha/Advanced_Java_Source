/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Bird[] bird = new Bird[100];
        Tiger[] tiger = new Tiger[100];
        Boa[] boa = new Boa[100];
        Fish[] fish = new Fish[100];

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = true;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        while (flag == true && i < 100 && j < 100 && k < 100 && l < 100) {
            System.out.println("do you want input a animal?y/n");
            String yn = input.readLine();
            if (yn.equalsIgnoreCase("n")) {
                flag = false;
            } else if (yn.equalsIgnoreCase("y")) {
                System.out.println("Input name: ");
                String name = input.readLine();
                System.out.println("Input food: ");
                String foof = input.readLine();
                System.out.println("Bird(1), Fish(2), Tiger(3), Boa(4)");
                int choise = Integer.parseInt(input.readLine());
                if (choise == 1) {
                    bird[i] = new Bird(name, foof);
                    i++;
                } else if (choise == 2) {
                    fish[j] = new Fish(name, foof);
                    j++;
                } else if (choise == 3) {
                    tiger[k] = new Tiger(name, foof);
                    k++;
                } else if (choise == 4) {
                    boa[l] = new Boa(name, foof);
                    l++;
                } else {
                    System.out.println("choise Wrong");
                }
            }

        }
        for (Tiger values : tiger) {
            if (values != null) {
                values.outputInfo();
                System.out.println("======================");
            }

        }
        for (Bird values : bird) {
            if (values != null) {
                values.outputInfo();
                System.out.println("======================");
            }
        }
        for (Fish values : fish) {
            if (values != null) {
                values.outputInfo();
                System.out.println("======================");
            }
        }
        for (Boa values : boa) {
            if (values != null) {
                values.outputInfo();
                System.out.println("======================");
            }
        }
    }

}
