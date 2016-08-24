/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author:Dao Duc Nha Date: 22/8/2016 Version: 1.0 Class main trade
 */
public class MainTrade {

    public static void main(String[] args) throws IOException, NumberFormatException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            int i = 0;
            int j = 0;
            TradeGold[] g = new TradeGold[100];
            TradeMoney[] m = new TradeMoney[100];
            ManagerTrade mng = new ManagerTrade(g, m);
            boolean flag = true;
            while (flag == true) {
                System.out.println("Input ID Trade: ");
                String id = input.readLine();
                System.out.println("Input Date Trade: ");
                String date = input.readLine();
                System.out.println("Input Amount Trade: ");
                int amount = Integer.parseInt(input.readLine());
                System.out.println("Are you want choise Trade money(1) or Trade gold(2)");
                int choiseTypeTrade = Integer.parseInt(input.readLine());

                if (choiseTypeTrade == 1) {
                    TradeMoney newtm = mng.inputInfoTradeMoney(id, date, amount, date);
                    mng.addMoney(newtm);
                    mng.outputArrMoney();
                    i++;
                } else if (choiseTypeTrade == 2) {
                    TradeGold newtg = mng.inputInfoTradeGold(id, date, amount, date);
                    mng.addGold(newtg);
                    mng.outPutArrGold();
                    j++;
                } else {
                    System.out.println("Choise type trade wrong");
                }
            }
        } catch (IOException | NumberFormatException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
