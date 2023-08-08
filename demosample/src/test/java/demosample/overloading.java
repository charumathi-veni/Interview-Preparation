package demosample;

public class overloading {
	
	static void test()
	{
		System.out.println("i am in test()...");
	}
	static void test(int x)
	{
		System.out.println("i am in test(int)...");
	}
	static void test(double x)
	{
		System.out.println("i am in test(double)...");
	}
	
	public static void main(String[] args) 
	{
		test();	
		test(10);	
		test(10.6);	
	}

}
