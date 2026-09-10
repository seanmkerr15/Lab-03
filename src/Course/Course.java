package Course;

public class Course {
	
	private String name;
	private Grade grade;
	private String classroom;
	
	//parameterized constructor
	public Course(String name, Grade grade, String classroom) {
	    this.name = name;
	    this.grade = grade;
	    this.classroom = classroom;
	}
	//no-argument constructor
	public Course() {
		this.name = "Unknown";
		this.grade = Grade.NOT_ASSIGNED;
		this.classroom = "Unknown";
	}
	
	public void setName(String setName) {
		name = setName;
	}
	
	public void setGrade(Grade setGrade) {
		grade = setGrade;
	}
	
	public void setClassroom(String setClassroom) {
		classroom = setClassroom;
	}
	
	public String getName() {
		return name;
	}
	
	public Grade getGrade() {
		return grade;
	}
	
	public String getClassroom() {
		return classroom;
	}
	
	@Override
		public String toString() {
	    return "Course{name = '" + name + "', grade = '" + grade + "', classroom number = '" + classroom + "'}";
	}
}
