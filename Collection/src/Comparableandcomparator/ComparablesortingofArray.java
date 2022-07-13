package Comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ComparablesortingofArray 
{
  public static void main(String[] args) 
  {
    /*
     * Integer class implements Comparable
     * Interface so we can use the sort method
     */
    int[] arr = {5,4,3,2,1};
    Arrays.sort(arr);
    System.out.print("Sorted Int Array: ");
    System.out.println(Arrays.toString(arr));
        
    /*
     * String class implements Comparable
     * Interface so we can use the sort method
     */
     System.out.print("Sorted String Array: ");
     String[] names = {"Mayur", "Prabhakar ", "Jiwtode"};
     Arrays.sort(names);
     System.out.println(Arrays.toString(names));
        
     /*
      * String class implements Comparable
      * Interface so we can use the sort method
      */
     System.out.print("Sorted List: ");
     List <String> colors = new ArrayList<String>();
     colors.add("Orange");
     colors.add("Blue");
     colors.add("Red");
     colors.add("Green");
     colors.add("White");
     Collections.sort(colors);
     for(String st:colors)
     { 
    	 System.out.print(st+", ");
     }
     
  }
}