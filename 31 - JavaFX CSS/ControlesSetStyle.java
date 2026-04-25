import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlesSetStyle extends Application 
{
	@Override
	public void start(Stage stage)
	{
		var label = new Label("Hello world! I'm a label.");
		label.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 14px; -fx-font-style: italic; -fx-font-weight: bold; -fx-background-color: gray; -fx-text-fill: orange;");

		var button = new Button("Click here");
		button.setStyle("-fx-font-family: 'Verdana'; -fx-font-size: 12px; -fx-background-color:rgba(0, 0, 255, 0.5); -fx-text-fill: white;");

		var textField = new TextField();
		textField.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 16px; -fx-background-color: black; -fx-text-fill: green;");

		var layout = new VBox(label, button, textField);
		
		var scene = new Scene(layout, 300, 200);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
} 