import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.*;

public class Login extends Application {


    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage) {
        Scene scene1;
        Scene scene2;

        //scene 1 elements
        VBox root = new VBox();
        Label text = new Label("Login Menu");
        TextField name = new TextField("Enter your name");
        PasswordField password = new PasswordField();
        Button loginButton = new Button("Login");
        root.getChildren().addAll(text, name, password, loginButton);
        scene1 = new Scene(root);
        stage.setScene(scene1);



        //scene 2 elements
        VBox root2 = new VBox();
        Label text2 = new Label("You were connected!");
        root2.getChildren().add(text2);
        scene2 = new Scene(root2);


        //Event actions
        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Scene changed");
                stage.setScene(scene2);
            }
        });


        //run
        stage.setTitle("Login menu");
        stage.show();
    }
}
