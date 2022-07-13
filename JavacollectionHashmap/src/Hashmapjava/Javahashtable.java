package Hashmapjava;

import java.util.Hashtable;
import java.util.Enumeration;

public class Javahashtable {
 
 public static void main(String[] args) {
 
   Enumeration<String> names;
   String key;
 
   // Creating a Hashtable
   Hashtable<String, String> hashtable = new Hashtable<String, String>();
 
   // Adding Key and Value pairs to Hashtable
   hashtable.put("Key1","Mayur");
   hashtable.put("Key2","Suresh");
   hashtable.put("Key3","Rahul");
   hashtable.put("Key4","Kunal");
   hashtable.put("Key5","shubham");
 
   names = hashtable.keys();
   while(names.hasMoreElements()) {
      key = (String) names.nextElement();
      System.out.println("Key: " +key+ " & Value: " +
      hashtable.get(key));
   }
 }
}