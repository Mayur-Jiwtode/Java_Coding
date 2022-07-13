package Hashmapjava;
import java.util.TreeSet;

public class JavaTreeset {
    public static void main(String[] args)
    {
        // Creating a Tree set interface with reference to
        // TreeSet
        TreeSet<String> ts = new TreeSet<>();
  
        // Elements are added using add() method
        ts.add("M");
        ts.add("A");
        ts.add("Y");
        ts.add("U");
        ts.add("R");
  
        // Duplicates will not get insert
        ts.add("M");
  
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts);
        
        String ch = "M";
        // Check if the above string exists in
        // the tree set or not
        System.out.println("Contains " + ch + " :"
                           + ts.contains(ch));
  
     // Print the first element in
        // the TreeSet
        System.out.println("First Value " + ts.first());
  
        // Print the last element in
        // the TreeSet
        System.out.println("Last Value " + ts.last());
        
        String val = "M";
        
        // Find the values just greater
        // and smaller than the above string
        System.out.println("Higher " + ts.higher(val));
        System.out.println("Lower " + ts.lower(val));
        
        
        // Print and display initial elements of TreeSet
        System.out.println("Initial TreeSet " + ts);
  
        // Removing a specific existing element inserted
        // above
        ts.remove("R");
  
        // Printing the updated TreeSet
        System.out.println("After removing element " + ts);
  
        // Now removing the first element
        // using pollFirst() method
        ts.pollFirst();
  
        // Again printing the updated TreeSet
        System.out.println("After removing first " + ts);
  
        // Removing the last element
        // using pollLast() method
        ts.pollLast();
  
        // Lastly printing the elements of TreeSet remaining
        // to figure out pollLast() method
        System.out.println("After removing last " + ts);
        
   
        // to iterate through the TreeSet
        for (String value : ts)
  
            // Printing the values inside the object
            System.out.print(value + ",");
  
        System.out.println();
    }
}


