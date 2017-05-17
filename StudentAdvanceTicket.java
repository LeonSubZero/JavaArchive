
public class StudentAdvanceTicket extends AdvanceTicket {

	
	
	public StudentAdvanceTicket(int number, int daysInAdvance){
	
		super(number, daysInAdvance);
		price=50;
	}


	public double setPrice(){
	
	if(daysInAdvance>=10){
		return price=15.00;
	}
	if(daysInAdvance<10&&daysInAdvance>=1){
		return price=20.00;
	}
	else return price=50.00;
	
	}

	//@overide
	public String toString(){
		
		return "Ticket number:"+super.number+","+"Price: $"+super.price+"(ID required)";
	}
	
	
	
	
}