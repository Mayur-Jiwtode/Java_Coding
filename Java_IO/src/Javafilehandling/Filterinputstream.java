package Javafilehandling;

import java.io.*;  
public class Filterinputstream 
{  
    public static void main(String[] args) throws IOException 
    {  
        File data = new File("versionone.txt");  
        FileInputStream  file = new FileInputStream(data);  
        FilterInputStream filter = new BufferedInputStream(file);  
        int k =0;  
        while((k=filter.read())!=-1)
        {  
            System.out.print((char)k);  
        }  
        file.close();  
        filter.close();  
    }  
}  