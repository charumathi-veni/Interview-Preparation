package Examples;

class MyCalculator implements ScientificCalcultor{
	
	public void add(int a,int b)
	{
		System.out.println("Sum="+(a+b));
	}
	
	public void sub(int a,int b)
	{
		System.out.println("Sub="+(a-b));
	}

	
	public static void main(String args[])
	{
		System.out.println(ScientificCalcultor.PI);
		System.out.println(ScientificCalcultor.x);
		ScientificCalcultor s1 = new MyCalculator();
		s1.add(10, 20);
		s1.sub(30, 20);
		s1.m1();
		s1.m2();
	}

	public void m1() {
		System.out.println("I am in m1()");
		
	}

	public void m2() {
		System.out.println("I am in m2()");
		
	}
}
