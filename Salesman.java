/* Flavio Leon
 * 2/15/2017
 * 
 * Salesman.java
 * 
 */


public class Salesman {

	private String fname;
	private String lname;
	private double salesComm;
	
	//default constructor
	
	public Salesman()
	{
		fname = " ";
		lname = " ";
		salesComm = 0;
		
		
	}
	//parameter constructor
	public void Salesman(String f, String l, double comm)
	{
		
		fname = f;
		lname = l;
		salesComm = comm;
		
		
	}
	
	//setter functions
	public void SetFirstName (String f)
	{
		
		fname=f;
				
	}
	public void SetLastName (String l)
	{
		
		lname=l;
				
	}
	public void SetComm (double comm)
	{
		
		salesComm=comm;
				
	}
	
		
	
	//getter functions
	public String GetFirstName()
	{
		return fname;
		
		
	}
	
	public String GetLastName()
	{
		return lname;
	}
	
	public double GetCommission()
	{
		return salesComm;
	}
	
	
	//toString method
	public String toString()
	{
		return "First name:\t"+fname+"Last name:\t"+lname+"\n"+"Sales Commission:"+salesComm+"\n";
		
	}
}	
	