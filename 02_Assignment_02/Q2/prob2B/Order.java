package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private  int orderNum  ;
    private List<OrderLine> ol = null;

    public Order(int order){
        this.orderNum = order;
        this.ol = new ArrayList<OrderLine>();

    }

    public void addOrderLine(OrderLine orLien){
        this.ol.add(orLien);
    }

}
