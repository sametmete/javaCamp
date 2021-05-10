
public class InstructorManager {

	public void InstructorInformation(Instructor instructor) {
		System.out.println("Aradýðýnýz eðitmen bilgileri : "+instructor.firstName+" "+instructor.lastName+"\nVerdiði kurslar: "+instructor.courses);
	}
	
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.firstName+" isimli eðitmen sisteme kayýt oldu.");
	}
	
	public void RemoveInstructor(Instructor instructor) {
		System.out.println( instructor.firstName+" isimli eðitmen sistemde silindi.");
	}
	

}
