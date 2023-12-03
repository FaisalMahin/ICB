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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class OACreateMeetingSceneController implements Initializable {

    @FXML
    private TextField meetingIdTF;
    @FXML
    private TextField meetingDetailsTF;
    @FXML
    private TextField meetingTImeTF;
    @FXML
    private DatePicker meetingDatePicker;
    @FXML
    private ComboBox<?> meetingDecisionComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createMeetingButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goToBack(ActionEvent event) {
    }
    
}
