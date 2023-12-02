/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class OASocialEventPageController implements Initializable {

    @FXML
    private ComboBox<?> decisionComboBox;
    @FXML
    private TextArea eventdescriptionTA;
    @FXML
    private TextField eventPurposeTF;
    @FXML
    private DatePicker eventDate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToBack(ActionEvent event) {
    }

    @FXML
    private void submitInfoButtonOnClick(ActionEvent event) {
    }
    
}
