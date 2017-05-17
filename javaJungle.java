//Flavio Leon
//September 28, 2016
//.javaJunglever2
//This is a quiz game.

package javaJungle;

import javax.swing.JOptionPane;
public class javaJungle {

	public static void main(String[] args) {
		
	String playerName, ansOne, ansTwo, ansThree, ansFour, ansFive;
	int menuChoice = 0, total = 0;	//Declare and initialize variables
	
	playerName = JOptionPane.showInputDialog("Player Name:\n "); 
	
	JOptionPane.showMessageDialog(null, "WELCOME " + playerName + "!"); //Introduction
	
	
	 //Display Main Menu
	//Integer.parseInt(JOptionPane.showInputDialog("Main Menu\n 1. See Rules\n 2. Play Game\n 3. Exit "));
	
	//Prompt for user to make main menu choice 
	do
	{
	JOptionPane.showMessageDialog(null, "Please choose from the following menu: ");
	menuChoice = Integer.parseInt(JOptionPane.showInputDialog("1) See Rules\n2) Play Game\n3) Exit\nPlease enter your choice here: "));
	
	switch(menuChoice)
	{
	case 1:
		//Display Rules
		JOptionPane.showMessageDialog(null, "RULES\n 1. User must select an answer option provided  by game.\n 2. User may only progress to next question if a correct response is given.\n "
				+ "3. Rule number 3 is under consideration.\n 4. Rules are subject to change. ");
		break;
		
	case 2:
		//Display Questions and Answers
		
		ansOne = JOptionPane.showInputDialog("QUESTION ONE\n You define an object in Java with a _________ \n A. variable \n B. comments \n C. output \n D. class \n");
		ansOne = ansOne.toUpperCase();
				
		switch (ansOne)
		{
		
		case "A": //Answer A 
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\nThe correct answer is D: You define an object in Java with a class.");
		
		break;
		
		case "B": //Answer B
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\nThe correct answer is D: You define an object in Java with a class.");
		
		break;
		case "C": //Answer C
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\nThe correct answer is D: You define an object in Java with a class.");
		
		break;
		
		case "D": //Answer D
		JOptionPane.showMessageDialog(null, "You chose correctly.\nThe correct answer is D: You define an object in Java with a class.\n"); 
		
		break;
		
		
		default: 
			
		JOptionPane.showMessageDialog(null, "Invalid answer. You must either A, B, C, or D.");
		
		}
		
	
		if (ansOne.equals("D")) //Question One Accumulator
		{
		total+=10;
		JOptionPane.showMessageDialog(null, "The total is now " + total);
		}
		
		ansTwo = JOptionPane.showInputDialog("QUESTION TWO\n What is the order of the software development process? \n" //Question Two
				+ "A. Analysis, Design, Implement, Maintainance, Test and Debug \n"
				+ "B. Test and Debug, Analysis, Design, Implement, Maintenance\n"
				+ "C. Analysis, Design, Implement, Maintainance, Test and Debug\n"
				+ "D. Implement, Design, Test and Debug, Maintenance, Analysis\n"
				);
		ansTwo = ansTwo.toUpperCase();
		
		switch (ansTwo)
		{
		
		case "A": //Answer A
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\nThe correct answer is C: Analysis, Design, Implement, Maintainance, Test and Debug");	
		
		break;
		
		case "B": //Answer B
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\nThe correct answer is C: Analysis, Design, Implement, Maintainance, Test and Debug");
		
		break;
		
		case "C": //Answer C
		JOptionPane.showMessageDialog(null, "You chose correctly.\nThe correct answer is C: Analysis, Design, Implement, Maintainance, Test and Debug\n");
		
		break;
		
		default: //Answer D
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\nThe correct answer is C: Analysis, Design, Implement, Maintainance, Test and Debug");
				
		}
		
		if (ansTwo.equals("C")) //Question Two Accumulator
		{
		total+=10;
		JOptionPane.showMessageDialog(null, "The total is now " + total);
		}
		
		ansThree = JOptionPane.showInputDialog(null, "QUESTION THREE \n Which of the following is an example of camel case? \n" //Question Three
				+ "A. camel_case\n"
				+ "B. camelcase\n"
				+ "C. camelCase\n"
				+ "D. CAMEL CASE\n"
		
				);
		
		ansThree = ansThree.toUpperCase();
		
		switch (ansThree)
		{
		
		case "A": //Answer A
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\nThe correct answer is C: camelCase");	
		
		break;
		
		case "B": //Answer B
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\nThe correct answer is C: camelCase");
		
		break;
		
		case "C": //Answer C
		JOptionPane.showMessageDialog(null, "You chose correctly.\nThe correct answer is C: camelCase\n");
		
		break;
		
		default: //Answer D
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\nThe correct answer is C: camelCase");
		
		}
		
		if (ansTwo.equals("C")) //Question Three Accumulator
		{
		total+=10;
		JOptionPane.showMessageDialog(null, "The total is now " + total);
		}
			
		ansFour = JOptionPane.showInputDialog(null, "QUESTION FOUR \n What is the purpose of a decision structure? \n" //Question Four
				+ "A. Allow a program to have more than one path of execution\n"
				+ "B. Determine whether a specific relationship exists between two values\n"
				+ "C. Calculate the average of three numbers\n"
				+ "D. Print a line\n"
		
				);
		
		ansFour = ansFour.toUpperCase();
		
		switch (ansFour)
		{
		
		case "A": //Answer A
		JOptionPane.showMessageDialog(null, "You chose correctly.\n A decision structure allows a program to have more than one path of execution.\n");	
		
		break;
		
		case "B": //Answer B
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\n A decision structure allows a program to have more than one path of execution.");
		
		break;
		
		case "C": //Answer C
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\n A decision structure allows a program to have more than one path of execution.");
		
		break;
		
		default: //Answer D
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\n A decision structure allows a program to have more than one path of execution.");
		
		}
		
		if (ansFour.equals("A")) //Question Four Accumulator
		{
		total+=10;
		JOptionPane.showMessageDialog(null, "The total is now " + total);
		}
		
		ansFive = JOptionPane.showInputDialog(null, "QUESTION FIVE \n Which relational operator means not equal to ? \n" //Question Five
				+ "A. ==\n"
				+ "B. x=\n"
				+ "C. !=\n"
				+ "D. ##\n"
		
				);
		
		ansFive = ansFive.toUpperCase();
		
		switch (ansFive)
		{
		
		case "A": //Answer A
		JOptionPane.showMessageDialog(null, "You have chosen poorly\nThe relational operator for not equal to is != .");	
		
		break;
		
		case "B": //Answer B
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\n The relational operator for not equal to is != .");
		
		break;
		
		case "C": //Answer C
		JOptionPane.showMessageDialog(null, "You chose correctly. The relational operator for not equal to is != .\n");
		
		break;
		
		default: //Answer D
		JOptionPane.showMessageDialog(null, "You have chosen poorly.\n The relational operator for not equal to is != .");
		
		}
		
		if (ansTwo.equals("C")) //Question Five Accumulator
		{
		total+=10;
		JOptionPane.showMessageDialog(null, "The total is now " + total);
		}
		
		break; //Main menu Case 2 break
		
		case 3: 
		JOptionPane.showMessageDialog(null,"Have a nice day!!");
		
		break;
		
		default:
		JOptionPane.showMessageDialog(null, "Invalid. You must choose 1 - 3 from the menu.\n");
		
		
	}//end Main Menu switch
	
	} //Main Menu Do While Loop
	while(menuChoice != 3);
	
	
	
	}

	private static int parseInt(String showInputDialog) {

		return 0;
	}

	
	
	
		
		
	
	
	
	
	
	
	
	
	
	
}

	