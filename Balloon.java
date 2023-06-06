import java.awt.Color;

/**
 * This program contains the balloon,
 * class. Referenced from video.
 *
 * @author  Melody Berhane
 * @version 1.0
 *
 * @since 2023-05-26.
 */

public class Balloon {
    // Declare variable/ creating fields.
    int xPosition;
    int yPosition;
    Color color;
    boolean isPopped;
    int id;

    // Define method.
    public Balloon(int xPos, int yPos, Color colour, int idMain) {
        // Referencing field by setting positions equal
        // to each other.
        xPosition = xPos;
        yPosition = yPos;
        color = colour;
        isPopped = false;
        id = idMain;
    }

    // Define another method to change positions.
    public void moveBalloon(int xSpace, int ySpace) {
        // Setting positions equalled to each
        // other.
        this.xPosition = xSpace;
        this.yPosition = ySpace;
    }

    // Defining method to change colour.
    public void changeColour(Color colourNew) {
        // Reassigning new colour.
        this.color = colourNew;
    }
}
