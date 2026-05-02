import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RelogioDigital extends Application
{
	final DateTimeFormatter FORMATTER_TIME = DateTimeFormatter.ofPattern("HH:mm:ss");
	final DateTimeFormatter FORMATTER_DATE = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy");

	@Override
	public void start(Stage stage)
	{
		var labelTime = new Label();
		labelTime.setStyle("-fx-font-size: 20pt; -fx-text-fill: red;");

		var labelDate = new Label();
		labelDate.setStyle("-fx-font-size: 20pt; -fx-text-fill: red;");

		var keyFrameUpdate = new KeyFrame(Duration.ZERO, e -> {
			var now = LocalDateTime.now();
			labelTime.setText(now.format(FORMATTER_TIME));
			labelDate.setText(now.format(FORMATTER_DATE));
		});

		var keyFrameRange = new KeyFrame(Duration.seconds(1));

		var clock = new Timeline();
		clock.getKeyFrames().addAll(keyFrameUpdate, keyFrameRange);

		clock.setCycleCount(Animation.INDEFINITE);
		clock.play();

		var layout = new VBox(labelTime, labelDate);
		layout.setAlignment(Pos.CENTER);
		layout.setStyle("-fx-background-color: black;");

		var scene = new Scene(layout, 300, 150);

		stage.setTitle("Relógio Digital");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}