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
 * @author:Dao Duc Nha
 * Date: 22/8/2016
 * Version: 1.0 Class manage trade
 */
public class ManagerTrade {

    TradeGold[] tG;
    TradeMoney[] tM;

    public ManagerTrade() {
    }

    public ManagerTrade(TradeGold[] tG, TradeMoney[] tM) {
        this.tG = tG;
        this.tM = tM;
    }

    public TradeGold[] gettG() {
        return tG;
    }

    public void settG(TradeGold[] tG) {
        this.tG = tG;
    }

    public TradeMoney[] gettM() {
        return tM;
    }

    public void settM(TradeMoney[] tM) {
        this.tM = tM;
    }

    public TradeGold inputInfoTradeGold(String id, String date, int amount, String typeTrade) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input Type Gold: Gold9999(1), Gold24k(2), GoldSJC(3)");
        int type = Integer.parseInt(input.readLine());
        Gold g = null;
        switch (type) {
            case 1:
                g = Gold.Gold24K;
                break;
            case 2:
                g = Gold.Gold9999;
                break;
            case 3:
                g = Gold.GoldSJC;
                break;
        }
        TradeGold tG = new TradeGold(g, id, date, amount, typeTrade);
        return tG;
    }

    public TradeMoney inputInfoTradeMoney(String id, String date, int amount, String typeTrade) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input type Money:USD(1), EUR(2), AUD(3)");
        int typeMn = Integer.parseUnsignedInt(input.readLine());
        Money m = null;
        switch (typeMn) {
            case 1:
                m = Money.USD;
                break;
            case 2:
                m = m.EUR;
                break;
            case 3:
                m = m.AUD;
                break;
        }
        System.out.println("Input buy(1) or sell(2): ");
        int bOS = Integer.parseInt(input.readLine());

        TradeMoney tM = new TradeMoney(m, bOS, id, date, amount, typeTrade);
        return tM;
    }

    public boolean addGold(TradeGold newtG) {
        for (int i = 0; i < tG.length; i++) {
            if (tG[i] == null) {
                tG[i] = newtG;
                return true;
            }
        }
        return false;
    }

    public boolean addMoney(TradeMoney newtM) {
        for (int i = 0; i < tM.length; i++) {
            if (tM[i] == null) {
                tM[i] = newtM;
                return true;
            }
        }
        return false;
    }

    public void outputArrMoney() {
        for (TradeMoney tM1 : tM) {
            if (tM1 != null) {
                System.out.println(tM1.toString());
            }

        }
    }

    public void outPutArrGold() {
        for (TradeGold tG1 : tG) {
            if (tG1 != null) {
                System.out.println(tG1.toString());;
            }
        }
    }
}
