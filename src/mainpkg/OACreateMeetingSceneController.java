/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private ComboBox<String> meetingDecisionComboBox;
    ObservableList<String> list1 = FXCollections.observableArrayList("Pending", "Approved");
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        meetingDecisionComboBox.setItems(list1);
    }    

    @FXML
    private void createMeetingButtonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Specify the desired date format
        String dateString = meetingDatePicker.getValue().format(formatter);
          
            f = new File("Createmeeting.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos=new AppendableObjectOutputStream(fos);
            }
            else{
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
            }
            Meeting s=new Meeting(
                    meetingIdTF.getText(),
                    meetingDetailsTF.getText(),
                    meetingTImeTF.getText(),
                    dateString,
                    meetingDecisionComboBox.getValue());  
                
            oos.writeObject(s);
             
            meetingIdTF.clear();meetingDetailsTF.clear();meetingTImeTF.clear();
           
        } catch (IOException ex) {
            Logger.getLogger(OACreateMeetingSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          try {
              if(oos != null) oos.close();
          } catch (IOException ex) {
              Logger.getLogger(OACreateMeetingSceneController.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Congratulation");
        a.setHeaderText("Meeting Generated");
        a.showAndWait();   
    }

    @FXML
    private void goToBack(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("OfficerAssistantDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }
    
}
