package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.stage.Stage;


import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class CreateController {
    private IModel model=new Model();
    /**
    public CreateController(IModel model){
        this.model=model;

    }
     **/
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private PasswordField confirmpassword;
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField city;
    @FXML
    private DatePicker birthdate ;
    @FXML
    public Button closeButton;
    /**
     *
     * @param event
     * @throws IOException
     * this function create user on the database
     */
    @FXML
    private void createUser(ActionEvent event) throws IOException {
        String usernameS,passwordS,confirmS,firstS,lastS,cityS,dateS;
        passwordS=password.getText();
        confirmS=confirmpassword.getText();
        usernameS = username.getText();
        firstS = firstname.getText();
        lastS = lastname.getText();
        cityS = city.getText();
        dateS = birthdate.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        if (usernameS.length() == 0 || passwordS.length() == 0 || confirmS.length() == 0 ||
                    firstS.length() == 0 || lastS.length() == 0 || cityS.length() == 0 || dateS.length() == 0) {
            //if one or more deails aren't filled
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setHeaderText("Input not valid");
                errorAlert.setContentText("At least one of the fields are empty.\nFill all fields and try again ");
                errorAlert.showAndWait();
            } else{
                if(!passwordS.equals(confirmS)){
                    //if passwords dont match
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setHeaderText("Input not valid");
                    errorAlert.setContentText("Passwords doesn't match.\nPlease try again.");
                    errorAlert.showAndWait();
                }
                else {
                    boolean flag=model.Create(usernameS,passwordS,firstS,lastS,dateS,cityS);
                    if(flag){
                        Alert success = new Alert(Alert.AlertType.CONFIRMATION);
                        success.setHeaderText("Action Succeeded");
                        success.setContentText("New user created successfuly! ");
                        success.showAndWait();
                    }
                    else{
                        Alert fail = new Alert(Alert.AlertType.ERROR);
                        fail.setHeaderText("Action Failed");
                        fail.setContentText("Username already taken.\nPlease choose different one and try again ");
                        fail.showAndWait();
                    }


            }
        }

    }


    @FXML
    public void handleCloseButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
