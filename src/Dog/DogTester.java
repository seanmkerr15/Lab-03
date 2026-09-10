// Sean Kerr
// 09/08/26
// Dog object test class
package Dog;

public class DogTester {

	public static void main(String[] args) {
		//testing a Dog object
		Dog dog1 = new Dog();
		dog1.setName("BEN");
		dog1.setBreed("Lab");
		dog1.setAge(5);
		
		
		System.out.println("\nDefaults for dog1 fields (before any assignment):");
		System.out.println(dog1.toString());
		
		/*
		System.out.println("name = " + dog1.name);
		System.out.println("age = " + dog1.age);
		System.out.println("breed = " + dog1.breed);
		*/
		
		Dog dog2 = new Dog("Dover", 5, "Golden Retriever");
		
		System.out.println("\nDefaults for dog2 fields (before any assignment):");
		System.out.println(dog2.toString());
		/*
		System.out.println("name = " + dog2.name);
		System.out.println("age = " + dog2.age);
		System.out.println("breed = " + dog2.breed);
		*/
		
		Dog dog3 = new Dog();
		dog3.setName("Max");
		dog3.setAge(6);
		dog3.setBreed("Baller");
		System.out.println("\nPrinting after making fields private");
		System.out.println("Printing age: " + dog3.getAge());
		System.out.println("Printing Name: " + dog3.getName());
		System.out.println("Printing breed: " + dog3.getBreed());
		
		
		

	}//end main

}//end class
