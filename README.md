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

    @Override
    public void displayInfo() {
        System.out.println("Customer: " + username + ", Address: " + address);
    }
}


