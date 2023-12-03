/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
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


public class LoginSceneController implements Initializable {

    @FXML
    private TextField userIdTextField;
    @FXML
    private TextField userPasswordTextField;
    @FXML
    private ComboBox<String> selectUserComboBox;
    ObservableList<String> list1 = FXCollections.observableArrayList(
            "Office Assistant",
            "Financial Advisor",
            " Human Resource Manager",
            "Regulators and Supervisory Body",
            "Shareholders",
            "Investor",
            "Real Estate Developers",
            "Companies and Corporations");

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectUserComboBox.setItems(list1);
        
    }    

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException {
        if(userIdTextField.getText().equals("omi") && userPasswordTextField.getText().equals("1234") && selectUserComboBox.getValue().equals("Office Assistant")) {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("OfficerAssistantDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Success!!!");
        a.setHeaderText("LogIn Successful");
        a.setContentText("Sign in as Office Assistant");
        a.showAndWait(); 
    }
        else if(userIdTextField.getText().equals("omi") && userPasswordTextField.getText().equals("1235") && selectUserComboBox.getValue().equals("Investor")) {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("InvestorDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Success!!!");
        a.setHeaderText("LogIn Successful");
        a.setContentText("Sign in as Investor");
        a.showAndWait();
    }
        else if(userIdTextField.getText().equals("sayma") && userPasswordTextField.getText().equals("1236") && selectUserComboBox.getValue().equals("Regulators and Supervisory Body")) {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("RASBDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Success!!!");
        a.setHeaderText("LogIn Successful");
        a.setContentText("Sign in as a Regulators and Supervisor");
        a.showAndWait();
    } 
        else if(userIdTextField.getText().equals("sayma") && userPasswordTextField.getText().equals("1237") && selectUserComboBox.getValue().equals("Shareholders")) {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("shareholder dashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Success!!!");
        a.setHeaderText("LogIn Successful");
        a.setContentText("Sign in as a Shareholder");
        a.showAndWait();
    }
        else{
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Oops! Something went wrong!");
        a.setHeaderText("Invalid Id and Password");
        a.setContentText("Please try again!");
        a.showAndWait();   
        }
        userIdTextField.clear();userPasswordTextField.clear();    

    }
}
