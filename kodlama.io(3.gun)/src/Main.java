
public class Main {

	public static void main(String[] args) {
		
		
		
		Student student1 = new Student(1,"Samet","Mete","samet@gmail.com","123",
				"Engin Demiroð","1.gün ödevi",50,"Java");
		
		Instructor instructor1 = new Instructor();
		instructor1.Id = 1;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demiroð";
		instructor1.Email = "engindemirog@gmail.com";
		instructor1.password = "54323";
		instructor1.lessonContent = "inheritance, Polymorphism, getter and setter, solid principles";
		instructor1.courses = "Java & React, C# & Angular";
		
		
		User user = new User(3,"Ahmet","Altýntop","ahmet@hotmail.com","145686");
		
		
		UserManager userManager = new UserManager();

		userManager.logIn(instructor1); 
		
		
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.addStudent(student1);
		
		studentManager.discontinuityValue(student1);
		
		System.out.println(studentManager.discontinuityValue(student1));
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.addInstructor(instructor1);
		
		instructorManager.InstructorInformation(instructor1);
	}

}
