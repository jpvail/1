package assignment03;
import java.util.List;
import java.util.ArrayList;

public class ClassRoomTester{
	public static void main(String[] args){
		ClassRoom c1 = new ClassRoom();
		c1.addStudent(new Student(1, "Gina"));
		c1.addStudent(new Student(2, "Tyler"));
		c1.addStudent(new Student(4, "Jessica"));
		c1.addStudent(new Student(5, "Richard"));

		ClassRoom c2 = new ClassRoom();
		c2.addStudent(new Student(9, "Jason"));
		c2.addStudent(new Student(8, "Mike"));
		c2.addStudent(new Student(7, "Brian"));
		c2.addStudent(new Student(3, "Arnold"));
		c2.addStudent(new Student(5, "Richard"));
		
		ClassRoom c3 = new ClassRoom();
		c3.addStudent(new Student(14, "Paul"));
		c3.addStudent(new Student(11, "Larry"));
		c3.addStudent(new Student(15, "Chad"));
		c3.addStudent(new Student(10, "Brad"));
		c3.addStudent(new Student(3, "Arnold"));
		c3.addStudent(new Student(5, "Richard"));
		
		ClassRoom c4 = new ClassRoom();
		c4.addStudent(new Student(14, "Paul"));
		c4.addStudent(new Student(11, "Larry"));
		c4.addStudent(new Student(15, "Chad"));
		c4.addStudent(new Student(3, "Arnold"));
		c4.addStudent(new Student(5, "Richard"));

		ClassRoom c5 = new ClassRoom();
		c5.addStudent(new Student(5, "Richard"));
		
		ClassRoom c6 = new ClassRoom();
		c6.addStudent(new Student(5, "Richard"));

	
		

//Richard in All
//Arnold in c1,c2,c3
//All others in 2 or less
			

		System.out.println("**************SortByID**********");
		ClassRoom.sortById(c2.getRoster()); 
		System.out.println(c2.getRoster());


		System.out.println("\n*******isRegistered(True then False)**********");
		System.out.println(String.valueOf(c1.isRegistered(2)) + " " + String.valueOf(c1.isRegistered(7)));
		

		System.out.println("\n*******alsoRegisteredIn(Arnold, Richard)**********");
		System.out.println(c2.alsoRegisteredIn(c3, c4));


		System.out.println("\n*******registeredInAll(Richard)**********");
		System.out.println(ClassRoom.registeredInAll(c1, c2, c3, c4));

		
		System.out.println("\n*******registeredInOne(Gina, Tyler, Arnold, Richard, Jessica, Jason, Mike, Brian, Paul, Larry, Chad, Brad)**********");
		System.out.println(ClassRoom.registeredInOne(c1, c2, c3, c4, c5, c6));
	}
}
