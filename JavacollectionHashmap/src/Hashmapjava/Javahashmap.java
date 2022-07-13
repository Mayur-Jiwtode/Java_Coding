package Hashmapjava;
import java.util.HashMap;

public class Javahashmap 
{

	   public static void main(String args[]) {

	      /* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Mayur");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      //hmap.put(12,"shubham");
	      System.out.println(hmap);
	      //wanted to access any element using key
	      System.out.println("Element at key 12 is "+hmap.get(12));
	      System.out.println("Element at key  2 is "+hmap.get(2));

	      
	 

}}
