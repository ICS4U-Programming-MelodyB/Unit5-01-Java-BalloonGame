import java.awt.Color;

/**
 * This program contains the main,
 * class. Referenced from video.
 *
 * @author  Melody Berhane
 * @version 1.0
 *
 * @since 2023-05-26 .
 */

/**
 * This is the main method.
 *
* @param args Unused.
*/
public class Main {
    public static void main(String[] args) {
        // Creates the balloon & spike.
        Balloon balloonA = new Balloon(61, 45, Color.GREEN, 1);
        Balloon balloonB = new Balloon(41, 56, Color.RED, 2);
        final Spike spike = new Spike(10);

        // Prints everytime the position or color
        // is changed.
        System.out.println(balloonA.color);
        balloonA.changeColour(Color.BLUE);
        System.out.println(balloonA.color);

        // Prints the positions of the balloons.
        System.out.print("Balloon A:  " + balloonA.xPosition);
        System.out.println("," + balloonA.yPosition);
        System.out.print("Balloon B: " + balloonB.xPosition);
        System.out.println("," + balloonB.yPosition);
        balloonA.moveBalloon(85, 92);

        // Position changing.
        spike.balloonPopped(balloonA);
        System.out.println("The spike has moved.");
        System.out.print("Balloon A: " + balloonA.xPosition);
        System.out.println("," + balloonA.yPosition);
        System.out.print("Balloon B: " + balloonB.xPosition);
        System.out.println("," + balloonB.yPosition);

        // Position changing.
        System.out.print("Balloon A: " + balloonA.xPosition);
        System.out.println("," + balloonA.yPosition);
        System.out.print("Balloon B: " + balloonB.xPosition);
        System.out.println("," + balloonB.yPosition);
        balloonB.moveBalloon(39, -10);
        System.out.println("The balloon has been moved!");
        spike.balloonPopped(balloonB);

        // Position changing.
        System.out.print("Balloon A: " + balloonA.xPosition);
        System.out.println("," + balloonA.yPosition);
        System.out.print("Balloon B: " + balloonB.xPosition);
        System.out.println("," + balloonB.yPosition);

        // Moving spike.
        System.out.println(spike.xPosition + "," + Spike.positionY);
        spike.moveSpikeHorizontally(34);
        System.out.println("Spike has been moved!");
        spike.balloonPopped(balloonA);
        spike.balloonPopped(balloonB);
        System.out.println(spike.xPosition + "," + Spike.positionY);

        // Prints the statement when the balloon is popped.
        if (balloonA.isPopped || balloonB.isPopped) {
            System.out.println("The balloon has been popped.");
        }

    }

}
