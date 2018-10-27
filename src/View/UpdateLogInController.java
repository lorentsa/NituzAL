package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.io.IOException;

public class UpdateLogInController {
    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Button logIn;
    /**
     *
     * @param event
     * the function opens the update form of the user
     */
    @FXML
    private void openUpdateForm(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("Update.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Update User");
            stage.setScene(new Scene(root1));
            stage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
