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
