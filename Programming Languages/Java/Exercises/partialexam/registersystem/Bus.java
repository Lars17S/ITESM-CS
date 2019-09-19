import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.*;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Control;

public class Bus extends Scene {

    private GridPane rootGridPane;
    private String selector = "Select place";


    public Bus(MainController mainController) {
        super(new GridPane());
        rootGridPane = new GridPane();
        //GridPane 2 x 5
        Button[] buttons = new Button[10];
        for(int i = 0; i < buttons.length; ++i) {
            buttons[i] = new Button("Vacio");
            buttons[i].addEventHandler(MouseEvent.MOUSE_CLICKED, new SelectPlace());
        }
        rootGridPane.add(buttons[0], 0, 0);
        rootGridPane.add(buttons[1], 0, 1);
        rootGridPane.add(buttons[2], 0, 2);
        rootGridPane.add(buttons[3], 0, 3);
        rootGridPane.add(buttons[4], 0, 4);
        rootGridPane.add(buttons[5], 1, 0);
        rootGridPane.add(buttons[6], 1, 1);
        rootGridPane.add(buttons[7], 1, 2);
        rootGridPane.add(buttons[8], 1, 3);
        rootGridPane.add(buttons[9], 1, 4);
        this.setRoot(rootGridPane);
    }


    public GridPane getRootGridPane() {
        return rootGridPane;
    }

    public class SelectPlace implements EventHandler <MouseEvent>{
        public void handle(MouseEvent event) {
            //eventgetsource
            Button control = (Button)event.getSource();
            System.out.println(control.getText());
            control.setText("OCUPADO");
            System.out.println("Pos X" + rootGridPane.getColumnIndex(control));
            rootGridPane.getChildren().remove(control);
            rootGridPane.add(new Label("OCUPADO"), rootGridPane.getColumnIndex(control), rootGridPane.getRowIndex(control));
        }
    }
}
