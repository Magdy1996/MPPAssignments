public class Order {
    private String orderNo;
    private java.time.LocalDate orderDate;
    private double orderAmount;

    public Order(String orderNo, java.time.LocalDate orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public java.time.LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
