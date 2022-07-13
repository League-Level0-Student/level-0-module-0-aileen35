package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		// This will print to the console which is where the programmer sees information
		//System.out.println("hello world");
		
		//This will create a pop up that request information with a text field and saves it to a String variable called input
		String input = JOptionPane.showInputDialog("What is your name?");
		
		//This will display a pop-up with the user input
		JOptionPane.showMessageDialog(null,"Hello "+input);
	}

}
