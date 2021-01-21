package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

import javax.xml.crypto.Data;


public class Controller {
    @FXML
    private Button button;

    @FXML
    private TextArea textArea;

    @FXML
    private TextField textField;

    @FXML
    void initialize() {

    }

    @FXML
    public void PressButton(ActionEvent actionEvent) {
       String text = textField.getText();
       textField.clear();
       textArea.appendText(text + System.lineSeparator());
    }


}
