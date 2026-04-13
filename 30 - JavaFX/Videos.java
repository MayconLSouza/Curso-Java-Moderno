import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Videos extends Application
{
	@Override
	public void start(Stage stage)
	{
		String filePath = "file:///C:/Happy-Feet-2.mp4";
		var media = new Media(filePath);
		var mediaPlayer = new MediaPlayer(media);
		var mediaView = new MediaView(mediaPlayer);

		var hBox = new HBox();
		hBox.getChildren().add(mediaView);

		var scene = new Scene(hBox, 800, 600);

		stage.setTitle("Video Application");
		stage.setScene(scene);
		stage.show();

		mediaPlayer.play();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}