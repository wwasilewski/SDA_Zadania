package Programowanie1.tydzien3.niedziela.ex01FX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));

        Scene scene = new Scene(root, 600,500);
        Stage stage = new Stage();
        stage.setTitle("FXML MOJ Example");
        stage.setScene(scene);
        stage.show();
    }
}
