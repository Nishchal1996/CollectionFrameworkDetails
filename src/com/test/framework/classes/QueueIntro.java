package com.test.framework.classes;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueIntro {
  public static void main(String[] args) {
	  
/*
 * I we maintain order to be prior  we can use Queue*/
	  PriorityQueue<String> queue=new PriorityQueue<String>();  
	  queue.add("Amit");  
	  queue.add("Vijay");  
	  queue.add("Karan");  
	  queue.add("Jai");  
	  queue.add("Rahul");  
	  
	  System.out.println("head:"+queue.peek());  
	  System.out.println("iterating the queue elements:");  
	 Iterator<String> itr=queue.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 queue.remove(); //remove first element 
	  queue.poll();  //remove first element
	  System.out.println("after removing two elements:");  
	  Iterator<String> itr2=queue.iterator();  
	  while(itr2.hasNext()){  
	  System.out.println(itr2.next());  
	  }  
}
}
