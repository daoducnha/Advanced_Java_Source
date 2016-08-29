package chapter01oom;

/**
 * @author Dao Duc Nha
 * @version 1.0
 * @created 29-Aug-2016 9:15:20 AM
 */
public class Order {

    private String orderDate;
    private boolean printOrder;
    private String status;

    public OrderDetail[] orderDetail;

    public Order() {

    }

    public Order(String orderDate, boolean printOrder, String status, OrderDetail[] orderDetail) {
        this.orderDate = orderDate;
        this.printOrder = printOrder;
        this.status = status;
        this.orderDetail = orderDetail;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isPrintOrder() {
        return printOrder;
    }

    public void setPrintOrder(boolean printOrder) {
        this.printOrder = printOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public OrderDetail[] getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail[] orderDetail) {
        this.orderDetail = orderDetail;
    }

    //calculate amunt not Tax, out put money not tax
    public double calSubTotal() {
        if (printOrder == false) {
            return 0;
        } else {
            double subTatal = 0;
            for (OrderDetail values : orderDetail) {
                if (values != null) {
                    subTatal += values.calLineTotal();
                }
            }
            return subTatal;
        }

    }

    //calculate tax of a order
    public double calTax() {

        return this.calSubTotal() * 0.1;
    }

    //calculate tax of a Total Amount of  an order include Tax;
    public double calTotalAmount() {

        return this.calSubTotal() + this.calTax();
    }

    //Print list product of an Oder
    void printListOderDetail() {
        for (OrderDetail values : orderDetail) {
            if (values != null) {
                System.out.println("Name: " + values.product.getName() + " - Price: "
                        + values.product.getPrice() + " - Quantity: " + values.getQuantity()
                        + " - Tatal Product: " + values.calLineTotal());
            }
        }
        System.out.println("Print Order: "+ printOrder);
        System.out.println("Tax: "+ this.calTax());
        System.out.println("Tatal: "+ this.calTotalAmount());
        
    }

}
