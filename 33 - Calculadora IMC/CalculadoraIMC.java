import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class CalculadoraIMC extends Application 
{	
	@Override
	public void start(Stage stage)
	{
		var labelWeight = new Label("Weight");
		var labelHeight = new Label("Height");

		var fieldWeight = new TextField();
		fieldWeight.setPromptText("Weight in kg");
		var fieldHeight = new TextField();
		fieldHeight.setPromptText("Height in meters");

		var labelResult = new Label();

		var buttonCalculate = new Button("Calculate BMI");
		buttonCalculate.setOnAction(e -> {
			try 
			{
				double weight = Double.parseDouble(fieldWeight.getText().replace(",", "."));
				double height = Double.parseDouble(fieldHeight.getText().replace(",", "."));

				double imc = weight / (height * height);
				labelResult.setText(String.format("Your BMI is: %.2f%n", imc) + (
				    imc < 18.5 ? "Underweight" :
				    imc < 25 ? "Normal" :
				    imc < 30 ? "Overweight" :
				    imc < 35 ? "Obese I" :
				    imc < 40 ? "Obese II" : "Obese III"
				));
			}
			catch(NumberFormatException _)
			{
				labelResult.setText("Please, insert valid numbers for weight and height.");
				labelResult.setStyle("-fx-text-fill: red;");
			}
		});

		var layout = new VBox(10, labelWeight, fieldWeight, labelHeight, fieldHeight, buttonCalculate, labelResult);
		layout.setPadding(new Insets(10));
		layout.setAlignment(Pos.CENTER);

		var scene = new Scene(layout, 300, 250);
		stage.setTitle("BMI Calculator");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}