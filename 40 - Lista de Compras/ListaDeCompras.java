import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ListaDeCompras extends Application
{
	private ArrayList<String> listaDeCompras = new ArrayList<>();
	private ListView<String> listaVisualizavel = new ListView<>();

	@Override
	public void start(Stage stage)
	{
		stage.setTitle("Aplicativo de Lista de Compras");

		var textFieldDescricaoItem = new TextField();
		
		var btnAdicionar = new Button("Adicionar");
		var btnRemover = new Button("Remover");
		var btnExportar = new Button("Exportar Lista");

		var labelAdicionar = new Label("Digite o item que deseja adicionar:");
		var labelListaDeCompras = new Label("Lista de Compras:");
		var labelArquivoExportado = new Label();

		ObservableList<String> observableListaDeCompras = FXCollections.observableArrayList(listaDeCompras);
		listaVisualizavel.setItems(observableListaDeCompras);

        var hboxBotoes = new HBox();
        hboxBotoes.getChildren().addAll(btnAdicionar, btnRemover);
        hboxBotoes.setSpacing(10); 

		var vBox = new VBox();
		vBox.getChildren().addAll(labelAdicionar, textFieldDescricaoItem, hboxBotoes);
		vBox.getChildren().addAll(labelListaDeCompras, listaVisualizavel, btnExportar);
		vBox.setSpacing(10);
		vBox.setPadding(new Insets(10));

		btnAdicionar.setOnAction(e -> {
			String item = textFieldDescricaoItem.getText();
			if(!item.isEmpty())
			{
				listaDeCompras.add(item);
				listaVisualizavel.getItems().add(item);
				textFieldDescricaoItem.clear();
			}
		});

		btnRemover.setOnAction(e -> {
		    String itemSelecionado = listaVisualizavel.getSelectionModel().getSelectedItem();
		    
		    if(itemSelecionado != null && !itemSelecionado.isEmpty())
		    {
		        listaDeCompras.remove(itemSelecionado);
		        listaVisualizavel.getItems().remove(itemSelecionado);
		    }
		});

		btnExportar.setOnAction(e -> {
			try 
			{
				var arquivo = new File("listaDeCompras.txt");
				var writer = new PrintWriter(arquivo);

				for(String item : listaDeCompras)
					writer.println(item);

				writer.close();

				labelArquivoExportado.setText("Arquivo exportado com sucesso!");
				labelArquivoExportado.setStyle("-fx-text-fill: green;");
			}
			catch(Exception ex)
			{
				System.out.println("Erro ocorrido: " + ex.getMessage());
				labelArquivoExportado.setText("Erro ao exporta arquivo!");
				labelArquivoExportado.setStyle("-fx-text-fill: red;");
			}
		});

		vBox.getChildren().addAll(labelArquivoExportado);
		var scene = new Scene(vBox, 350, 300);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}