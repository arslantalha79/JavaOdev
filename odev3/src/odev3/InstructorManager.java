package odev3;

public class InstructorManager extends UserManager{

	public void addNewCourse(Instructor �nstructor) {
		System.out.println(�nstructor.firstName + �nstructor.lastName + "  sisteme yeni bir kurs eklediniz");
	}
	
	public void deletedCourse(Instructor �nstructor) {
		System.out.println(�nstructor.firstName + �nstructor.lastName + " sistemden kursu sildiniz.");
	}
}
