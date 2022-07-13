package Javacollection_LinkList;

import java.util.LinkedList;
public class ReplaceInLinkedList {
 
 public static void main(String[] args) {
 
    // Create a LinkedList
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    // Add elements to LinkedList
    linkedlist.add("Html");
    linkedlist.add("Css");
    linkedlist.add("C++");
    linkedlist.add("C#");
    linkedlist.add("Java");
 
    // Displaying Elements before replace
    System.out.println("Before Replace:");
    for(String str: linkedlist){
       System.out.println(str);
    }
 
    // Replacing 3rd Element with new value
    linkedlist.set(2, "Python");
    System.out.println("\n3rd Element Replaced \n");

    // Displaying Elements after replace
    System.out.println("After Replace:");
    for(String str2: linkedlist){
       System.out.println(str2);
    }
    
    
 // contains() method checks whether the element exists
    if (linkedlist.contains("Python")) {
       System.out.println("Element Python is present in List");
    } else
    {
       System.out.println("List doesn't have element CC");
    }
    
   // contains() method checks whether the element exists
    if (linkedlist.contains("Hello")) {
       System.out.println("Element Hello is present in List");
    } else 
    {
       System.out.println("List doesn't have element CC");
     }
    
    
    // Displaying LinkedList elements
    System.out.println("LinkedList elements: "+linkedlist);

    // Creating another list
    LinkedList<String> list2 = new LinkedList<String>();
    
    //Clone the list 
    list2 = (LinkedList)linkedlist.clone();

    // Displaying elements of second LinkedList
    System.out.println("List 2 Elements: "+list2);
    
    //last occurrence of element 
    linkedlist.add("Python");
    
    System.out.println("LastIndex of Python:"+linkedlist.lastIndexOf("Python"));
 }
}