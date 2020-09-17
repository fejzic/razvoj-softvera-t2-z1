
package ba.unsa.etf.rs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {

    @FXML
    private Label labela;
    private Button tipka;

    public void akcija(ActionEvent event) {
        labela.setText("Hello World!");
        }


}
