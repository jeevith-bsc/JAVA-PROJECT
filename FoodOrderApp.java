import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FoodOrderApp extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Select Food Item:");
        ComboBox<String> foodMenu = new ComboBox<>();
        foodMenu.getItems().addAll("Pizza - ₹250", "Burger - ₹150", "Coke - ₹50");

        Button orderBtn = new Button("Place Order");
        Label status = new Label();

        // Lambda Expression for Event Handling
        orderBtn.setOnAction(e -> {
            String choice = foodMenu.getValue();
            if (choice == null) {
                status.setText("Please select an item!");
            } else {
                status.setText("Order Placed: " + choice);
            }
        });

        VBox root = new VBox(10, label, foodMenu, orderBtn, status);
        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Online Food Ordering System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
