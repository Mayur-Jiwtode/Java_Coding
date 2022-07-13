package Javafilehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;  
public class Fileinputstream 
{  
     public static void main(String args[])
     {    
    	 
          try
          {    
        	FileOutputStream fout=new FileOutputStream("versionone.txt");
        	String s="This is fileinputstream";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);
            FileInputStream fin=new FileInputStream("versionone.txt"); 
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            
            fin.close();
            }   
          catch(Exception e)
          {
        	  System.out.println(e);
         }    
         }    
        }  