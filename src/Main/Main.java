package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author John Molato
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View_Controller/Main.fxml"));
        primaryStage.setTitle("Inventory System Manager");
        primaryStage.setScene(new Scene(root, 1050, 750));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
