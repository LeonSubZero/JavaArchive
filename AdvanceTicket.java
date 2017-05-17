
public class AdvanceTicket extends Ticket {
	
	protected int daysInAdvance;
	
	public AdvanceTicket(int number, int daysInAdvance){
		super(number);
		price=50.00;
		
		
	}
	
	public double setPrice(){
		
		if(daysInAdvance>=10){
			return price=30.00;
		}
		if(daysInAdvance<10 && daysInAdvance>=1){
			return price=40.00;
		}
		else return price=50.00;
		
		
		
	}
	
	
	
	
	
	

}
