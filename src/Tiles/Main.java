package Tiles;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) { launch(args); }
    @Override
    /**
     * hBox pane is inserted inside BorderPane,
     * BorderPane is inserted inside AnchorPane
     */
    public void start(Stage stage) {
        stage.setTitle("Tiles");
        Board board = new Board();
        BorderPane borderpane = new BorderPane();
        AnchorPane anchorPane = new AnchorPane();

        board.createPane();
        Parent root = board.getRoot();

        borderpane.setCenter(root);
        borderpane.setBottom(new GUI().label());
        borderpane.setTop(new Board().button());
        anchorPane.getChildren().add(borderpane);


    stage.setScene(new Scene(anchorPane));
    stage.show();

    }


}
