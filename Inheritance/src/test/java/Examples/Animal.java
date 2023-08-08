package Examples;

public class Animal {
	
	public void black()
	{
		System.out.println("colour of the animal is black");
		
	}
	
	public void relationship()
	{
		Tail T = new Tail();
		Paws P = new Paws();
		T.fur(10);
		System.out.println(T.length);
		System.out.println(T.size);
		T.bigger();
		T.Smaller();
		System.out.println(T.length);
		P.fivelegs();
		P.fourlegs();
		System.out.println(P.size);
	}
	

}
