/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class ReadMeetingSceneController implements Initializable {

    @FXML
    private TextArea viewMeetingTA;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToBack(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("OfficerAssistantDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
         
    }

    @FXML
    private void loadMeetingButtonOnClick(ActionEvent event) {
        ObjectInputStream ois=null;
        try {
           Meeting s;
            ois = new ObjectInputStream(new FileInputStream("Createmeeting.bin"));
           while(true){
           s = (Meeting) ois.readObject();
           String r = s.getMeetingId()+
                     ","+s.getPurpose()+
                     ","+s.getTime()+
                    ","+s.getDate()+
                    ","+s.getAppoval()+"\n";
                    viewMeetingTA.appendText(r);
           }
           
       } catch (Exception ex) {
           try {
               if(ois!=null)
                   ois.close();
           } 
           catch (IOException e) {
               e.printStackTrace();
           }
           ex.printStackTrace();
       }        
    }
    
}
