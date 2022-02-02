package Tiles;
import javafx.scene.paint.Color;
import java.awt.*;
import java.util.Random;

public class TilesGen extends Canvas {
    /**
     * Creates three random color for big rectangle
     * @return
     */
    public static Color getColorBigRectangle(){
        Random random = new Random();
        int rand = random.nextInt(3);
        switch(rand) {
            case 0:
                return Color.RED;
            case 1:
                return Color.BLUE;
            case 2:
                return Color.CYAN;
        }
        return Color.BLACK;
    }

    /**
     * Creates three random color for medium rectangle
     * @return
     */
    public static Color getColorMediumRectangle(){
        Random random = new Random();
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
            return Color.GREEN;
            case 1:
                return Color.DARKSLATEBLUE;
            case 2:
                return Color.YELLOW;
        }
        return Color.BLACK;
    }

    /**
     * Creates three random color for small rectangle
     * @return
     */
    public static Color getColorSmallRectangle(){
        Random random = new Random();
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                return Color.BLACK;
            case 1:
                return Color.MAGENTA;
            case 2:
                return Color.WHITE;
        }
        return Color.BLACK;
    }
}
