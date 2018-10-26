package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class UpdateController {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField city;
    @FXML
    private DatePicker birthdate ;
    @FXML
    public Button closeButton; //todo add the close button of windows

    /**
     * the function insert the relevant data to the fields and call the appropriate method in the model

     */
    public void updateUser(ActionEvent event) throws IOException{
        String usernameS,passwordS,confirmS,firstS,lastS,cityS,dateS;
        passwordS=password.getText();
        usernameS = username.getText();
        firstS = firstName.getText();
        lastS = lastName.getText();
        cityS = city.getText();
        dateS = birthdate.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
