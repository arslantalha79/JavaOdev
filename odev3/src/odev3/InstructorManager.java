package odev3;

public class InstructorManager extends UserManager{

	public void addNewCourse(Instructor żnstructor) {
		System.out.println(żnstructor.firstName + żnstructor.lastName + "  sisteme yeni bir kurs eklediniz");
	}
	
	public void deletedCourse(Instructor żnstructor) {
		System.out.println(żnstructor.firstName + żnstructor.lastName + " sistemden kursu sildiniz.");
	}
}
