package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
		if (happy.equalsIgnoreCase("no")) {
			happy = JOptionPane.showInputDialog("Do you want to be happy?");
		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
		if (happy.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
