
public class StudentManager {

	public String discontinuityValue(Student student) {
		
		if(student.discontinuity>=60) {
			return student.firstName+" isimli ��renci devaml�l�ktan ge�ti";
		}
		else {
			return student.firstName+" isimli ��renci devams�zl�ktan kald�";
		}
	}
	
	public void addStudent(Student student) {
		System.out.println(student.firstName+ " isimli ��renci sisteme kay�t oldu");
	}
	
	public void removeStudent(Student student) {
		System.out.println(student.firstName+ " isimli ��renci sistemden silindi");
	}
}
