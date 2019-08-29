package assignment01;
import java.time.LocalDate;
/**
 * 
 * @author CS 140
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester {


	public static void main(String[] args){
	
		SimpleDate date1 = SimpleDate.of(2007,04,02); 
		SimpleDate date2 = SimpleDate.of(2007,04,03); 

		System.out.println(date1.before(date2)); 
		

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



	}

}




















