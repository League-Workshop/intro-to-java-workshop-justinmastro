package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String name=JOptionPane.showInputDialog("What you hate");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on Java!");
		// 3. Ask the user for the name of their best friend
		JOptionPane.showMessageDialog(null, "Is your best friends name Blah Blah Blah");

		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, "Ta ta");

	} 
}



