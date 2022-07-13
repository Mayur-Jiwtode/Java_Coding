import java.util.ArrayList;

import Javacollections.Tostringarraylist;

public class Tostringarraylistimport {

	public static void main(String[] args)
	{
		// Creating an object to array list

		ArrayList<Tostringarraylist> arraylist=new ArrayList<Tostringarraylist>();
		
		arraylist.add(new Tostringarraylist("Mayur",22));
		
		//loop to all the element of the array
		for (Tostringarraylist display:arraylist) {
			System.out.println(display);
		}
	}

}
