package Demo;

import java.util.PriorityQueue;

public class Testing1 {

	public static void main(String[] args) {
		PriorityQueue queue1=new PriorityQueue();  
		queue1.offer(1);  
		queue1.offer("3");   
		queue1.offer("5");  
		queue1.offer(11); 
		queue1.offer("9");
		System.out.println(queue1);
	}
}
