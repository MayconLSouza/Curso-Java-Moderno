import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Layouts extends Application 
{
	@Override
	public void start(Stage stage)
	{
		var button1 = new Button("Button 1");
		var button2 = new Button("Button 2");
		var hBox = new HBox(button1, button2);
		hBox.setAlignment(Pos.CENTER);

		var button3 = new Button("Button 3");
		var button4 = new Button("Button 4");
		var vBox = new VBox(button3, button4);
		vBox.setAlignment(Pos.CENTER);

		var borderPane = new BorderPane();
		borderPane.setTop(hBox);
		borderPane.setCenter(vBox);

		var scene = new Scene(borderPane, 300, 300);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
} 