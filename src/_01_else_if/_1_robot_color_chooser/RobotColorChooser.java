
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robot = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		robot.penDown();
		//3. Set the pen width to 10
		robot.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
		for (int i = 0; i < 20; i++) {
		String colorPen = JOptionPane.showInputDialog("What color pen would you like the Robot to draw with?");
		if (colorPen.equals("red")){
        	robot.setPenColor(Color.red);
        }
        else if (colorPen.equals("blue")) {
        	robot.setPenColor(Color.blue);
        }
        else if (colorPen.equals("yellow")) {
        	robot.setPenColor(Color.yellow);
        }
        else { robot.setRandomPenColor();
        
        }
		robot.setSpeed(10);
		for (int j = 0; j < 4; j++) {
		robot.move(200);
		robot.turn(90);
		}
		}
		
		//6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
