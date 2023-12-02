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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class OACreateNoticeSceneController implements Initializable {

    @FXML
    private RadioButton am;
    @FXML
    private RadioButton pm;
    @FXML
    private TextField noticeTopicTF;
    @FXML
    private TextField noticeTimeTF;
    @FXML
    private DatePicker noticeDatePicker;
    @FXML
    private TextArea noticeDescriptionTF;
    @FXML
    private TextArea showNoticeTextArea;

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
    private void loadNoticeButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void createNoticeButtonOnClick(ActionEvent event) {
    }
    
}
