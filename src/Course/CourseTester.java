//Sean Kerr
//09/08/2026
//My object test class
package Course;

import java.util.Scanner;

public class CourseTester {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//Creates object Course named course1
		Course course1 = new Course();	
		System.out.println("\nDefaults for Course1 fields (before any assignment):");
		//print default values
		System.out.println(course1.toString());

		//Creates object Course named course2
		Course course2 = new Course();
		
		System.out.println("\nPlease type in the name of the Class:");
		//Uses user input to set the name of class
		String NAME = scnr.nextLine();
		course2.setName(NAME);
		
		System.out.println("\nPlease type a grade of the variety [A, B, C, D, E, F, N/A]");
		//Uses Grade to ensure inputs
		String GRADE = scnr.nextLine();
		Grade gradeEntered;
		//ignores lower case
		if (GRADE.equalsIgnoreCase("N/A")) {
			gradeEntered = Grade.NOT_ASSIGNED;
		}
		else {
			//Turns anything inputed into upper case
			gradeEntered = Grade.valueOf(GRADE.toUpperCase());
		}
		//uses the text that was ran through program to update setGrade
		course2.setGrade(gradeEntered);
		
		//Same thing as setting name but instead asks for classroom number
		System.out.println("\nPlease enter classroom number:");
		String NUMBER = scnr.nextLine();
		course2.setClassroom(NUMBER);
		
		
		//Prints course2 inputs
		System.out.println("\nPrinting course1 directly:");
		System.out.println(course2.toString());
		
		//Asks user if they want to keep adding classes
		System.out.println("\nWould you like to add another class?");
		System.out.println("Type yes or no, first letters of words are also acceptable");
		String response = scnr.nextLine();
		//Whatever they type if y is at the start it will continue to add classes
		char choice = Character.toLowerCase(response.charAt(0));
		while (choice == 'y') {
			Course course3 = new Course();
			System.out.println("\nPlease type in the name of the Class:");
			String NAME2 = scnr.nextLine();
			course3.setName(NAME2);
			
			System.out.println("\nPlease type a grade of the variety [A, B, C, D, E, F, N/A]");
			String GRADE2 = scnr.nextLine();
			Grade gradeEntered2;
			if (GRADE2.equalsIgnoreCase("N/A")) {
				gradeEntered2 = Grade.NOT_ASSIGNED;
			}
			else {
				gradeEntered2 = Grade.valueOf(GRADE2.toUpperCase());
			}
			course2.setGrade(gradeEntered2);
			
			System.out.println("\nPlease enter classroom number:");
			String NUMBER2 = scnr.nextLine();
			course2.setClassroom(NUMBER2);
			
			//continues loop until no
			  System.out.println("\nWould you like to add another class?");
			    System.out.println("Type y or n");
			    String response2 = scnr.nextLine();
			    choice = Character.toLowerCase(response2.charAt(0));
		}
		


	}

}
