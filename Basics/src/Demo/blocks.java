package Demo;

public class blocks {

	int a = 10;
	
	
	static{
		System.out.println("i am in nonstatic block1");
	}
	static{
		System.out.println("i am in nonstatic block2");
	}
	
	{
		System.out.println("i am in nonstatic block1");
	}
	
	{
		System.out.println("i am in nonstatic block2");
	}

}

class mainegs2 {
	{
		System.out.println("i am in mainclass nonstatic block");
	}

	public static void main(String[] args) {
		blocks s1 = new blocks();
		blocks s2 = new blocks();

	}
}