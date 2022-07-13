package Javafilehandling;

import java.io.FileOutputStream;  
public class Fileoutputstream 
{  
    public static void main(String args[])
    {    
           try
           {    
             FileOutputStream fout=new FileOutputStream("version.txt");    
             String s="Welcome to java";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);  
             
             fout.close();    
             System.out.println("Data is Written in a file!");    
            }
           catch(Exception e)
           {
            	System.out.println(e);
           }    
      }    
}  