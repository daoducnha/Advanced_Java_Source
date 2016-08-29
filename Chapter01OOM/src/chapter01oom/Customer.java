package chapter01oom;



/**
 * @author Dao Duc Nha
 * @version 1.0
 * @created 29-Aug-2016 9:15:19 AM
 */
public class Customer extends Information {

	private String customerID;
	public Order[] listOrder;

    public Customer() {
       
    }

        
    public Customer(String customerID, Order[] listOrder, String address, String email, String identityCardNumber, String name, String phoneNumber) {
        super(address, email, identityCardNumber, name, phoneNumber);
        this.customerID = customerID;
        this.listOrder = listOrder;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public Order[] getListOrder() {
        return listOrder;
    }

    public void setListOrder(Order[] listOrder) {
        this.listOrder = listOrder;
    }

}