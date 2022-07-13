package abstractclass;

//abstract class
 abstract class Animals
	{
	   //abstract method
	   public abstract void sound();
	}
//Dog class extends Animals class
class dog extends Animals
{
    //overriding abstract method  for class dog
	public void sound()
	{
		System.out.println("Woooof,woof");
		
	}
	
}
//lion class extends Animals class
class lion extends Animals{
	
    //overriding abstract method  for class lion
	public void sound()
	{
		System.out.println("Roar");
	}
}


public class Animalabstract {

	public static void main(String[] args)
	{
		Animals objectone= new dog();//instantiation of object using concrete class(not abstract)i.e dog
		objectone.sound(); //calling abstract method 
		Animals objecttwo= new lion();//instantiation of object using concrete class(not abstract)i.e lion
		objecttwo.sound(); //calling abstract method
		

	}

}
