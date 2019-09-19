import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.event.*;
import javafx.event.ActionEvent;

public class RegisterPanel extends Scene {
    private VBox rootRegisterPanel;

    public RegisterPanel(MainController mainController) {
        super(new VBox());

        rootRegisterPanel = new VBox();

        TextField inputName = new TextField("Name");
        TextField typeSell = new TextField("Type");
        Button continueButton = new Button("Continue");
        rootRegisterPanel.getChildren().addAll(inputName, typeSell, continueButton);
        this.setRoot(rootRegisterPanel);

        continueButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                mainController.addUser(new User(inputName.getText(), typeSell.getText()));
                mainController.getMainStage().setScene(mainController.getBus());
            }
        });
    }
}
