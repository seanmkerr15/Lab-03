//Sean Kerr
//09/08/2026
//My object test class
package Course;

public class CourseTester {

	public static void main(String[] args) {
		Course course1 = new Course();

		System.out.println("Printing course1 directly:");
		System.out.println(course1.toString());

		System.out.println("\nDefaults for Course1 fields (before any assignment):");

		Course course2 = new Course();

		System.out.println("Printing course1 directly:");
		System.out.println(course2.toString());

		System.out.println("\nCourse2 fields (before any assignment):");

	}

}
