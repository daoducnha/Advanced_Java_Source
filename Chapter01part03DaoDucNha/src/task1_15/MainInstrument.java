/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_15;

import java.awt.Choice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author NHA
 */
public class MainInstrument {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Input name instrument: ");
        String name = input.readLine();
        System.out.println("Input name publisher: ");
        String publisher = input.readLine();
        
        System.out.println("Choise Stringed Instrument(1) or Non-Stringed Instrument(2)");
        int choise = Integer.parseInt(input.readLine());
        
        if(choise == 1){
            System.out.println("Input amount String: ");
            int amountString = Integer.parseInt(input.readLine());
            StringedInstrument sI = new StringedInstrument();
            sI.setAmoutString(amountString);
            sI.setNameIntrument(name);
            sI.setPublisher(publisher);
            sI.play();
        }else if(choise == 2){
            System.out.println("Input guild: ");
            String guild = input.readLine();
            NonStringedInstrument nSI = new NonStringedInstrument();
            nSI.setNameIntrument(name);
            nSI.setPublisher(publisher);
            nSI.setUseed(guild);
            nSI.play();
        }else {
            System.out.println("Choise Wrong");
        }
    }
}
