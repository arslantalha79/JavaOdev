package odev3;

public class StudentManager extends UserManager{
	
	
	public void completedCourse(Student student) {
		System.out.println(student.id + " c# kursunu tamamladı.");
	}
}
