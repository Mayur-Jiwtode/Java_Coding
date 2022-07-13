package Javacollection_LinkList;

import java.util.*;
public class Linklist{
   public static void main(String args[]){

     LinkedList<String> list=new LinkedList<String>();

     //Adding elements to the Linked list
     list.add("Mayur");
     list.add("Taru");
     list.add("Ritik");

     //Adding an element to the first position
     list.addFirst("Ganesh");

     //Adding an element to the last position
     list.addLast("Ramesh");

     //Adding an element to the 3rd position
     list.add(2, "Virat");

     //Iterating LinkedList
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
     }
   } 
}