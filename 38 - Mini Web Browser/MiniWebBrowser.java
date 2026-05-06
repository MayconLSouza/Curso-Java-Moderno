import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MiniWebBrowser extends Application
{
	@Override
	public void start(Stage stage)
	{
		var fieldUrl = new TextField();
		var browser = new WebView();
		WebEngine engine = browser.getEngine();

		fieldUrl.setOnAction(event -> engine.load(formatURL(fieldUrl.getText())));

		var vbox = new VBox();
		vbox.getChildren().addAll(fieldUrl, browser);
		var scene = new Scene(vbox);

		stage.setTitle("My Browser Java");
		stage.setScene(scene);
		stage.show();
	}

	public String formatURL (String url)
	{
		if(!url.startsWith("http://") && !url.startsWith("https://"))
			url = "http://" + url;

		return url; 
	}

	public static void main(String[] args)
	{
		launch(args);
	} 
}