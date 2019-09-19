import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HelloWorld extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        //EventHandler is a functional interface.
        //ActionEvent class representing some type of action.
        btn.setOnAction(new EventHandler<ActionEvent>() {

            //Always write public void handle(ActionEvent event)
            @Override
            public void handle(ActionEvent event) {
                //Do something
                System.out.println("Hello World");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 250);
        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();
    }
}
