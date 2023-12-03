/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

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
        File f = null;
        FileWriter fw = null;
        try {

            f = new File(reportDate.getValue() + ".txt");
            if (f.exists()) {
                fw = new FileWriter(f, true);
            } else {
                fw = new FileWriter(f);
            }

            fw.write(
                    reportDescription.getText() + "\n" // \n -> next line ,start a new line
            );

        } catch (IOException ex) {
            //TODO
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                //TODO
            }
        }

        reportDescription.clear();

        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Congratulation");
        a.setHeaderText("Report Created Successfully");
        a.showAndWait();
    }

    @FXML
    private void goToBack(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("OfficerAssistantDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene1);
        window.show();

    }

}
