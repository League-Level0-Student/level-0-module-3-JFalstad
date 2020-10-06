
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(0);
		rob.miniaturize();
		// 2. Make the robot draw a star shape. Hint: angle=144.
		rob.setSpeed(20);
		rob.penDown();
		rob.turn(144);
		rob.move(30);
		rob.turn(75);
		rob.move(30);
		rob.turn(200);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(210);
		rob.move(30);
		rob.turn(60);
		rob.move(30);
		rob.turn(200);
		rob.move(30);
		rob.turn(120);
		rob.move(30);
		rob.turn(200);
		rob.move(30);
		rob.turn(80);
		rob.move(30);
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
