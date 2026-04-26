import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class CalculadoraReajusteSalarial extends Application
{
    @Override
    public void start(Stage stage)
    {
        var labelSalary = new Label("Salary");
        var labelAdjustment = new Label("Adjustment");

        var fieldSalary = new TextField();
        fieldSalary.setPromptText("Gross Salary ($)");
        var fieldAdjustment = new TextField();
        fieldAdjustment.setPromptText("Salary Adjustment (%)");

        var labelResult = new Label();

        var buttonCalculate = new Button("Calculate");
        buttonCalculate.setOnAction(e -> {
            try
            {
                double salary = Double.parseDouble(fieldSalary.getText().replace(",", "."));
                double adjustment = Double.parseDouble(fieldAdjustment.getText().replace(",", "."));

                double increase = salary * (adjustment / 100);
                double newSalary = salary + increase;

                labelResult.setText(String.format("Your new salary will be: $ %.2f%nAdjustment: $ %.2f", newSalary, increase));
                labelResult.setStyle("-fx-text-fill: green;");
            }
            catch(NumberFormatException _)
            {
                labelResult.setText("Please, insert valid numbers for salary and ajustment.");
                labelResult.setStyle("-fx-text-fill: red;");
            }
        });

        var layout = new VBox(10, labelSalary, fieldSalary, labelAdjustment, fieldAdjustment, buttonCalculate, labelResult);
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);

        var scene = new Scene(layout, 350, 250);
        stage.setTitle("Salary Adjustment Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
