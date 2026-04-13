import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Listas extends Application
{
	@Override
	public void start(Stage stage)
	{
		ObservableList<String> items = FXCollections.observableArrayList("Item 1", "Item 2", "Item 3");
		var listView = new ListView<String>(items);

		var layout = new VBox(listView);
		var scene = new Scene(layout, 300, 200);
		
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}