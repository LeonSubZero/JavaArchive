//Flavio Leon

package extracredit;
import javax.swing.JOptionPane;
public class EC4 {

	public static void main(String[] args)
	

	
	{
		
		
	int daysWorked;
		do
		{
		int days = 1;
		double salary = .01;
		
		
		JOptionPane.showMessageDialog(null, "Welcome");
		daysWorked = Integer.parseInt(JOptionPane.showInputDialog("Please enter number of days worked:"));
		
		if (daysWorked > 0);
		
		{
		
			System.out.println("Days       Salary");
			System.out.println("------------------");
			System.out.println(days+"          "+salary);
			
			do
			{
			 days += 1; 
			 salary *= 2;
			 System.out.println(days+"          "+salary);
			
			
			} 
			while (days < daysWorked);
			 
			System.out.println("Total       "+salary);
			
		} 
		
		if (daysWorked <= 0)
			
		{
			JOptionPane.showMessageDialog(null, "Please enter a number higher than zero");
		}
		
		} while (daysWorked <= 0 ); 
		
		
	}

}
