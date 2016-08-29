package chapter01oom;

/**
 * @author Dao Duc Nha
 * @version 1.0
 * @created 29-Aug-2016 9:15:23 AM
 */
public class ATMCard extends Card implements IAuthMethod {

    private double balance;

    public ATMCard(double balance, String cardID, String dateCreated, Order[] listOrder) {
        super(cardID, dateCreated, listOrder);
        this.balance = balance;
    }

    public ATMCard(double balance, String cardID, String dateCreated, Order[] listOrder, String address, String email, String identityCardNumber, String name, String phoneNumber) {
        super(cardID, dateCreated, listOrder, address, email, identityCardNumber, name, phoneNumber);
        this.balance = balance;
    }

       
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String getAuthMethod() {
        return "true";
    }

}
