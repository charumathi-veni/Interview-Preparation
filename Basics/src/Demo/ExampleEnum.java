package Demo;

enum Status {
	QUEUED, INPROGRESS, CANCELLED, SUCCESS
}

class ExampleEnum {

	public static void main(String[] args) {
		Status s2 = Status.SUCCESS;
		Status[] value = Status.values();
		for (Status s1 : value) {
			System.out.println(s1);
			if (s1.equals(s2)) {
				System.out.println("Status for the session is:" + s1);
			}
		}
	}
}
