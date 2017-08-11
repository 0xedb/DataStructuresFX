package datastructuresfx;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.util.Duration;

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
    private JFXButton speek;
    @FXML
    private TilePane stackDS;
    @FXML
    private JFXTextField sdata;
    @FXML
    private Label ssize;
    @FXML
    private ScrollPane sspane;
    @FXML
    private Pane detailsPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void stackPush(ActionEvent event) {
        String data = sdata.getText();
        if (data.length() < 1) {
            return;
        }
        ssize.setText(Integer.toString(++size));
        Button button = new Button(data);
        button.setMinWidth(224);
        button.setMaxWidth(224);
        button.setTooltip(new Tooltip(data));
        button.setStyle("-fx-background-color: wheat;");
        stackDS.getChildren().add(0, button);
        sdata.clear();
    }

    @FXML
    private void stackPop(ActionEvent event) {
        if (size == 0) {
            return;
        }
        stackDS.getChildren().remove(0);
        ssize.setText(Integer.toString(--size));
    }

    @FXML
    private void stackPeek(ActionEvent event) {
        if (size > 0) {
            stackDS.getChildren().get(0).setStyle("-fx-background-color: #48745D;");

            PauseTransition transition = new PauseTransition(Duration.millis(1000));
            transition.play();
            transition.setOnFinished((ActionEvent event1) -> {
                stackDS.getChildren().get(0).setStyle("-fx-background-color: wheat;");
            });

        }
    }

}
