package assignment01;
import java.time.LocalDate;
/**
 * Class to store a data and place of birth.
 * @author CS 140
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
	
		DateAndPlaceOfBirth info1 = new DateAndPlaceOfBirth(1999, 4, 3, "NYC", "New York", "USA"); 
		DateAndPlaceOfBirth info2 = new DateAndPlaceOfBirth(1960, 5, 2, "Binghamton", "New York", "USA"); 
		DateAndPlaceOfBirth info3 = new DateAndPlaceOfBirth(1950, 8, 4, "Newark", "Delaware", "USA"); 
		DateAndPlaceOfBirth info4 = new DateAndPlaceOfBirth(1950, 8, 4, "Sofia", "BG"); 
		DateAndPlaceOfBirth info5 = new DateAndPlaceOfBirth(1930, 8, 4, "Rome", "IT"); 


		//Print out objects

		System.out.println(info1);
		System.out.println(info2);
		System.out.println(info3);
		System.out.println(info4);
		System.out.println(info5);
		
		//Print out results of olderThan Method 
		
		System.out.println("olderThan");
		System.out.println(info1.olderThan(info2));
		System.out.println(info1.olderThan(info3));
		System.out.println(info1.olderThan(info4));
		System.out.println(info1.olderThan(info5));
		
		System.out.println(info2.olderThan(info1));
		System.out.println(info2.olderThan(info3));
		System.out.println(info2.olderThan(info4));
		System.out.println(info2.olderThan(info5));

		System.out.println(info3.olderThan(info1));
		System.out.println(info3.olderThan(info2));
		System.out.println(info3.olderThan(info4));
		System.out.println(info3.olderThan(info5));

		System.out.println(info4.olderThan(info1));
		System.out.println(info4.olderThan(info2));
		System.out.println(info4.olderThan(info3));
		System.out.println(info4.olderThan(info5));

		System.out.println(info5.olderThan(info1));
		System.out.println(info5.olderThan(info2));
		System.out.println(info5.olderThan(info3));
		System.out.println(info5.olderThan(info4));
	
		//Print out results of youngerThan Method
		
		System.out.println("youngerThan");
		System.out.println(info1.youngerThan(info2));
		System.out.println(info1.youngerThan(info3));
		System.out.println(info1.youngerThan(info4));
		System.out.println(info1.youngerThan(info5));
		
		System.out.println(info2.youngerThan(info1));
		System.out.println(info2.youngerThan(info3));
		System.out.println(info2.youngerThan(info4));
		System.out.println(info2.youngerThan(info5));

		System.out.println(info3.youngerThan(info1));
		System.out.println(info3.youngerThan(info2));
		System.out.println(info3.youngerThan(info4));
		System.out.println(info3.youngerThan(info5));

		System.out.println(info4.youngerThan(info1));
		System.out.println(info4.youngerThan(info2));
		System.out.println(info4.youngerThan(info3));
		System.out.println(info4.youngerThan(info5));

		System.out.println(info5.youngerThan(info1));
		System.out.println(info5.youngerThan(info2));
		System.out.println(info5.youngerThan(info3));
		System.out.println(info5.youngerThan(info4));

		//Print out results of hasSameBirthDateAs Method
		
		System.out.println("hasSameBirthDateAs");
		System.out.println(info1.hasSameBirthDateAs(info2));
		System.out.println(info1.hasSameBirthDateAs(info3));
		System.out.println(info1.hasSameBirthDateAs(info4));
		System.out.println(info1.hasSameBirthDateAs(info5));
		
		System.out.println(info2.hasSameBirthDateAs(info1));
		System.out.println(info2.hasSameBirthDateAs(info3));
		System.out.println(info2.hasSameBirthDateAs(info4));
		System.out.println(info2.hasSameBirthDateAs(info5));

		System.out.println(info3.hasSameBirthDateAs(info1));
		System.out.println(info3.hasSameBirthDateAs(info2));
		System.out.println(info3.hasSameBirthDateAs(info4));
		System.out.println(info3.hasSameBirthDateAs(info5));

		System.out.println(info4.hasSameBirthDateAs(info1));
		System.out.println(info4.hasSameBirthDateAs(info2));
		System.out.println(info4.hasSameBirthDateAs(info3));
		System.out.println(info4.hasSameBirthDateAs(info5));

		System.out.println(info5.hasSameBirthDateAs(info1));
		System.out.println(info5.hasSameBirthDateAs(info2));
		System.out.println(info5.hasSameBirthDateAs(info3));
		System.out.println(info5.hasSameBirthDateAs(info4));

		//Print out results of hasSameBirthDayAs Method
		
		System.out.println("hasSameBirthDayAs");
		System.out.println(info1.hasSameBirthDayAs(info2));
		System.out.println(info1.hasSameBirthDayAs(info3));
		System.out.println(info1.hasSameBirthDayAs(info4));
		System.out.println(info1.hasSameBirthDayAs(info5));
		
		System.out.println(info2.hasSameBirthDayAs(info1));
		System.out.println(info2.hasSameBirthDayAs(info3));
		System.out.println(info2.hasSameBirthDayAs(info4));
		System.out.println(info2.hasSameBirthDayAs(info5));

		System.out.println(info3.hasSameBirthDayAs(info1));
		System.out.println(info3.hasSameBirthDayAs(info2));
		System.out.println(info3.hasSameBirthDayAs(info4));
		System.out.println(info3.hasSameBirthDayAs(info5));

		System.out.println(info4.hasSameBirthDayAs(info1));
		System.out.println(info4.hasSameBirthDayAs(info2));
		System.out.println(info4.hasSameBirthDayAs(info3));
		System.out.println(info4.hasSameBirthDayAs(info5));

		System.out.println(info5.hasSameBirthDayAs(info1));
		System.out.println(info5.hasSameBirthDayAs(info2));
		System.out.println(info5.hasSameBirthDayAs(info3));
		System.out.println(info5.hasSameBirthDayAs(info4));

		

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
