import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.geometry.Insets;
import javafx.event.*;
import javafx.scene.control.*;


public class Calculator extends Application {
    private double resultDob = 0.0;
    private Label result;
    private boolean isFirstClick = false;
    private String lastOperation = "";

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
            stage.initStyle(StageStyle.DECORATED);
            BorderPane root = new BorderPane();
            GridPane operationPane = new GridPane();
            Button[] number = new Button[10];
            Button[] operator = new Button[9];
            int i, j;

            Scene scene = new Scene(root);
            //scene.getStylesheets().add("css/styles.css");
            result = new Label(resultDob + "");
            //result.getStyleClass().add("label");

            for(i = 0; i < number.length; ++i) {
                number[i] = new Button(Integer.toString(i));
                number[i].setId(Integer.toString(i));
                number[i].setPrefWidth(50);
                //number[i].getStyleClass().add("button");
                number[i].addEventHandler(MouseEvent.MOUSE_CLICKED, new ProcessNumber());
            }
            for(j = 0; j < operator.length; ++j) {
                operator[j] = new Button();
                operator[j].setPrefWidth(50);
                //operator[j].getStyleClass().add("button");
                // IMPORTANT object.addEventHandler(MouseEvent.MOUSE_CLICKED, new classType());

            }

            operator[6].addEventHandler(MouseEvent.MOUSE_CLICKED, new Operation());


            operator[0].setText("AC");
            operator[1].setText("+/-");
            operator[2].setText("%");
            operator[3].setText("/");
            operator[4].setText("x");
            operator[5].setText("-");
            operator[6].setText("+");
            operator[6].setId("+");
            operator[7].setText("=");
            operator[8].setText(".");

            operator[7].addEventHandler(MouseEvent.MOUSE_CLICKED, new DisplayResult());

            operationPane.add(operator[0], 0, 0); //OBJECT, COLUMN, FILA
            operationPane.add(number[7], 0, 1); //OBJECT, COLUMN, FILA
            operationPane.add(number[4], 0, 2); //OBJECT, COLUMN, FILA
            operationPane.add(number[1], 0, 3); //OBJECT, COLUMN, FILA
            operationPane.add(number[0], 0, 4); //OBJECT, COLUMN, FILA
            operationPane.add(operator[1], 1, 0); //OBJECT, COLUMN, FILA
            operationPane.add(number[8], 1, 1); //OBJECT, COLUMN, FILA
            operationPane.add(number[5], 1, 2); //OBJECT, COLUMN, FILA
            operationPane.add(number[2], 1, 3); //OBJECT, COLUMN, FILA
            operationPane.add(operator[2], 2, 0); //OBJECT, COLUMN, FILA
            operationPane.add(number[9], 2, 1); //OBJECT, COLUMN, FILA
            operationPane.add(number[6], 2, 2); //OBJECT, COLUMN, FILA
            operationPane.add(number[3], 2, 3); //OBJECT, COLUMN, FILA
            operationPane.add(operator[8], 2, 4); //OBJECT, COLUMN, FILA
            operationPane.add(operator[3], 3, 0); //OBJECT, COLUMN, FILA
            operationPane.add(operator[4], 3, 1); //OBJECT, COLUMN, FILA
            operationPane.add(operator[5], 3, 2); //OBJECT, COLUMN, FILA
            operationPane.add(operator[6], 3, 3); //OBJECT, COLUMN, FILA
            operationPane.add(operator[7], 3, 4); //OBJECT, COLUMN, FILA

            root.setTop(result);
            root.setCenter(operationPane);
            root.setMargin(result, new Insets(20, 0, 20, 0));

            stage.setScene(scene);
            stage.setTitle("Calculator");
            stage.show();
    }

    public class ProcessNumber implements EventHandler<MouseEvent> {
        public void handle(MouseEvent event) {
            if(!isFirstClick) {
                result.setText("");
                isFirstClick = true;
            }
            else {
                Control control = (Control)event.getSource();
                result.setText(result.getText() + control.getId());
                System.out.println("Haz presionado un boton " + control.getId());
            }
        }
    }

    public class Operation implements EventHandler<MouseEvent> {
        public void handle(MouseEvent event) {
            Control control = (Control)event.getSource();
            switch(control.getId()) {
                case "+":
                    System.out.println("Sum");
                    lastOperation="+";
                    resultDob = Double.parseDouble(result.getText());
                    result.setText("0.0");
                    isFirstClick=false;
                    break;
            }
        }
    }
    public class DisplayResult implements EventHandler<MouseEvent> {
        public void handle(MouseEvent event) {
            switch(lastOperation) {
                case "+":
                    System.out.println(result.getText());
                    resultDob = resultDob + Double.parseDouble(result.getText());
                    result.setText(Double.toString(resultDob));
                    break;
            }
        }
    }
}
