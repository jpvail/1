package assignment01;

/**
 * 
 * @author CS 140
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester{
	

	public static void main(String[] args){
	

		DateAndPlaceOfBirth datePOB = new DateAndPlaceOfBirth(1999, 4, 3, "NYC", "NY", "USA"); 
		StreetUSAddress address = new StreetUSAddress("50 west 29th Street", "4L", "NYC", "NY", "10023");
		Person person1 = new Person("Jason", "Vail", "123-34-2332", datePOB, address); 

		System.out.println(person1); 	

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}




















