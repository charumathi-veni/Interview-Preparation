package Examples;

public class Test {
	
	public static void main(String args[])
	{
	
	Dog D = new Dog();
	D.white();
	System.out.println(D.a);
	Cat C = new Cat();
	C.grey();
	System.out.println(C.b);
	D.black();
	C.black();
	
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
