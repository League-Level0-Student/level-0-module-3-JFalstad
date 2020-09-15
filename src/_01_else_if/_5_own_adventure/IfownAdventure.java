package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class IfownAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String story = JOptionPane.showInputDialog(
				"This a story about pootis. You are in the woods and you are trying to find the one and only pootis."
						+ "\n"
						+ "If you find him, speak to him and tell him what you want to achieve your dreams and he will give it to you as long as you are polite."
						+ "\n" + "If you disrespect the pootis, he will get angry and start creating a curse on you."
						+ "\n" + "So, let's begin. Do you want to go towards the left or right passage?");
		if (story.equalsIgnoreCase("left")) {
			JOptionPane.showMessageDialog(null,
					"Great, you made it to the shortcut! Now your adventure will be shorter!");
			story = JOptionPane.showInputDialog("You see pootis, would you like to speak to him?");
			if (story.equalsIgnoreCase("yes")) {
				JOptionPane.showInputDialog("What do you want your wish to be?");
				JOptionPane.showMessageDialog(null, "Great, your wish has been granted!");
			}
			if (story.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Then why are you here?");
			}

		} else if (story.equalsIgnoreCase("right")) {
			JOptionPane.showMessageDialog(null,
					"Darn, you picked the longer way. At least you will still get to meet pootis!");
			story = JOptionPane.showInputDialog(null,
					"Oof, you stumbled upon a dead end, would you like to climb the trees or go home?");
			if (story.equalsIgnoreCase("climb the trees")) {
				story = JOptionPane.showInputDialog(null,
						"You are climbing and then you see the mighty pootis in the distance. You jump off the tree and run in his direction."
								+ "\n" + "You finally get to him. Would you like to speak to him?");
				if (story.equalsIgnoreCase("yes")) {
					JOptionPane.showInputDialog("What do you want your wish to be?");
					JOptionPane.showMessageDialog(null, "Great, your wish has been granted!");
				}
				if (story.equalsIgnoreCase("no")) {
					JOptionPane.showMessageDialog(null, "Then why are you here?");
				}
			}

		}

		else {
			JOptionPane.showMessageDialog(null, "I don't know what you are saying, please type in left or right.");
		}
	}

}
