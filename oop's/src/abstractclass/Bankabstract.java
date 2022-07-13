package abstractclass;

//abstract class
abstract class Bank
{
	   //abstract method
	abstract void balance();
	
}

//Driving class extends Bank class
class saving extends Bank{

    //overriding abstract method  for class saving

	void balance()
	{
		System.out.println("You have a Saving account");

		double savebalance = 10000;
		System.out.println("Saving account Balance is :"+ savebalance);
		
	}
	
}
//current class extends bank class

class current extends Bank{

    //overriding abstract method  for class current

	void balance()
	{
		System.out.println("You have a Current account");
		double currentbalance = 1700;
		System.out.println("Current account balance is :"+ currentbalance);
		
	}
	
}
public class Bankabstract {

	public static void main(String[] args){
		
		Bank objone = new saving();//instantiation of object using concrete class(not abstract)i.e saving
		objone.balance();
		Bank objtwo =new current();//instantiation of object using concrete class(not abstract)i.e current
		objtwo.balance();

	}

}
