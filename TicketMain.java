
public class TicketMain {

	public static void main(String[] args){
		
	Ticket[] TicketArray = new Ticket[3];
	TicketArray[0]= new WalkUpTicket(17);
	TicketArray[1]= new AdvanceTicket(24,11);
	TicketArray[2]= new StudentAdvanceTicket(30,9);
	
	
	for(int i=0; i<TicketArray.length; i++){
		
		//System.out.println("Ticket number:"+number+","+"Price: $"+price);
		//syso super.toString not allowed. 
		System.out.println(TicketArray[i]);
	}
		
	}		
	
}
