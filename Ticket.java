
public abstract class Ticket {
	protected int number;
	protected double price;
	



public Ticket(int num){
	
number=num;
	
}

public abstract double setPrice();

public String toString(){
	
	return "Ticket number:"+number+","+"Price: $"+price;
}




}