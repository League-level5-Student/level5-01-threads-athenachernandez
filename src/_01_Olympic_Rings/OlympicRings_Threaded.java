package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {

	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(500, 500);
		Robot yellow = new Robot(550, 600);
		Robot black = new Robot(600, 500);
		Robot green = new Robot(650, 600);
		Robot red = new Robot(700, 500);
 
		blue.setSpeed(5);
		yellow.setSpeed(5);
		black.setSpeed(5);
		green.setSpeed(5);
		red.setSpeed(5);

		Thread blueC = new Thread(() -> {
			blue.setSpeed(100);
			blue.setPenColor(Color.blue);
			blue.penDown();

			for (int i = 0; i < 360; i++) {
				blue.move(1);
				blue.turn(1);
			}
		});

		Thread blackC = new Thread(() -> {
			black.setSpeed(100);
			black.penDown();

			for (int i = 0; i < 360; i++) {
				black.move(1);
				black.turn(1);
			}
		});
		
		Thread yellowC = new Thread(() -> {
			yellow.setSpeed(100);
			yellow.setPenColor(Color.yellow);
			yellow.penDown();

			for (int i = 0; i < 360; i++) {
				yellow.move(1);
				yellow.turn(1);
			}
		});
		
		Thread greenC = new Thread(() -> {
			green.setSpeed(100);
			green.setPenColor(Color.green);
			green.penDown();

			for (int i = 0; i < 360; i++) {
				green.move(1);
				green.turn(1);
			}
		});
		
		Thread redC = new Thread(() -> {
			red.setSpeed(100);
			red.setPenColor(Color.red);
			red.penDown();

			for (int i = 0; i < 360; i++) {
				red.move(1);
				red.turn(1);
			}
		});

		blueC.start();
		yellowC.start();
		blackC.start();
		greenC.start();
		redC.start();
	}
}
