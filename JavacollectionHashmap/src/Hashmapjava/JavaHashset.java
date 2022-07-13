package Hashmapjava;
import java.util.HashSet;
public class JavaHashset {
   public static void main(String args[]) {
      // HashSet declaration
      HashSet<String> hset = new HashSet<String>();
      HashSet<String> setcopy = new HashSet<String>();

      // Adding elements to the HashSet
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Avacado");
      //Addition of duplicate elements
      hset.add("Apple");
      hset.add("Mango");
    

      //Displaying HashSet elements
      System.out.println(hset);
     // method returns a shallow copy of the HashSet.
      
      setcopy = (HashSet<String>)hset.clone();
      
      System.out.println("\nAfter clone :"+setcopy);
      //checks whether the specified Object o is present in the list or not.
      System.out.println("\nApple is present in set or not:"+hset.contains("Apple"));
      //It gives the number of elements of a Set.
      System.out.println("\nNumber of Elements are :"+hset.size());

      //removes the specified Object from the Set.
      hset.remove("Mango");
      System.out.println("\nAfter removing mango :");
      System.out.println(hset);
      
      hset.clear();
      System.out.println("\nAfter running clear() "+hset);

      
      
    }
}