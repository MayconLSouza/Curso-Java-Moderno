import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import java.io.File;

public class FileChooserExample extends Application
{
	@Override
	public void start(Stage stage)
	{
		var fileChooser = new FileChooser();
		fileChooser.setTitle("Select File");

		var buttonOpen = new Button("Open File");
		buttonOpen.setOnAction( e -> {
			File selectedFile = fileChooser.showOpenDialog(stage);
			if(selectedFile != null)
				showImage(selectedFile, stage);
		});

		var layout = new VBox(buttonOpen);
		var scene = new Scene(layout, 800, 600);
		stage.setTitle("Testing FileChooser");
		stage.setScene(scene);
		stage.show();
	}

	private void showImage(File selectedFile, Stage stage)
	{
		var image = new Image(selectedFile.toURI().toString());
		var imageView = new ImageView(image);

		VBox layout = (VBox) stage.getScene().getRoot();
		layout.getChildren().add(imageView);

		imageView.setFitWidth(500);
		imageView.setFitHeight(500);

		stage.setTitle("FileChooser");
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}