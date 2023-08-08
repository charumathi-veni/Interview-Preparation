package Demo;
import java.util.*;
import java.io.*;
public class TestSample { 
		public static void main(String args[]){ 
		//creating Priority queue
		PriorityQueue<String> queue1=new PriorityQueue<String>();  
		queue1.offer("chennai");  
		queue1.offer("bangalore");  
		queue1.offer("delhi"); 
		queue1.offer("mumbai");
		System.out.println("head:"+queue1.element());  
		System.out.println("head:"+queue1.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue1.iterator();  
		Iterator<String> itr1=queue1.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next()); 
		}  
		queue1.remove();  
		queue1.poll();  
		System.out.println("after removing two elements:");  
		queue1.add("40"); 
		queue1.add("60"); 
		Iterator<String> itr2=queue1.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		}  
}



