package Demo;

/*public class conditionallogical {
	
	//conditional logical operator
	
	public static void main(String[] args)
		{
			int students=150;
			int classrooms=0;
			if(classrooms!=0 && students/classrooms>30)
			{
				System.out.println("crowded");
			}else {
				System.out.println("end of the program");
			}
		}
		


}*/


public class conditionallogical {

	int a = 10;
	{
		System.out.println("i am in nonstatic block1");
	}
	
	{
		System.out.println("i am in nonstatic block2");
	}



class Mainexb {
	{
		System.out.println("i am in mainclass nonstatic block");
	}
	
public void main(String[] args) {
		Blocksexamples s1 = new Blocksexamples();
		Blocksexamples s2 = new Blocksexamples();

	}
}
}

