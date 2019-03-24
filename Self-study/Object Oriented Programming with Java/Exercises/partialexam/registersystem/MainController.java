import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class MainController extends Application{

    protected static Stage mainStage;
    private Scene registerPanel = new RegisterPanel(this);
    private Scene bus = new Bus(this);
    private ArrayList<User> users = new ArrayList<User>();

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage) {
        initializeBus();
        mainStage = stage;
        mainStage.setTitle("Register User");
        mainStage.setScene(registerPanel);
        mainStage.show();
    }

    public Stage getMainStage() {
        return mainStage;
    }

    public User getUserByIndex(int index) {
        return users.get(index);
    }

    public void addUser(User user) {
        users.add(user);
    }

    //Scene cannot be converted to RegisterPanel
    public Scene getRegisterPanel() {
        return registerPanel;
    }

    public Scene getBus() {
        return bus;
    }

    void initializeBus() {

    }
}
