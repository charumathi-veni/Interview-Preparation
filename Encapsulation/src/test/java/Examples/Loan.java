package Examples;

public class Loan {
	
	private long acc_no;  
	private String name;
	private float amount;  
	
	
	public long getNumber(){
		return acc_no;
		
	}
	
	public long setNumber(long l){
	return	this.acc_no= acc_no;
		
	}
	
	
	public String getName(){
		return name;
		
	}
	
	public String setName(String s){
		return this.name= name;
		
	}

	public float getamt(){
		return amount;
		
	}
	
	public float setamt(float f){
		return this.amount= amount;
		
	}
}
