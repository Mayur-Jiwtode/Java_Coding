package Java_8_Lambda;

import java.util.*;  
public class LambdaIterating
{  
    public static void main(String[] args) 
    {       
       List<String> list=new ArrayList<String>();  
       list.add("Mayur");         
       list.add("Mahesh");       
       list.add("suresh");         
       list.add("virat");         
       list.add("Rohit");       
       //Using forEach for iterating the list with lambda expression
       list.forEach
       (          
           // lambda expression        
           (names)->System.out.println(names)         
       );   
       
       //Using for for iterating list
       System.out.println("");
       System.out.println("List of Name: ");
       for(String display:list)
    	   System.out.println(display);
    	   
    	   
    }  
}