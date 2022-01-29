
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.layout.VBox;

import java.awt.*;

public class GUI extends VBox{
 private Canvas canvas;


 public GUI() {

     this.canvas = new Canvas(400,400);

     this.getChildren().addAll(this.canvas);


 }
 public void draw(){
     GraphicsContext g = this.canvas.getGraphicsContext2D();
     g.setFill(Color.LIGHTGRAY);
     g.fillRect(0,0,450,450);
 }

}
