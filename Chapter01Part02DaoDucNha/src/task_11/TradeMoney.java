/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_11;

/**
 *
 * @author hv
 */
enum Money {

    USD(22260), EUR(24982), AUD(16764);
    double rank;

    private Money(double rank) {
        this.rank = rank;
    }

    public double getRank() {
        return rank;
    }
}

public class TradeMoney extends Trade {

    Money typeMoney;
    int buyOrSell;

    public TradeMoney() {
    }

    public TradeMoney(Money typeMoney, int buyOrSell, String id, String date, int amount, String typeTrade) {
        super(id, date, amount, typeTrade);
        this.typeMoney = typeMoney;
        this.buyOrSell = buyOrSell;
    }

    public Money getTypeMoney() {
        return typeMoney;
    }

    public void setTypeMoney(Money typeMoney) {
        this.typeMoney = typeMoney;
    }

    public int getBuyOrSell() {
        return buyOrSell;
    }

    public void setBuyOrSell(int buyOrSell) {
        this.buyOrSell = buyOrSell;
    }

    public double calBuyMoney() {
        double money = this.amount * typeMoney.getRank();
        return money;
    }

    public double calSellMoney() {
        double money = this.amount * typeMoney.getRank() + (this.amount * typeMoney.getRank()) * 0.01;
        return money;
    }

    @Override
    public String toString() {
        if(this.buyOrSell == 1){
            return "ID: " + id + " - Date: " + date + " - Amount: " + amount
                + " - Type Trade: " + typeTrade + " - Type Money: " + typeMoney.name()+" - Buy: "+this.calBuyMoney();
        }
        if(this.buyOrSell ==2){
            return "ID: " + id + " - Date: " + date + " - Amount: " + amount
                + " - Type Trade: " + typeTrade + " - Type Money: " + typeMoney.name()+" - Sell: "+this.calSellMoney();
        }
        return "";
    }

}
