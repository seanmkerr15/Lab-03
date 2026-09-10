package Dog;

public class Dog {
	
	//data variables (always make private)
	private String name;
	private int age;
	private String breed;
	
	public Dog() {
		//this. meaning this object
		this.name = "Ben";
		this.age = 3;
		this.breed = "Canis fabulatus";
	}

	public Dog(String name, int age, String breed) {
		// this. meaning this object
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	//setters and getters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	
	
	//Replaces default string method with our own toString()
		@Override
 		public String toString() {
		    return "Dog{name = '" + name + "', age = '" + age + "', breed = '" + breed + "'}";
		
	}//end to string
		

}//end class
