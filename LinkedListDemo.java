package day10.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		
		LinkedList l1=new LinkedList<>(a1);
		
		l1.add("Alice");
		l1.add("Ben");
		l1.add("Chris");
		
		System.out.println(l1);
		l1.addFirst("Aakash");
		l1.addLast("Dom");
		l1.addLast("Ben");
		
		//peek, poll
		
//		System.out.println(l1);
//		
//		System.out.println("First Element is " + l1.peekFirst() + " It is still in the list");
//		System.out.println(l1);
//		
//		System.out.println("First Element is " + l1.pollFirst() + " It is removed from the list");
//		System.out.println(l1);
		
		System.out.println(l1.indexOf("Ben"));
		System.out.println(l1.lastIndexOf("Ben"));
	}

}
