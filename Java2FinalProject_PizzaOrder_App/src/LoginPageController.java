import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginPageController implements Initializable {
    @FXML
    private Label l5;

    @FXML
    private Label l6;

    @FXML
    private Label l7;

    @FXML
    private Label l8;
    @FXML
    private Button done;

    @FXML
    private TextField txtNAME;

    @FXML
    private TextField txtPASS;

    @FXML
    private TextField txtREPass;
    

    static Stage stage3=new Stage();


    @FXML
    void OnclickGO() {
        if (!txtPASS.getText().equals(txtREPass.getText())) {
            User user = new User(txtNAME.getText(), txtPASS.getText());
            user.add(user);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Password Mismatch");
            alert.setHeaderText("Password and Re-entered Password do not match");
            alert.setContentText("Please re-enter your password.");
            alert.showAndWait();
        } else {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("PizzaShop.fxml"));
                Scene scene = new Scene(root);
                Stage stage3 = new Stage();
                stage3.setScene(scene);
                stage3.show();
                Main.stage2.hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }


}
