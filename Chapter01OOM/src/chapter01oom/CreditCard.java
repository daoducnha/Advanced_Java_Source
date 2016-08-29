package chapter01oom;

/**
 * @author Dao Duc Nha
 * @version 1.0
 * @created 29-Aug-2016 9:15:21 AM
 */
public class CreditCard extends Card implements IAuthMethod {

    private String expirationDate;
    private double maxDebt;
    private String type;

    public CreditCard(String expirationDate, double maxDebt, String type, String cardID, String dateCreated, Order[] listOrder) {
        super(cardID, dateCreated, listOrder);
        this.expirationDate = expirationDate;
        this.maxDebt = maxDebt;
        this.type = type;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getMaxDebt() {
        return maxDebt;
    }

    public void setMaxDebt(double maxDebt) {
        this.maxDebt = maxDebt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getAuthMethod() {
        return "true";
    }

}
