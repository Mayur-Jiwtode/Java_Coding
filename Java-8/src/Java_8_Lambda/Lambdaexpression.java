package Java_8_Lambda;

@FunctionalInterface
interface MyFunctionalInterface 
{

	//A  abstract method with no parameter
    public String sayHello();
}

@FunctionalInterface
interface Greeting
{
	//A  abstract method with no parameter
	public String greet();
}
public class Lambdaexpression 
{

   public static void main(String args[]) 
   {
        // lambda expression
	   
    	MyFunctionalInterface msg = () ->
    	{
    		return "Hello";
    	};
        System.out.println(msg.sayHello());

        //lambda expression
        Greeting greetmsg = () ->
        {
        	return "Good Morning everyone";
        };
        
        System.out.println(greetmsg.greet());
        	
}}