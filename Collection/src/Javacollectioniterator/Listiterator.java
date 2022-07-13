package Javacollectioniterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
 
public class Listiterator {
  public static void main(String a[]){
    ListIterator<String> litr = null;
    List<String> MobilePhone = new ArrayList<String>();

    MobilePhone.add("Iphone");
    MobilePhone.add("Vivo");
    MobilePhone.add("OnePlus");
    MobilePhone.add("Samsung");
    MobilePhone.add("Realme");
    
    //Obtaining list iterator
    litr=MobilePhone.listIterator();
    System.out.println("List: "+MobilePhone);
  

 
    System.out.println("Traversing the list in forward direction:");
    while(litr.hasNext())
    {
       System.out.println(litr.next());
    }
    System.out.println("\nTraversing the list in backward direction:");
    while(litr.hasPrevious())
    {
       System.out.println(litr.previous());
    }
  }
}