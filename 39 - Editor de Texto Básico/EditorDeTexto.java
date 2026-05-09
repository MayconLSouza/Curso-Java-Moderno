import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.PrintWriter;

public class EditorDeTexto extends Application
{
	@Override
	public void start(Stage stage)
	{
		var editableArea = new TextArea();
		
		var btnSave = new Button("Salvar");
		btnSave.setOnAction(e -> saveText(editableArea));

		var toolBar = new ToolBar(btnSave);

		var borderPane = new BorderPane();
		borderPane.setTop(toolBar);
		borderPane.setCenter(editableArea);

		var scene = new Scene(borderPane, 800, 600);
		stage.setTitle("Editor de Texto");
		stage.setScene(scene);
		stage.show();
	}

	private void saveText(TextArea textArea)
	{
		var fileChooser = new FileChooser();
		fileChooser.setTitle("Salvar Arquivo de Texto");
		var file = fileChooser.showSaveDialog(null);

		if (file != null)
		{
			try (var writer = new PrintWriter(file))
			{
				writer.println(textArea.getText());
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}