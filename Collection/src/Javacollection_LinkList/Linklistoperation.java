package Javacollection_LinkList;

import java.util.*;
public class Linklistoperation{
   public static void main(String args[]){

	   //LinkList Declaration
     LinkedList<String> list=new LinkedList<String>();

     //Adding elements to the Linked list
     list.add("Hello");
     list.add("Java");
     list.add("Programming");

     //Adding an element to the first position
     list.addFirst("Ganesh");

     //Adding an element to the last position
     list.addLast("Ramesh ");

     //Adding an element to Specific position  of LinkList.
     list.add(2,"Harsh");
     
     System.out.println("Linklist :"+list);

     //Iterating LinkedList
   /*  Iterator<String> iterator=list.iterator();
     while(iterator.hasNext())
     {
       System.out.println(iterator.next()); 
     }
     /*
    // Remove first and last element*/
     list.removeFirst();
     list.removeLast();
     System.out.println("\nLinkedList after deletion of first and last element: " +list);
     
     
     /* Add to a Position and remove from a position*/
     list.add(0, "Mayur");
     System.out.println("\nafter adding an element at 1st position: " +list);

     list.remove(2);
     System.out.println("\nafter removing an element from 2nd position: " +list);
     
     ArrayList<String> arraylist= new ArrayList<String>();
     arraylist.add("Namaste ");
     arraylist.add("java");
     list.addAll(arraylist);
     
     System.out.println("\nafter adding elements of arraylist to the linklist " +list);

     //It would add all the elements of the ArrayList to the LinkedList starting from position 2nd (index 5).
     list.addAll(1,arraylist);
     System.out.println("\nafter adding elements of arraylist to the linklist at specifiv index\n" +list);

     
     //Displaying Elements before remove
     System.out.println("Before clear():");
     for(String str: list){
        System.out.println(str);
     }
     //method to remove all the element from the list
     list.clear();
     
     // LinkedList elements after remove
     System.out.println("After clear():");
     for(String str2: list){
        System.out.println(str2);
       } 
  // Create a LinkedList
     LinkedList<String> linkedlist = new LinkedList<String>();
  
     // Add elements to LinkedList
     linkedlist.add("Hello");
     linkedlist.add("all!");
     linkedlist.add("How");
     linkedlist.add("are");
     linkedlist.add("you");
     linkedlist.add("Doing?");
     
     System.out.println("Linklist: "+linkedlist);
  
     // Getting First element of the List
     Object firstElement = linkedlist.getFirst();
     System.out.println("First Element is: "+firstElement);
  
     // Getting Last element of the List
     Object lastElement = linkedlist.getLast();
     System.out.println("Last Element is: "+lastElement);
     
     //Getting element from specific index of LinkedList
     for(int i=0; i < linkedlist.size(); i++)
     {
       System.out.println("Element at index "+i+" is: "+linkedlist.get(i));
     } 
     
     //Searching element in link list
     int Index = linkedlist.indexOf("are");
     System.out.println("Position is: " + Index);  
     
     //original list
     System.out.println("Original list:"+linkedlist);
     
     // Obtaining Sublist from the LinkedList
     List sublist = linkedlist.subList(2,5);
  
     // Displaying SubList elements
     System.out.println("\nSub List elements:");
     Iterator subit= sublist.iterator();
     while(subit.hasNext()){
        System.out.println(subit.next());
     }
     
     
     
}}