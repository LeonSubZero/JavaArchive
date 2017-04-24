

	//Flavio Leon
	//November 14, 2016
	//.javaGamev6rev2.java
	//This is a quiz game. This version is modify methods. 
	import javax.swing.JOptionPane;
	import java.io.*;
	import java.util.Scanner;

	public class gamerev5 {
		
		public static void main(String[] args) throws IOException {
		
		//Declare SIZE 10 for arrays
		
		final int SIZE = 10;
			
		String playerName;

		int menuChoice = 0, total = 0;	//Declare and initialize variables
		
		//Declare arrays
		
		String[] questionArray = new String [SIZE];
		String[] answerA = new String [SIZE];
		String[] answerB = new String [SIZE];
		String[] answerC = new String [SIZE];
		String[] answerD = new String [SIZE];
		String[] correctAnswer = new String [SIZE];
		int [] pointValue = new int [SIZE];
		String[] highNames = new String[3];
		int[] highScores = new int[3];
		
		playerName = JOptionPane.showInputDialog("Player Name:\n "); 
		
		JOptionPane.showMessageDialog(null, "WELCOME " + playerName + "!"); //Introduction
		
		//Prompt for user to make main menu choice 
		do //Main Menu Do While Loop Begins
		{
			//call DisplayMainMenu Method
			menuChoice = DisplayMainMenu();
			
		switch(menuChoice)
		{
		case '1':
			
			//call DisplayRules Method
			DisplayRules();
	
			break;
			
		case '2':
			
			//Display Questions and Answers
			
			File infile = new File ("questions.txt");
			
			Scanner filein = new Scanner(infile);
			String blank;
			for (int i = 0; i < 9; i++) 	//For Loop Begins
			{	
				//JOptionPane.showMessageDialog(null, "next one...");
				questionArray[i] = filein.nextLine();
				answerA[i] = filein.nextLine();
				answerB[i] = filein.nextLine(); 
				answerC[i] = filein.nextLine();
				answerD[i] = filein.nextLine();
				correctAnswer[i] = filein.nextLine();
				pointValue[i] = filein.nextInt();
		
			total += ProcessQuestion(questionArray[i], answerA[i], answerB[i], answerC[i], answerD[i], correctAnswer[i], pointValue[i]);
			blank = filein.nextLine();
			JOptionPane.showMessageDialog(null, "end of loop...");
			
			} //Close For Loop
			
			//ReadInHighScores
			ReadHighScore(highNames, highScores);
			
			//CompareScore
			CompareScore(total, playerName, highNames, highScores);
			
			//UpdateHighScores
			UpdateHighScores(highNames, highScores);
			
			//JOptionPane.showMessageDialog(null, "CONGRATS ON COMPLETING!!! Your GRAND total is " + total);
			filein.close();
			break; //Main menu Case 2 break
			
		case '3': 	
			JOptionPane.showMessageDialog(null,"Have a nice day!!");
			
			break;
			
			default:
			JOptionPane.showMessageDialog(null, "Invalid. You must choose 1 - 3 from the menu.\n");
			
		}
		//end Main Menu switch
		
	}
		
	while(menuChoice != '3');
		
		
		}
	
	//	private static int parseInt(String showInputDialog) {
		
		
		//	return 0;
//		}

		
		 public static char DisplayMainMenu()
		 {
			 	String menuChoice;
			 	//prompt for and return the main menu choice
				menuChoice = (JOptionPane.showInputDialog("Please choose from the following menu: \n 1) See Rules\n2) Play Game\n3) Exit\nPlease enter your choice here: "));
				
				return menuChoice.charAt(0);
		 }
		
		 public static void DisplayRules()
		 {
				JOptionPane.showMessageDialog(null, "RULES\n 1. User must select an answer option provided  by game.\n 2. User may only progress to next question if a correct response is given.\n "
						+ "3. Rule number 3 is under consideration.\n 4. Rules are subject to change. ");

		 }
		
		 public static int ProcessQuestion(String ques, String ansA, String ansB, String  ansC, String ansD, String correctAns, int pointValue)
		 	throws IOException
		 {
			 String userAns; //declare the variable for user's answer
			 	
			//Do While Loop Begins
			do 
			{	
			
				//display question and answers and prompt for user Answer
				userAns = JOptionPane.showInputDialog(ques + "\n" + ansA + "\n" + ansB + "\n" + ansC + "\n" + ansD + "\nEnter your answer here:" );
				userAns = userAns.toUpperCase();
				
				// input validation 
				if (!userAns.equals("A") && !userAns.equals("B") && !userAns.equals("C") && !userAns.equals("D"))
				{
					System.out.println("Invalid. You must choose A, B, C, or D.");
				}
				
				if (userAns.equals(correctAns)) //Accumulator and Checking Correct Answer
				{
				JOptionPane.showMessageDialog(null, "You have answered correctly");
				
				}
				 
				else
				{
				JOptionPane.showMessageDialog(null, "You answered incorrectly, the correct answer is " + correctAns);
				pointValue = 0;
				}
			
			} while (!userAns.equals("A") && !userAns.equals("B") && !userAns.equals("C") && !userAns.equals("D"));
			
			
			 return pointValue; 
			 
		 }
		
		 public static void ReadHighScore(String [] name, int [] score) throws IOException 
		 	{
			 	File inFile = new File("highscore.txt");
				Scanner fileInput = new Scanner(inFile);
				
				int highScore = fileInput.nextInt();
				
				System.out.print("High Score is:"+highScore);
				fileInput.close();
		 	}
		
		 public static void CompareScore (int userScore, String userName, String[] name, int[] score) throws IOException 
							 	 /* 		This method should compare the user’s score to the high score list. If the user scores higher than any of the scores in the
											list, rearrange the scores and corresponding names in the arrays
											as necessary. 
								*/
		 {		
			 
			 	for (int i = 0; i < 3; i++)
			 	{	
			 		//compare first user
			 		if (i==0&&(userScore > score[i])) 
			 		{
			 			score[i+2] = score[i+1];
			 			score[i+1] = score [i];
			 			score[i] = userScore;
			 			
			 			name[i+2] = name[i+1];
			 			name[i+1] = name [i];
			 			name[i] = userName;
			 		}
			 		
			 		//compare second user
			 		if (i==1&&(userScore > score[i])) 
			 		{
			 			score[i+1] = score [i];
			 			score[i] = userScore;
			 			
			 			name[i+1] = name [i];
			 			name[i] = userName;
			 		}
			 		
			 		//compare third user
			 		if (i==2&&(userScore > score[i])) 
			 		{
			 			score[i] = userScore;
			 			name[i] = userName;
			 			
			 		}
			 	}

		 }
		 public static void UpdateHighScores (String[] highName, int[] highScore) throws IOException
		 /* should update the file “highscore.txt” with the scores
			and names in the arrays.*/
		 {
			 	File inFile = new File("highscore.txt");
				Scanner fileInput = new Scanner(inFile);
				
				for (int i = 0; i < 3; i++)
				{
				highName[i] = fileInput.next();
				highScore[i] = fileInput.nextInt();
				}
				
				fileInput.close();
		 }
		 
		 	
		 	public static void DisplayScore (int score)
		 	/*	 should display the user’s current total. This should be called
		 		after each question is answered. */
		 	
		 		{
				
		 		System.out.print("Your Score is:\t"+ score);
		 		
		 		}
		
		

}














