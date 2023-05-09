import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PizzaShopController {
    

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private Label l9;

    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    

    @FXML
    private AnchorPane rootPane;

    private ToggleGroup toggleGroup;
    
    @FXML
    private  Stage stage1;

    public void initialize() {
        toggleGroup = new ToggleGroup();
        radio1.setToggleGroup(toggleGroup);
        radio2.setToggleGroup(toggleGroup);
    }

    @FXML
    void Onclick(ActionEvent event)  throws Exception {
        if (toggleGroup.getSelectedToggle() == radio1) {
            Parent firstShopRoot = FXMLLoader.load(getClass().getResource("Firstshop.fxml"));
            Stage firstShopStage = new Stage();
            firstShopStage.setScene(new Scene(firstShopRoot));
            firstShopStage.show();
        } else if (toggleGroup.getSelectedToggle() == radio2) {
            Parent secondShopRoot = FXMLLoader.load(getClass().getResource("Secondshop.fxml"));
            Stage secondShopStage = new Stage();
            secondShopStage.setScene(new Scene(secondShopRoot));
            secondShopStage.show();
        }
    }

    public void setMainController(MainController mainController) {
    }

    

    public void setStage(Stage stage) {
        this.stage1 = stage;
}
}

