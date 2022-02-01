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

this.setOnMouseEntered(event -> rectangle.setStroke(Color.BLACK));
this.setOnMouseExited(event -> rectangle.setStroke(Color.WHITE));

this.setOnMouseClicked(event -> {
 gui.add(thisGUI);

 if (gui.size() == 2){
  GUI g1 = gui.remove(0);
  GUI g2 = gui.remove(0);

  if (g1.largeRectangle.getFill().equals(g2.largeRectangle.getFill())){
   g1.largeRectangle.setVisible(false);
   g2.largeRectangle.setVisible(false);
   currentCombo++;
   label();
  }
  if (g1.mediumRectangle.getFill().equals(g2.mediumRectangle.getFill())){
   g1.mediumRectangle.setVisible(false);
   g2.mediumRectangle.setVisible(false);
  }
  if (g1.smallRectangle.getFill().equals(g2.smallRectangle.getFill())){
   g1.smallRectangle.setVisible(false);
   g2.smallRectangle.setVisible(false);
  }
 }
});


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
