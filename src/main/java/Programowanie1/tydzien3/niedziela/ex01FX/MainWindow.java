package Programowanie1.tydzien3.niedziela.ex01FX;

import Programowanie1.tydzien3.sobota.Zadania009.ex01.NumberConverter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainWindow
{
    @FXML
    Button guzik1;

    @FXML
    TextField text1;

    public void onbuttonclick(ActionEvent actionEvent)
    {
        NumberConverter nc = new NumberConverter();
        text1.setText(nc.convertToString(Integer.parseInt(text1.getText())));
    }
}
