import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application
{
	@Override
	public void start(Stage stage)
	{
		var labelName = new Label("Nome: ");
		var labelEmail = new Label("Email: ");

		var fieldName = new TextField();
		var fieldEmail = new TextField();

		var buttonSend = new Button("Send");

		var gridPane = new GridPane();
		gridPane.setHgap(8);
		gridPane.setVgap(8);
		gridPane.setPadding(new Insets(5));

		gridPane.addRow(0, labelName, fieldName);
		gridPane.addRow(1, labelEmail, fieldEmail);
		gridPane.addRow(2, buttonSend);

		var scene = new Scene(gridPane, 400, 200);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}