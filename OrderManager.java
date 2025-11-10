import java.util.*;

public class OrderManager {
    private Map<Integer, Order<FoodItem>> orders = new HashMap<>();
    private int orderCount = 0;

    public synchronized int placeOrder(Order<FoodItem> order) {
        orders.put(++orderCount, order);
        return orderCount;
    }

    public void viewOrders() {
        orders.forEach((id, order) -> {
            System.out.println("Order #" + id);
            order.showOrder();
        });
    }
}
