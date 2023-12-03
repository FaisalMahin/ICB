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
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private void goToBack(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("OfficerAssistantDashboard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void createNoticeButtonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Specify the desired date format
            String dateString = noticeDatePicker.getValue().format(formatter);

            f = new File("notice.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            Notice s = new Notice(
                    noticeTopicTF.getText(),
                    dateString,
                    noticeTimeTF.getText(),
                    noticeDescriptionTF.getText());

            oos.writeObject(s);

            noticeTopicTF.clear();
            noticeTimeTF.clear();
            noticeDescriptionTF.clear();

        } catch (IOException ex) {
            Logger.getLogger(investorCreatenoticeController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(investorcreatenoticeController.class.getName()).log(Level.SEVERE, null, ex);
            }
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Congratulation");
            a.setHeaderText("Notice Created");
            a.showAndWait();
        }

    }

    @FXML
    private void loadNoticeButtonOnClick(ActionEvent event) {
        ObjectInputStream ois = null;
        try {
            Notice s;
            ois = new ObjectInputStream(new FileInputStream("notice.bin"));
            while (true) {
                s = (Notice) ois.readObject();
                String r = s.getNoticetopic()
                        + "," + s.getDate()
                        + "," + s.getTime()
                        + "," + s.getDescription() + "\n";
                showNoticeTextArea.appendText(r);
            }

        } catch (Exception ex) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }
    }

    private static class investorCreatenoticeController {

        public investorCreatenoticeController() {
        }
    }

    private static class investorcreatenoticeController {

        public investorcreatenoticeController() {
        }
    }

}
