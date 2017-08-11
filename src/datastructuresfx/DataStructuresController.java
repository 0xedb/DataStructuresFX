package datastructuresfx;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;

/**
 *
 * @author bruno
 */
public class DataStructuresController implements Initializable {

    private static int size = 0;

    @FXML
    private JFXButton spush;
    @FXML
    private JFXButton spop;
    @FXML
    private JFXButton sempty;
    @FXML
    private JFXButton speek;
    @FXML
    private TilePane stackDS;
    @FXML
    private JFXTextField sdata;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void stackPush(ActionEvent event) {
        String data = sdata.getText();
        if (data.length() < 1) {
            return;
        }
        size++;
        Button button = new Button(data);
        button.setMinWidth(stackDS.widthProperty().doubleValue());
        button.setStyle("-fx-background-color: wheat;");
        stackDS.getChildren().add(0, button);
    }

    @FXML
    private void stackPop(ActionEvent event) {
        if (size == 0) {
            return;
        }
        stackDS.getChildren().remove(0);
        size--;
    }

    @FXML
    private void isStackEmpty(ActionEvent event) {
    }

    @FXML
    private void stackPeek(ActionEvent event) {
    }

}
