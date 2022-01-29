import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
    GUI gui = new GUI();
    Scene scene = new Scene(gui,640,480);
    stage.setScene(scene);
    stage.show();

    gui.draw();
    }

    public static void main(String[] args) {
    launch();

    }

}
