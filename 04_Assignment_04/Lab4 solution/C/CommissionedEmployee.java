import java.util.List;
import java.util.ArrayList;

public class CommissionedEmployee extends Employee {
    private double baseSalary;
    private double commission;
    private List<Order> orders;

    public CommissionedEmployee(String empId, double baseSalary, double commission) {
        super(empId);
        this.baseSalary = baseSalary;
        this.commission = commission;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    protected double calcGrossPay(int month, int year) {
        double totalOrderAmount = orders.stream()
                .filter(order -> order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == year)
                .mapToDouble(Order::getOrderAmount)
                .sum();
        return baseSalary + (commission * totalOrderAmount);
    }
}
