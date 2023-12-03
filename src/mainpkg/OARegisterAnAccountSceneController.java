/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class OARegisterAnAccountSceneController implements Initializable {

    @FXML
    private TextField fisrtNameTF;
    @FXML
    private TextField lastNameTF;
    @FXML
    private TextField phoneNumTF;
    @FXML
    private TextField emailTF;
    @FXML
    private ComboBox<String> accountTypeComboBox;
    ObservableList<String> list1 = FXCollections.observableArrayList("Investor","HR Manager","Office Assistant","Stackholder","Employeee");
    @FXML
    private TextField nidTF;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        accountTypeComboBox.setItems(list1);
        
    }    

    @FXML
    private void registerButtonOnClick(ActionEvent event) {
        ArrayList u = new ArrayList<Registernewmember>();
        u.add(new Registernewmember(fisrtNameTF.getText(), lastNameTF.getText(), accountTypeComboBox.getValue(), phoneNumTF.getText(), emailTF.getText(),nidTF.getText()));
        
        File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream out=null;
        
        try {
            f = new File("Registernewmember.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                out=new AppendableObjectOutputStream(fos);
            }
            else{
                fos=new FileOutputStream(f);
                out=new ObjectOutputStream(fos);
            }
            for (Object Registernewmember : u)
                out.writeObject((Registernewmember)Registernewmember);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Registernewmember.bin"));
            Registernewmember d;
            while (true) {
                d = (Registernewmember) in.readObject();
                System.out.println(d.toString());
            }
            // in.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        fisrtNameTF.clear();lastNameTF.clear();phoneNumTF.clear();nidTF.clear();emailTF.clear();
        
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Congratulation");
        a.setHeaderText("Successfully Registered As A New Member");
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
