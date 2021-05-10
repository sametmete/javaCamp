
public class Student extends User {


	public Student(int Id, String firstName, String lastName, String Email, 
			String password, 
			String instructor, String homework, int discontinuity, String courses) {
		super();
		this.Id = Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Email = Email;
		this.password = password;
		this.instructor = instructor;
		this.homework = homework;
		this.discontinuity = discontinuity;
		this.courses = courses;
		
	}
	public Student() {
		
	}
	
	
	
	String instructor;
	String homework;
	int discontinuity;
	String courses;
}
