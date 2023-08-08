package demosample;

public class diamond {
	public static void main(String[] args)
	{
		//System.out.println("*****");
		for(int i=1;i<=4;i++)
		{
			for(int s=1;s<=4-i;s++)
			{
				System.out.println(" ");
			}
			
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.println("*");
			
			System.out.println();
			}
		}
		System.out.println("*****");
		
	}
}

