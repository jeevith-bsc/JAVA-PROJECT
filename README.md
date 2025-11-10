# JAVA-PROJECT
public class FoodItem {
    private int id;
    private String name;
    private double price;

public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

public String toString() {
        return id + ". " + name + " - ₹" + price;
    }
}

public class User {
    protected String username;
    protected String email;

public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

 public void displayInfo() {
        System.out.println("User: " + username + " (" + email + ")");
    }
}

public class Customer extends User {
    private String address;

public Customer(String username, String email, String address) {
        super(username, email);
        this.address = address;
    }

public void displayInfo() {
        System.out.println("Customer: " + username + ", Address: " + address);
    }
}
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
import java.util.*;

public class Order<T extends FoodItem> {
    private List<T> items = new ArrayList<>();

public void addItem(T item) {
        items.add(item);
    }
public void removeItem(int id) throws CustomException {
boolean removed = items.removeIf(item -> item.getId() == id);
if (!removed) throw new CustomException("Item not found in order!");
    }

public double getTotal() {
return items.stream().mapToDouble(FoodItem::getPrice).sum();
    }

public void showOrder() {
        items.forEach(System.out::println);
        System.out.println("Total: ₹" + getTotal());
    }
}
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
    
