package Javacollection_LinkList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
public class Linklistiterator {
 
 public static void main(String[] args) {
 
    // Create a LinkedList
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    // Add elements to LinkedList
    linkedlist.add("Nagpur");
    linkedlist.add("Mumbai");
    linkedlist.add("Chanfrapur");
    linkedlist.add("Chennai");
    linkedlist.add("Pune");
 
    // Obtaining Iterator
    Iterator it = linkedlist.iterator();
 
    // Iterating the list in forward direction
    System.out.println("LinkedList elements:");
    while(it.hasNext()){
       System.out.println(it.next());
    }
    
 // Obtaining ListIterator
    ListIterator listIt = linkedlist.listIterator();
 
    // Iterating the list in forward direction
    System.out.println("Forward iteration:");
    while(listIt.hasNext()){
       System.out.println(listIt.next());
    }

    // Iterating the list in backward direction
    System.out.println("\nBackward iteration:");
    while(listIt.hasPrevious()){
       System.out.println(listIt.previous());
    } 
    
 // Displaying list in reverse order
    
    Iterator itone = linkedlist.descendingIterator();
    System.out.println("\nElements in Reverse Order:");
    while (itone.hasNext()) {
       System.out.println(itone.next());
    }
 }
}