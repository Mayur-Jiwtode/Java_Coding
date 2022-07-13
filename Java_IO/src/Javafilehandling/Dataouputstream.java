package Javafilehandling;

import java.io.*;  
public class Dataouputstream {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("versionone.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  