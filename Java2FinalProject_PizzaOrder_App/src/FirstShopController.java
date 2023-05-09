import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class FirstShopController {

    @FXML
    private AnchorPane a1;

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private Button next1;

    @FXML
    private Button back1;

    @FXML
    private Label L10;

    @FXML
    private Label L11;

    @FXML
    private ImageView image3;

    @FXML
    private ImageView image4;

    @FXML
    private Label l12;

    @FXML
    private VBox v1;

    @FXML
    private Label l13;

    @FXML
    private Button done1;

    private double pizzaPrice;
    private final double TAX_RATE = 0.10;

    @FXML
    void initialize() {
        // Set font for labels
        Font font = new Font("Arial Bold Italic", 18);
        L10.setFont(font);
        font = new Font("Arial Bold Italic", 14);
        L11.setFont(font);
        l12.setFont(font);
    }

    @FXML
    void OnClick() {
        // Calculate pizza price based on checkbox selection
        pizzaPrice = 0;
        if (check1.isSelected()) {
            pizzaPrice += 12.0;
        }
        if (check2.isSelected()) {
            pizzaPrice += 16.0;
        }
    }

    @FXML
    private void OnClickGo(ActionEvent event) throws IOException {
        if (event.getSource() == back1) {
            // load the last stage of PizzaShop.fxml
            MainController mainController = new MainController();
              mainController.LoadPizzaShopFXML();
        }
    }

    @FXML
    void OnClickNext() {
        // Display pizza price information in v1
        String pizzaType = "";
        double totalPrice = pizzaPrice * (1 + TAX_RATE);
        if (check1.isSelected() && check2.isSelected()) {
            pizzaType = "Large and Extra Large Pizza";
        } else if (check1.isSelected()) {
            pizzaType = "Large Pizza";
        } else if (check2.isSelected()) {
            pizzaType = "Extra Large Pizza";
        } else {
            // No pizza selected, do not update l13
            return;
        }
        String priceText = String.format("%s: $%.2f\nTax: $%.2f\nTotal: $%.2f",
                pizzaType, pizzaPrice, pizzaPrice * TAX_RATE, totalPrice);
        l13.setText(priceText);
    }

    @FXML
    void OnClickDone() {
        // Show order placed message
        System.out.println("Order placed.");
    }
    

}
