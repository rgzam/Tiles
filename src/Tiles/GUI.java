package Tiles;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.List;


public class GUI extends StackPane {
private static int currentCombo;

private List<GUI> gui;
GUI thisGUI = this;

Rectangle rectangle = new Rectangle(100,100);
Rectangle largeRectangle = new Rectangle(100,100);
Rectangle mediumRectangle = new Rectangle(65,65);
Rectangle smallRectangle = new Rectangle(30,30);


 public GUI() {

 }
 public GUI(List<GUI> gui) {
 }



}
