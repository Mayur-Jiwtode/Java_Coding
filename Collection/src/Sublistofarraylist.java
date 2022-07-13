import java.util.ArrayList;
import java.util.List;


public class Sublistofarraylist {
   public static void main(String[] args) 
   {
      ArrayList<String> language = new ArrayList<String>();
      language.add("Marathi");
      language.add("Hindi");
      language.add("English");
      language.add("Kannada");
      language.add("Tamil");
      language.add("French");

 
      //original ArrayList
      System.out.println("Arraylist :"+language);
      
      //sublist to ArrayList
      ArrayList<String> lang = new ArrayList<String>(language.subList(1, 4));
      System.out.println("sublist stored in Originallist:"+lang);

      //sublist to list
      List<String> list = language.subList(1,4);
      System.out.println("Sublist stored in list :"+list);    
   }
}