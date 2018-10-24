package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.awt.*;
import java.io.IOException;

public class Controller {

    private Model theModel = new Model();

    @FXML
    private TextField DeleteUserNameOutput;
    @FXML
    private PasswordField DeletePasswordOutput;

    /**
     *
     * @param event by choosing the delete option in view.fxml
     *              The function open new scene.
     */
    @FXML
    private void openDeleteForm(ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Delete.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("DeleteForm");
            stage.setScene(new Scene(root1));
            stage.show();


    }

    /**
     * @param event - by choosing "delete" in Delete.fxml
     *              this function connect controller and model.
     */
    @FXML
    private void deleteUser(ActionEvent event)
    {
        theModel.Delete(DeleteUserNameOutput.getText(), DeletePasswordOutput.getText());
    }

}
