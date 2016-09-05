/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task28Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class MainObserver {
    public static void main(String[] args) throws IOException{
        Account account = new Account();
        account.setState(10000000);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Input money: ");
        double money = Double.parseDouble(input.readLine());
        
        if(money>account.getState()){
            System.out.println("Not enoung money");
        }else{
            double mn = account.getState()-money;
            
            
            EmailObserver am = new EmailObserver(account);
            MobiObserver mb = new MobiObserver(account);
            account.notifyAllObservers();
        }
    }
    
}

