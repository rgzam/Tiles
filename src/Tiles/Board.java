package Tiles;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.scene.Parent;
import java.awt.*;
import java.util.ArrayList;

public class Board {
    private Constants constants = new Constants();
    GUI gui = new GUI();
    private List<GUI> onegui = new ArrayList<>();
    public void createPane(){
        root.setPrefSize(windoWidth, windowHeight  );
        root.setPadding(new Insets(20,20,0,20));
        List<GUI> listOfTiles= new ArrayList<>();
        for (int i = 0; i< totalTiles; i++){
            listOfTiles.add(new GUI(onegui));
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
