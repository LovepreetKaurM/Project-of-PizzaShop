import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class SecondShopController {
    
    @FXML
    private CheckBox check3;
    
    @FXML
    private CheckBox check4;
    
    @FXML
    private Label l17;
    
    @FXML
    private VBox v2;
    
    @FXML
    private ImageView image5;
    
    @FXML
    private ImageView image6;
    
    @FXML
    private Button next2;
    
    @FXML
    private Button back2;
    
    @FXML
    private Button done2;
    
    private double pizzaPrice;
    private double taxRate = 0.1; // 10% tax rate
    
    @FXML
    private void initialize() {
        // Initialize the pizza price based on the selection of the checkboxes
        if (check3.isSelected()) {
            image5.setOpacity(1.0); // Highlight the selected image
            pizzaPrice = 10.0;
        }
        if (check4.isSelected()) {
            image6.setOpacity(1.0); // Highlight the selected image
            pizzaPrice = 15.0;
        }
    }
    
    @FXML
    private void OnClick() {
        // Update the pizza price based on the selection of the checkboxes
        if (check3.isSelected()) {
            image5.setOpacity(1.0); // Highlight the selected image
            pizzaPrice = 10.0;
        } else {
            image5.setOpacity(0.5); // Dim the unselected image
        }
        if (check4.isSelected()) {
            image6.setOpacity(1.0); // Highlight the selected image
            pizzaPrice = 15.0;
        } else {
            image6.setOpacity(0.5); // Dim the unselected image
        }
    }
    
    @FXML
    private void OnClickGo() {
        // Calculate the price including tax and display it in the label
        double priceWithTax = pizzaPrice * (1.0 + taxRate);
        l17.setText(String.format("Pizza price: $%.2f (including %.0f%% tax)", priceWithTax, taxRate*100.0));
    }
    
    @FXML
    private void OnClickDone() {
        // Display a message that the order is placed
        System.out.println("Order placed!");
    }
    
    @FXML
    private void OnClickBack() {
        // Load the previous FXML file
        // (Assuming the main controller has a method called "LoadPizzaShopFXML()")
        MainController mainController = new MainController();
        mainController.LoadPizzaShopFXML();
    }

	public void setMainController(MainController mainController) {
	}
    
}
