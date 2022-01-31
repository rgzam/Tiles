package Tiles;
import javafx.geometry.Pos;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.List;


public class GUI extends StackPane {
 int hBoxLabelSpacing = 165;
 int hBoxButtonSpacing = 20;
private static int currentCombo;
 double angleForMediumRectangle = 8;
 double angleForSmallRectangle = -15;

private List<GUI> gui;
GUI thisGUI = this;

Rectangle rectangle = new Rectangle(100,100);
Rectangle largeRectangle = new Rectangle(100,100);
Rectangle mediumRectangle = new Rectangle(65,65);
Rectangle smallRectangle = new Rectangle(30,30);

public int getCurrentCombo() {
 return currentCombo;
}
 public GUI() {

 }
 public GUI(List<GUI> list) {
 this.gui = list;
 rectangle.setFill(null);
 rectangle.setStroke(Color.WHITE);
 rectangle.setStrokeWidth(2);

largeRectangle.setFill(TilesGen.getColorBigRectangle());
mediumRectangle.setFill(TilesGen.getColorMediumRectangle());
smallRectangle.setFill(TilesGen.getColorSmallRectangle());

mediumRectangle.setRotate(angleForMediumRectangle);
smallRectangle.setRotate(angleForSmallRectangle);

getChildren().addAll(largeRectangle,mediumRectangle,smallRectangle);
getChildren().add(rectangle);


 }
 public HBox label() {
 Text currentCombo = new Text("Current Combo: " + getCurrentCombo());
 Label longestCombo = new Label("Longest Combo: 0 ");
 longestCombo.setAlignment(Pos.BASELINE_CENTER);
 longestCombo.setFont(new Board().setFontt());
  HBox hBox = new HBox(hBoxLabelSpacing, currentCombo, longestCombo);
  return  (hBox);
 }


}
