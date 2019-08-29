package assignment01;

import java.util.ArrayList;
import java.util.List;
/**
 * Class ComputerOwner is a composite of a Person, the owner, and a list
 * of Computers that the Person owns. Operations are available to add to, 
 * query, and delete from the list.
 * @author CS 140
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester {

	public static void main(String[] args){
		
		DateAndPlaceOfBirth datePOB = new DateAndPlaceOfBirth(1999, 4, 3, "NYC", "NY", "USA"); 
		StreetUSAddress address = new StreetUSAddress("50 west 29th Street", "4L", "NYC", "NY", "10023");
		Person person1 = new Person("Jason", "Vail", "123-34-2332", datePOB, address); 
		
		Computer comp1 = new Computer("Apple", "Good", 20, 1500, true, 2000); 
		Computer comp2 = new Computer("Apple", "Good", 20, 1500, false, 2000); 
		Computer comp3 = new Computer("Apple", "Good", 20, 900, true, 2000); 
		Computer comp4 = new Computer("Apple", "Good", 20, 900, false, 2000); 
		
		ComputerOwner owner1 = new ComputerOwner(person1); 
		owner1.addComputer(comp1); 
		owner1.addComputer(comp2); 
		owner1.addComputer(comp3); 
		owner1.addComputer(comp4); 

		System.out.println(owner1); 

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}


