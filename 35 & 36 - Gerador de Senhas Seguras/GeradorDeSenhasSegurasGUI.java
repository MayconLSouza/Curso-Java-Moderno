import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GeradorDeSenhasSegurasGUI extends Application
{
	@Override
	public void start(Stage stage)
	{
		stage.setTitle("Password Generator");

		var labelPasswordLength = new Label("Password length:");
		var fieldPasswordLength = new TextField();
		fieldPasswordLength.setText("8");

		var labelPasswordGenerated = new Label("Password generated:");
		var fieldPasswordGenerated = new TextField();
		fieldPasswordGenerated.setEditable(false);
		fieldPasswordGenerated.setStyle("-fx-text-fill: red;");

		var buttonGenerate = new Button("Generate");
		buttonGenerate.setOnAction( e -> {
			int passwordLength = Integer.parseInt(fieldPasswordLength.getText());
			String password = GeradorDeSenhasSeguras.generatePassword(passwordLength);
			fieldPasswordGenerated.setText(password);
		});

		Button copyButton = new Button("Copy");
		copyButton.setOnAction(e -> {
		    var content = new ClipboardContent();
		    content.putString(fieldPasswordGenerated.getText());
		    Clipboard.getSystemClipboard().setContent(content);
		});

		var layout = new VBox(labelPasswordLength, fieldPasswordLength, buttonGenerate, labelPasswordGenerated, fieldPasswordGenerated, copyButton);
		layout.setSpacing(10);
		layout.setPadding(new Insets(10));
		var scene = new Scene(layout, 300, 200);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}