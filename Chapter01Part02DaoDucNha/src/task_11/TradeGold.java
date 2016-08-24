/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_11;

/**
 *
 * @author:Dao Duc Nha
 * Date: 22/8/2016
 * Version: 1.0 Class  trade Gold
 */
enum Gold {

    Gold9999(3583000), Gold24K(3500000), GoldSJC(3694000);
    double rank;

    private Gold(double rank) {
        this.rank = rank;
    }

    public double getRank() {
        return rank;
    }
}

public class TradeGold extends Trade {

    Gold gold;

    public TradeGold() {
    }

    public TradeGold(Gold gold, String id, String date, int amount, String typeTrade) {
        super(id, date, amount, typeTrade);
        this.gold = gold;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public double calPriceGold() {
        double money = this.amount * gold.getRank();
        return money;
    }

    @Override
    public String toString() {
        return "ID: " + id + " - Date: " + date + " - Amount: " + amount +
                " - Type Trade: " + typeTrade + " - Type Gold: " + gold.name() +
                " - Money: " + this.calPriceGold();
    }

}
