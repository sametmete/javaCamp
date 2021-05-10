
public class StudentManager {

	public String discontinuityValue(Student student) {
		
		if(student.discontinuity>=60) {
			return student.firstName+" isimli öğrenci devamlılıktan geçti";
		}
		else {
			return student.firstName+" isimli öğrenci devamsızlıktan kaldı";
		}
	}
	
	public void addStudent(Student student) {
		System.out.println(student.firstName+ " isimli öğrenci sisteme kayıt oldu");
	}
	
	public void removeStudent(Student student) {
		System.out.println(student.firstName+ " isimli öğrenci sistemden silindi");
	}
}
