package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		JOptionPane.showInputDialog("Do you know code");

		// 2. If they say "yes", tell them they will rule the world.
		speak("you will rule the world");

		// 3. Otherwise, wish them good luck washing dishes.
		speak("good luck washing dishes");

	}
}

