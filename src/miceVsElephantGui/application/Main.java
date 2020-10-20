package application;
	
import java.awt.Button;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Main extends Application {
	
	Button button;
	
    public static void main(String[] args) 
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
    	Scene scene = new Scene(new StackPane(new Label("Jon")), 640, 480);
    	primaryStage.setScene(scene);
    	primaryStage.show();
    }
}
