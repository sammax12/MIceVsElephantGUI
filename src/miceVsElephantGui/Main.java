package miceVsElephantGui;


import miceVsElephantGuiController.MainScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/gui.fxml"));
			Pane root = (Pane) loader.load();
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
			
			loader.setController(new MainScreenController());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
