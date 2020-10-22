package miceVsElephantGuiController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainScreenController {
	
	@FXML
	private Button startButton;
	@FXML
	private TextArea outputTextArea; 
	
	@FXML
	private void startButtonClick()
	{
		outputTextArea.setText("Working");
	}
}
