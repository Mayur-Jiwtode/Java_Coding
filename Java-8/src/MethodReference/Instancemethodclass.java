package MethodReference;

@FunctionalInterface 
interface MyInterface{  
    void display();  
}  
public class Instancemethodclass
{  
    public void myMethod()
    {  
	System.out.println("Instance Method");  
    }  
    public static void main(String[] args)
    {  
    	
	Instancemethodclass obj = new Instancemethodclass();   
	// Method reference using the object of the class
	MyInterface ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
	
    }  
}