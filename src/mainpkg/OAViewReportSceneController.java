/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class OAViewReportSceneController implements Initializable {

    @FXML
    private DatePicker enterDateofViewReport;
    @FXML
    private TextArea viewReportTA;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void viewReportButtonOnClick(ActionEvent event) {
        File file = new File(enterDateofViewReport.getValue() + ".txt");
        Scanner sc;
        String str = null;
        try {
            sc = new Scanner(file);
            viewReportTA.setText(null);
            while (sc.hasNextLine()) {
                str = sc.nextLine();
                viewReportTA.appendText(str + "\n");

            }
        } catch (FileNotFoundException ex) {
            //todo
        }

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
