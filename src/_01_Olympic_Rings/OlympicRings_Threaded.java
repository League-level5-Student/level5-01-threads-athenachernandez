package _01_Olympic_Rings;

import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	static ArrayList<Robot> robots = new ArrayList<Robot>();

	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(400, 700);
		Robot yellow = new Robot(400, 700);
		Robot black = new Robot(400, 700);
		Robot green = new Robot(400, 700);
		Robot red = new Robot(400, 700);

		robots.add(blue);
		robots.add(yellow);
		robots.add(black);
		robots.add(green);
		robots.add(red);

		blue.setSpeed(10);
		yellow.setSpeed(10);
		black.setSpeed(10);
		green.setSpeed(10);
		red.setSpeed(10);

		Thread r6 = null;
		Thread r6turn = null;
		for (int j = 0; j < 360; j++) {
			 r6 = new Thread(() -> blue.move(1));
			 r6turn = new Thread(() -> blue.turn(1));
		}

//		Thread r1 = new Thread(() -> blue.move(400));
//		Thread r2 = new Thread(() -> yellow.move(400));
//		Thread r3 = new Thread(() -> black.move(400));
//		Thread r4 = new Thread(() -> green.move(400));
//		Thread r5 = new Thread(() -> red.move(400));

		
		r6.start();
		r6turn.start();
	}
}
