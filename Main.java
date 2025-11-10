public class Main {
    public static void main(String[] args) {
        FoodItem item = new FoodItem(1, "Burger", 99.99);
        System.out.println(item);

        Customer customer = new Customer("Jesse", "jesse@email.com", "123 Street, City");
        customer.displayInfo();
    }
}
