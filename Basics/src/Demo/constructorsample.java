package Demo;

public class constructorsample {
	int x;
	double y;
	
	constructorsample()
	{
		System.out.println("i am in constructorsample()...");
	}
	
	constructorsample(int arg1)
	{
		x=arg1;
		System.out.println("i am in constructorsample(int)...");
	}
	
	constructorsample(int arg1,double arg2)
	{
		x=arg1;
		y=arg2;
		System.out.println("i am in constructorsample(int,double)...");
	}
}

class Mainclass2
{
	public static void main(String[] args)
	{
		constructorsample c1=new constructorsample();
		System.out.println("X value ="+c1.x);
		System.out.println("Y value ="+c1.y);
		
		constructorsample c2=new constructorsample(10);
		System.out.println("X value ="+c2.x);
		System.out.println("Y value ="+c2.y);
		
		constructorsample c3=new constructorsample(10,22.22);
		System.out.println("X value ="+c3.x);
		System.out.println("Y value ="+c3.y);
		
	}
}
