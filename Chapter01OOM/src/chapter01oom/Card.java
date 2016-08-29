package chapter01oom;



/**
 * @author Dao Duc Nha
 * @version 1.0
 * @created 29-Aug-2016 9:15:23 AM
 */
public class Card extends Information {

	protected String cardID;
	protected String dateCreated;
	public Order[] listOrder;

    public Card(String cardID, String dateCreated, Order[] listOrder, String address, String email, String identityCardNumber, String name, String phoneNumber) {
        super(address, email, identityCardNumber, name, phoneNumber);
        this.cardID = cardID;
        this.dateCreated = dateCreated;
        this.listOrder = listOrder;
    }

    public Card(String cardID, String dateCreated, Order[] listOrder) {
        this.cardID = cardID;
        this.dateCreated = dateCreated;
        this.listOrder = listOrder;
    }

	

	

}