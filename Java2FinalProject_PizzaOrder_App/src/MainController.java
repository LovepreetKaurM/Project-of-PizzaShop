import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void changeScene(String fxmlName) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlName));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        if (fxmlName.equals("PizzaShop.fxml")) {
            PizzaShopController controller = loader.getController();
            controller.setMainController(this);
        } else if (fxmlName.equals("SecondShop.fxml")) {
            SecondShopController controller = loader.getController();
            controller.setMainController(this);
        }
        else if (fxmlName.equals("FirstShop.fxml")) {
            SecondShopController controller = loader.getController();
            controller.setMainController(this);
        }
    }

    public void LoadPizzaShopFXML() {
    }
}
