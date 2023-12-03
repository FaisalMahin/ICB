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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class OADailyReportSceneController implements Initializable {

    @FXML
    private DatePicker reportDate;
    @FXML
    private TextArea reportDescription;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createReportButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void goToBack(ActionEvent event) {
    }
    
}
