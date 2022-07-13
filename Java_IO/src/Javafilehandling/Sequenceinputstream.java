package Javafilehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
   
class Sequenceinputstream{    
  public static void main(String args[])throws Exception{    
   FileInputStream fin1=new FileInputStream("versionone.txt");    
   FileInputStream fin2=new FileInputStream("versiontwo.txt");    
   FileOutputStream fout=new FileOutputStream("versionthree.txt");      
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
   int i;    
   while((i=sis.read())!=-1)    
   {    
     fout.write(i);        
   }    
   sis.close();    
   fout.close();      
   fin1.close();      
   fin2.close();       
   System.out.println("Success..");  
  }    
}    