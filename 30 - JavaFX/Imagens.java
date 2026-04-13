import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Imagens extends Application
{
	@Override
	public void start(Stage stage)
	{
		String filePath = "imagem-gato.jpg";

		var image = new Image(filePath);
		var imageView = new ImageView(image);

		imageView.setFitWidth(613);
		imageView.setFitHeight(640);
		imageView.setPreserveRatio(true);

		var layout = new VBox(imageView);
		var scene = new Scene(layout, 700, 700);

		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}