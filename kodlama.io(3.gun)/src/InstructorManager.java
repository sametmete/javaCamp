
public class InstructorManager {

	public void InstructorInformation(Instructor instructor) {
		System.out.println("Arad���n�z e�itmen bilgileri : "+instructor.firstName+" "+instructor.lastName+"\nVerdi�i kurslar: "+instructor.courses);
	}
	
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.firstName+" isimli e�itmen sisteme kay�t oldu.");
	}
	
	public void RemoveInstructor(Instructor instructor) {
		System.out.println( instructor.firstName+" isimli e�itmen sistemde silindi.");
	}
	

}
