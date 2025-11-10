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