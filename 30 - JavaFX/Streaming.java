import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Streaming extends Application
{
	@Override
	public void start(Stage stage)
	{
		var webView = new WebView();

		String url = "https://www.youtube.com/watch?v=4_tiv9v964k&list=RD4_tiv9v964k&start_radio=1";

		webView.getEngine().load(url);
		var scene = new Scene(webView, 800, 600);

		stage.setTitle("Streaming Application");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}