/*
 * Flavio Leon
 * 
 * 2.15.2017
 * 
 */


public class TestSalesman {
	
	public static void main(String[] args) {
		//make 2 instances and display
		Salesman johnd = new Salesman();
		johnd.Salesman("John","Doe",100);
		
		Salesman janed = new Salesman();
		janed.Salesman("Jane","Doe",200);
		
		System.out.println(johnd.toString());
		System.out.println(janed.toString());
		
		
		//Change commission John Doe to 18 and display again to reflect changes.
		johnd.SetComm(18);
		System.out.println(johnd.toString());
	
		
		
		
		
	}

}
