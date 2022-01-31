package Tiles;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import java.util.List;
import java.util.ArrayList;


public class Board {
    int ROW = 6;
    int COLUMN = 6;
    int totalTiles = ROW*COLUMN;
    int windowWidth = 660;
    int windowHeight = 660;
    int fontSize = 25;

    private FlowPane root = new FlowPane();

    GUI gui = new GUI();
    private List<GUI> oneGui = new ArrayList<>();
    public void createPane(){
        root.setPrefSize(windowWidth, windowHeight  );
        root.setPadding(new Insets(20,20,0,20));
        List<GUI> listOfTiles= new ArrayList<>();
        for (int i = 0; i< totalTiles; i++){
            listOfTiles.add(new GUI(oneGui));
        }
        for (int i = 0; i< totalTiles; i++) {
            GUI gui = listOfTiles.get(i);
            gui.setTranslateX(i % ROW);
            gui.setTranslateY(i / ROW);
        }

    }
    public Parent getRoot(){
        return root;
    }


}
