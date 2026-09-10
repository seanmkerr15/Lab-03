//Sean Kerr
//09/08/2026
//My object test class
package Course;

import java.util.Scanner;

public class CourseTester {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Course course1 = new Course();	
		System.out.println("\nDefaults for Course1 fields (before any assignment):");
		System.out.println(course1.toString());

		

		Course course2 = new Course();
		
		System.out.println("\nPlease type in the name of the Class:");
		String NAME = scnr.nextLine();
		course2.setName(NAME);
		
		System.out.println("\nPlease type a grade of the variety [A, B, C, D, E, F, N/A]");
		String GRADE = scnr.nextLine();
		Grade gradeEntered;
		if (GRADE.equalsIgnoreCase("N/A")) {
			gradeEntered = Grade.NOT_ASSIGNED;
		}
		else {
			gradeEntered = Grade.valueOf(GRADE.toUpperCase());
		}
		course2.setGrade(gradeEntered);
		
		System.out.println("\nPlease enter classroom number:");
		String NUMBER = scnr.nextLine();
		course2.setClassroom(NUMBER);
		
		
		
		System.out.println("\nPrinting course1 directly:");
		System.out.println(course2.toString());
		
		System.out.println("\nWould you like to add another class?");
		System.out.println("Type yes or no, first letters of words are also acceptable");
		String response = scnr.nextLine();
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
			
			  System.out.println("\nWould you like to add another class?");
			    System.out.println("Type y or n");
			    String response2 = scnr.nextLine();
			    choice = Character.toLowerCase(response2.charAt(0));
		}
		


	}

}
