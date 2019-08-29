package assignment01;
/**
 * SORRY: I did not have time for the javadocs
 * @author CS 140
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
	public static void main(String[] args) {
	
		StreetUSAddress address1 = new StreetUSAddress("50 west 29th Street", "4L", "NYC", "NY", "10023");	
		StreetUSAddress address2 = new StreetUSAddress("70 west 98th Street", "", "NYC", "NY", "10024");
		
		System.out.println(address1);
		System.out.println(address2);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

