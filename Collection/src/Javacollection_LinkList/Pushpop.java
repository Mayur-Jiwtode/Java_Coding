package Javacollection_LinkList;

import java.util.LinkedList;

public class Pushpop 
{
	public static void main(String[] args)
	{

	     // Create a LinkedList of Strings
	     LinkedList<String> list = new LinkedList<String>();

	     // Add few Elements
	     list.add("Mayur");
	     list.add("Kartik");
	     list.add("Harsh");
	     list.add("Ritik");

	     // Display LinkList elements
	     System.out.println("LinkedList contains: "+list);

	     // push Element the list
	     list.push("Ironman");

	     // Display after push operation
	     System.out.println("LinkedList after adding a element: "+list);
	     
	     list.pop();
	     System.out.println("LinkedList After poping a element: "+list);

	     // Display LinkList elements
	     System.out.println("\nLinkedList before: "+list);

	     /* poll(): Retrieves and removes the head (first element)
	      * of this list.
	      */
	     System.out.println("Element removed: "+list.poll());

	     // Displaying list elements after poll() operation
	     System.out.println("LinkedList after: "+list);
	     
	     // Display LinkList elements
	     System.out.println("\nLinkedList before: "+list);

	     /* pollFirst(): Retrieves and removes the first element 
	      * of this list, or returns null if this list is empty.
	      */
	     System.out.println("Element removed: "+list.pollFirst());

	     // Display list after calling pollFirst() method
	     System.out.println("LinkedList after: "+list);
	  }

}
