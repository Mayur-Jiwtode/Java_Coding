package Javafilehandling;

import java.io.*;  
public class Bufferedoutputstream
{    
public static void main(String args[])throws Exception
{    
     FileOutputStream fout=new FileOutputStream("versiontwo.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="This is bufferedoutputstream.";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
} 