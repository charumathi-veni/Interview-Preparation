

enum Status {
	QUEUED,
	INPROGRESS,
	CANCELLED,
	SUCCESS;
}

public class ExampleEnum {
	
	public static void main(string[] args)
	{
		Status[] value = Status.values();
		for(Status s1:value)
			if(s1.equals("SUCCESS")){
				System.out.println("Status for the session is:" +s1);
			}
	}

}
