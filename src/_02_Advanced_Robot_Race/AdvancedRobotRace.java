package _02_Advanced_Robot_Race;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.

	static ArrayList<Robot> robots = new ArrayList<Robot>();

	public static void main(String[] args) {
		Robot r1 = new Robot();
		Robot r2 = new Robot();
		Robot r3 = new Robot();
		Robot r4 = new Robot();
		Robot r5 = new Robot();

		robots.add(r1);
		robots.add(r2);
		robots.add(r3);
		robots.add(r4);
		robots.add(r5);

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.size(); i++) {
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robots.get(i).setY(600);
			robots.get(i).setX(i * 200 + 50);
			robots.get(i).setSpeed(10);
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		Random random = new Random();

		Thread robot1 = new Thread(() -> {
			boolean inFrame = true;
			int winner = 0;
			while (inFrame) {
				for (int i = 0; i < robots.size(); i++) {
					if (robots.get(i).getY() < 0) {
						JOptionPane.showMessageDialog(null, "Robot #" + winner + " is the winner!");
						System.exit(0);
						break;
					} else {
						winner = i;
					}
				}
				r1.move(random.nextInt(51));

			}
		});

		Thread robot2 = new Thread(() -> {
			boolean inFrame = true;
			int winner = 0;
			while (inFrame) {
				for (int i = 0; i < robots.size(); i++) {
					if (robots.get(i).getY() < 0) {
						JOptionPane.showMessageDialog(null, "Robot #" + winner + " is the winner!");
						System.exit(0);
						break;
					} else {
						winner = i;
					}
				}
				r2.move(random.nextInt(51));
			}
		});

		Thread robot3 = new Thread(() -> {
			boolean inFrame = true;
			int winner = 0;
			while (inFrame) {
				for (int i = 0; i < robots.size(); i++) {
					if (robots.get(i).getY() < 0) {
						JOptionPane.showMessageDialog(null, "Robot #" + winner + " is the winner!");
						System.exit(0);
						break;
					} else {
						winner = i;
					}
				}
				r3.move(random.nextInt(51));
			}
		});

		Thread robot4 = new Thread(() -> {
			boolean inFrame = true;
			int winner = 0;
			while (inFrame) {
				for (int i = 0; i < robots.size(); i++) {
					if (robots.get(i).getY() < 0) {
						JOptionPane.showMessageDialog(null, "Robot #" + winner + " is the winner!");
						System.exit(0);
						break;
					} else {
						winner = i;
					}
				}
				r4.move(random.nextInt(51));
			}
		});

		Thread robot5 = new Thread(() -> {
			boolean inFrame = true;
			int winner = 0;
			while (inFrame) {
				for (int i = 0; i < robots.size(); i++) {
					if (robots.get(i).getY() < 0) {
						JOptionPane.showMessageDialog(null, "Robot #" + winner + " is the winner!");
						System.exit(0);
						break;
					} else {
						winner = i;
					}
				}
				r5.move(random.nextInt(51));
			}
		});

		robot1.start();
		robot2.start();
		robot3.start();
		robot4.start();
		robot5.start();

	}

}
