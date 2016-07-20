package sample;

import Shapes.FillableTriangle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.InputMismatchException;

public class Controller {
    private FillableTriangle workByTuna;
    private boolean determineFilled = false;
    @FXML TextArea out;
    @FXML TextField side1Txt;
    @FXML TextField side2Txt;
    @FXML TextField side3Txt;
    @FXML TextField colorTxt;


    @FXML
    public void filledRbutton(ActionEvent actionEvent) {
        determineFilled = true;
    }
    @FXML
    public void work(ActionEvent actionEvent) {
        try {
            double side1 = Double.parseDouble(side1Txt.getText());
            double side2 = Double.parseDouble(side2Txt.getText());
            double side3 = Double.parseDouble(side3Txt.getText());
            workByTuna = new FillableTriangle(side1, side2, side3);
            workByTuna.setColor(colorTxt.getText());
            workByTuna.setFilled(determineFilled);
            out.setText(workByTuna.toString());
        } catch(InputMismatchException ex) {
            out.setText("Failure, incorrect values ");
        } catch(Exception ex) {
            out.setText("Unknown error occured, please try again");
        }
    }
}
