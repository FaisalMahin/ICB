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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class OAViewTableMeetingController implements Initializable {

    @FXML
    private TableView<Meeting> meetingTableView;
    @FXML
    private TableColumn<Meeting, String> tableMeetingIDColumn;
    @FXML
    private TableColumn<Meeting, String> tablePurposeColumn;
    @FXML
    private TableColumn<Meeting, String> tableTimecolumn;
    @FXML
    private TableColumn<Meeting, String> tableDatecolumn;
    @FXML
    private TableColumn<Meeting, String> tableapprovalColumn;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableMeetingIDColumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("tableMeetingIDColumn"));
        tablePurposeColumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("tablePurposeColumn"));
        tableTimecolumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("tableTimecolumn"));
        tableDatecolumn.setCellValueFactory(new PropertyValueFactory<Meeting, String>("tableDatecolumn"));
        tableapprovalColumn.setCellValueFactory(new PropertyValueFactory<Meeting,String>("tableapprovalColumn"));
        loadMeetingFile();
    }    
    private void loadMeetingFile() {
        ObjectInputStream ois=null;
         try {
            Meeting s;
            ois = new ObjectInputStream(new FileInputStream("Createmeeting.bin"));
            while(true){
            s = (Meeting) ois.readObject();

            s.display();
            meetingTableView.getItems().add(s);
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
    @FXML
    private void goToBack(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("OfficerAssistantDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
        
    }
    
}
