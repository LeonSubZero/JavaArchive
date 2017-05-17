//Flavio Leon
//menuShellv1.java
//Sept 28, 2016
//This program demonstrates the shell of a menu program using a switch statement
import java.util.Scanner;

public class menuShellv1 {

	public static void main(String[] args) {
		
		//declare variables
		int menuChoice = 0;
		Scanner keyboardInput = new Scanner(System.in);
		do
		{
		System.out.println("Please choose from the following menu: ");
		System.out.println("1) See Rules\n2) Play Game\n3) Exit");
		System.out.print("\nPlease enter your choice here: ");
		menuChoice = keyboardInput.nextInt();
		
		switch(menuChoice)
		{
		case 1:
			System.out.println("These are the rules");
			break;
			
		case 2:
			System.out.println("This is the game");
				
			break;
			
		case 3: 
			System.out.println("Have a nice day!!");
			break;
			
		default:
			System.out.println("Invalid. You must choose 1 - 3 from the menu.\n");
			
			
		}//end switch
		
		}
		while(menuChoice != 3);

	}

}
