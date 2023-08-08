package Demo;

public class Blocksexamples {

	int a = 10;
	{
		System.out.println("i am in nonstatic block1");
	}
	
	{
		System.out.println("i am in nonstatic block2");
	}

}

class Mainex {
	{
		System.out.println("i am in mainclass nonstatic block");
	}
	

	public static void main(String[] args) {
		Blocksexamples s1 = new Blocksexamples();
		Blocksexamples s2 = new Blocksexamples();

	}
}
