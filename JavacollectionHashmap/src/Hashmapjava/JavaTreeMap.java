package Hashmapjava;

import java.util.TreeMap;

public class JavaTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an empty TreeMap
        TreeMap<Integer, String> tree_map= new TreeMap<Integer, String>();
  
        // Mapping string values to int keys
        // using put() method
        tree_map.put(1, "Mayur");
        tree_map.put(2, "Rahul");
        tree_map.put(3, "Kunal");
        tree_map.put(4, "Kartik");
        tree_map.put(5, "Shubham");
  
        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
        int key =1;
        // Checking for the key
        System.out.println("\nIs key \"" + key
                           + "\" present? "
                           + tree_map.containsKey(key));
        
        String value = "Mayur";
        // Checking for the value
        System.out.println("\nIs key \"" + value
                           + "\" present? "
                           + tree_map.containsValue(value));
        // Printing all elements of Map
        System.out.println(tree_map);
  
        // Removing the element corresponding to key
        tree_map.remove(2);
  
        //  Printing updated TreeMap
        System.out.println(tree_map);
        
        

	}

}
