import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controles extends Application 
{
	@Override
	public void start(Stage stage)
	{
		var label = new Label("Hello world! I'm a label.");
		var button = new Button("Click here");
		var textField = new TextField();
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