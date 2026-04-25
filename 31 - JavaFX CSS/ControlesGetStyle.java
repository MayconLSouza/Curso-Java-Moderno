import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlesGetStyle extends Application 
{
	@Override
	public void start(Stage stage)
	{
		var label = new Label("Hello world! I'm a label.");
		label.getStyleClass().add("label");

		var button = new Button("Click here");
		button.getStyleClass().add("button");

		var textField = new TextField();
		textField.getStyleClass().add("textField");

		var layout = new VBox(label, button, textField);
		
		var scene = new Scene(layout, 300, 200);
		scene.getStylesheets().add("file:///C:/styles.css");

		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
} 