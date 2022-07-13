import java.util.ArrayList;
import java.util.Collections;

public class Arraysorting {
   public static void main(String[] args) 
   {
      ArrayList<String> fruits = new ArrayList<String>();
      fruits.add("Orange");
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Pineapple");
      System.out.println("**************Arraylist before Sorting****************");
      for (String str : fruits) {
         System.out.println(str);
      }
      
      Collections.sort(fruits);

      System.out.println("**************Arraylist after Sorting****************");
      for (String str : fruits) {
         System.out.println(str);
      }
      System.out.println("**************Arraylist after reversing ****************");

      Collections.reverse(fruits);
      for (String str : fruits) {
          System.out.println(str);
       }
      
   }
}