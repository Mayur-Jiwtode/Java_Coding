package Javacollections;
public class Tostringarraylist 
{
	//class data member
    private String studentname;
    private int studentage;
    
    //Constructor to initialize the data member
    public Tostringarraylist(String name, int age)
    {
         this.studentname=name;
         this.studentage=age;
    }
    //Overriding the method to print the arrayList value
    @Override
    public String toString() {
       return "Name of the student is: "+this.studentname+" & Age is: "+this.studentage;
    }
    
}