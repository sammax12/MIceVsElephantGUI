package miceVsElephantGui;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
			Parent root = FXMLLoader.load(getClass().getResource("fxml_files/gui.fxml"));
			primaryStage.setTitle("Mouse vs Elephant");
			primaryStage.setScene(new Scene(root, 800, 500));
			primaryStage.show();
			*/
			
			Grid grid = new Grid();
			
			
			
			Scene scene = new Scene(grid.drawGrid(30), 1000, 1000); // was 400 400

			        
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
