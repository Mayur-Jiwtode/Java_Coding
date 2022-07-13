package Javafilehandling;

import java.io.*;  
public class filteroutputstream 
{  
    public static void main(String[] args) throws IOException 
    {  
        File data = new File("versionone.txt");  
        FileOutputStream file = new FileOutputStream(data);  
        FilterOutputStream filter = new FilterOutputStream(file);  
        String s="This is filteroutputstream";      
        byte b[]=s.getBytes();      
        filter.write(b);     
        filter.flush();  
        filter.close();  
        file.close();  
        System.out.println("Success...");  
    }  
}  