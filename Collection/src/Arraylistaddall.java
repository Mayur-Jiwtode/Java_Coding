import java.util.ArrayList;

public class Arraylistaddall {
   public static void main(String[] args) 
   {
      ArrayList<String> fruits = new ArrayList<String>();
      fruits.add("Orange");
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Pineapple");
      System.out.println("Arraylist before add all:"+fruits);
      
      ArrayList<String> colors = new ArrayList<String>();
      colors.add("White");
      colors.add("Red");
      colors.add("Orange");
      colors.add("Purple");
      colors.add("Blue");
      colors.add("Indigo");
      
      System.out.println("Arraylist before add all:"+colors);
      
      colors.addAll(fruits);
      System.out.println("Arraylist after add all: "+colors);
      







      
      
   }}