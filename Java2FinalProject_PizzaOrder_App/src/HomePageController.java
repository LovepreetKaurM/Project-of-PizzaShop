import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
//import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController  {
   // private Stage stage;

    // public void setStage(Stage stage) {
    //     this.stage = stage;
    // }

    @FXML
    private Button login;

    @FXML
    private Button signup;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPass;
    
    static Stage stage2 = new Stage();

    public void initialize() {
        // set the focus on the name field when the page loads
        txtName.requestFocus();
    }

    public void OnClickGo() throws IOException {
       //load the login page when the signup button is clicked
        
        FXMLLoader loader=new FXMLLoader (getClass().getResource ("LoginPage.fxml"));
        Parent root=loader. load () ;
        stage2. setScene (new Scene (root)); 
        stage2. setTitle("Page to Create the Account  ");
        stage2. show();
        Main.stage.hide();
    }

    public void OnClicklogin() throws IOException {

        String uname = txtName. getText ();
        String pswd = txtPass. getText () ;
        if (isValidLogin (uname, pswd))
        {
        FXMLLoader loader=new FXMLLoader (getClass().getResource ("PizzaShop.fxml"));
        Parent root=loader. load () ;
        stage2. setScene (new Scene (root)); 
        stage2. setTitle("Page to Select Pizza Shop");
        stage2. show();
        Main.stage.hide();
        }

        // check if the name and password fields are filled
        if (txtName.getText().isEmpty() || txtPass.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter your name and password.");
            alert.showAndWait();
            return;
        }

        
        else {
            // show an error if the credentials are incorrect
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("You do not have an account. Please sign up.");
            alert.showAndWait();
        }
    }

    public boolean isValidLogin(String username, String password) {
        for (User user : User.userList) {
        if (user.getUsername () . equals (username) && user. getPassword () . equals (password)) {
        return true;
        }
    }
        return false;
}
}
