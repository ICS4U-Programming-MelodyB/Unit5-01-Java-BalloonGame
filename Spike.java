import java.awt.Color;

/**
 * This program contains the spike,
 * class. Referenced from video.
 *
 * @author  Melody Berhane
 * @version 1.0
 *
 * @since 2023-05-26.
 */

public class Spike {
    // Defining field.
    int xPosition;
    public static final int positionY = 0;

    // Defining method that defines the
    // x position of the spike.
    public Spike(int xPos) {
        xPosition = xPos;
    }

    // Defining method when object,
    // making contact with balloon, it pops.
    public void balloonPopped(Balloon balloon) {
        if (balloon.xPosition == this.xPosition
                && balloon.yPosition == this.positionY) {
            // Balloon gets popped.
            balloon.isPopped = true;
        }
    }

    // Defining method that moves spike, thus
    // allowing for new pos.
    public void moveSpikeHorizontally(int space) {
        this.xPosition = space;
    }
}
