	//Flavio Leon
	//October 31, 2016
	//.javaGamev5.java
	//This is a quiz game.

	import javax.swing.JOptionPane;
	import java.io.*;
	import java.util.Scanner;

		public class javaver5 {
		
		public static void main(String[] args) throws IOException {
			
		String playerName;

		int menuChoice = 0, total = 0;	//Declare and initialize variables
				
		playerName = JOptionPane.showInputDialog("Player Name:\n "); 
		
		JOptionPane.showMessageDialog(null, "WELCOME " + playerName + "!"); //Introduction
		
		
		 //Display Main Menu
		//Integer.parseInt(JOptionPane.showInputDialog("Main Menu\n 1. See Rules\n 2. Play Game\n 3. Exit "));
		
		//Prompt for user to make main menu choice 
		do //Main Menu Do While Loop Begins
		{
			//call DisplayMainMenu Method
			menuChoice = DisplayMainMenu();
			
			//JOptionPane.showMessageDialog(null, "Please choose from the following menu: ");
			//menuChoice = Integer.parseInt(JOptionPane.showInputDialog("1) See Rules\n2) Play Game\n3) Exit\nPlease enter your choice here: "));
			
		switch(menuChoice)
		{
		case '1':
			
			//call DisplayRules Method
			//DisplayRules();
	
			break;
			
		case '2':
			//Display Questions and Answers
			
			//Declare File object
			File inFile = new File("questions.txt");
			
			//declare a Scanner object
			Scanner fileInput = new Scanner(inFile);
			
			for (int i = 1; i <= 7; i++) 	//For Loop Begins
			{	
				
			total += ProcessQuestion(fileInput.nextLine(), fileInput.nextLine(), fileInput.nextLine(),fileInput.nextLine(),fileInput.nextLine(), fileInput.nextLine(), fileInput.nextInt());
	
			fileInput.nextLine();
			
			} //Close For Loop
			
			JOptionPane.showMessageDialog(null, "CONGRATS ON COMPLETING!!! Your GRAND total is " + total);
			
			break; //Main menu Case 2 break
			
			case '3': 	
			JOptionPane.showMessageDialog(null,"Have a nice day!!");
			
			break;
			
			default:
			JOptionPane.showMessageDialog(null, "Invalid. You must choose 1 - 3 from the menu.\n");
			
		}
		//end Main Menu switch
		
	}
		
	while(menuChoice != 3);
		
		
		}
	
		private static int parseInt(String showInputDialog) {
		
		
			return 0;
		}

		
		 public static char DisplayMainMenu()
		 {
			 	String menuChoice;
				//prompt for choice
			 	JOptionPane.showMessageDialog(null, "Please choose from the following menu: ");
			 	//return the main menu choice
				menuChoice = (JOptionPane.showInputDialog("1) See Rules\n2) Play Game\n3) Exit\nPlease enter your choice here: "));
				
				return menuChoice.charAt(0);
		 }
		
		 public static void DisplayRules()
		 {
				JOptionPane.showMessageDialog(null, "RULES\n 1. User must select an answer option provided  by game.\n 2. User may only progress to next question if a correct response is given.\n "
						+ "3. Rule number 3 is under consideration.\n 4. Rules are subject to change. ");

		 }
		
		 public static int ProcessQuestion(String q1, String ansA, String ansB, String ansC, String ansD, String correctAns, int pointValue)
		 {
			 String userAns; 
			 
			 //display a question and corresponding 4 answers
			//Question is read from questions.txt	
			JOptionPane.showMessageDialog(null, q1 + "\n" + ansA +"\n"+ ansB +"\n"+ ansC +"\n"+ ansD + "\n");
				
			
			//prompt for correct answer
			userAns = JOptionPane.showInputDialog("Enter your answer here:" );
		//	char userAns1 =userAns.charAt(0); //converting the user's answer from string to char  
			
			 //display correct/incorrect answer
				
			 //return points received- if correct: 10 point if incorrect zero points
			
			if ( userAns == correctAns)
			{
			JOptionPane.showMessageDialog(null, "You have answered correctly");
			
			}
			 
			else
			{
			JOptionPane.showMessageDialog(null, "You answered incorrectly, the correct answer is " + correctAns);
			pointValue = 0;
			}
			
			 return pointValue; 
		 }
		
		 public static int ReadHighScore() throws IOException 
		 	{
			 	File inFile = new File("highscore.txt");
				Scanner fileInput = new Scanner(inFile);
				int highScore = fileInput.nextInt();
				System.out.print("High Score is:"+highScore);
				fileInput.close();

				return highScore;
		 	}
		
		 	public static void CompareScore (int highScore, int userScore) throws IOException 
							 	 /* 		should compare the user’s score to the high
							 			score that was read from the file. If the user’s score is
							 			greater, open the high score file, replace the high score,
							 			and close the file. Otherwise, do not modify the file.
								*/
		 		{
		 		if (userScore>highScore) 
		 		{
		 		
		 		//create a FileWriter object for appending
		 		FileWriter appendFile = new FileWriter("highscore.txt", true);
		 		
		 		//open "highscore.txt"
		 		PrintWriter outfile = new PrintWriter (appendFile);
		 		
		 		//write to file
				outfile.println(userScore);
				//close file
				outfile.close();
		 		}
		 	
		 		}
		 	
		 	public static void DisplayScore (int score)
		 	/*	 should display the user’s current total. This should be called
		 		after each question is answered. */
		 	
		 		{
				
		 		System.out.print("Your Score is:\t"+ score);
		 		
		 		}
		
		

}






