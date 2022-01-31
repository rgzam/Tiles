package Tiles;

import java.awt.*;
import java.util.Random;

public class TilesGen extends Canvas {

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
    public static Color getColorMediumRectangle(){
        Random random = new Random();
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
            return Color.GREEN;
            case 1:
                return Color.ORANGE;
            case 2:
                return Color.YELLOW;
        }
        return Color.BLACK;
    }
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
