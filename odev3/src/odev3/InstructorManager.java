package odev3;

public class InstructorManager extends UserManager{

	public void addNewCourse(Instructor ýnstructor) {
		System.out.println(ýnstructor.firstName + ýnstructor.lastName + "  sisteme yeni bir kurs eklediniz");
	}
	
	public void deletedCourse(Instructor ýnstructor) {
		System.out.println(ýnstructor.firstName + ýnstructor.lastName + " sistemden kursu sildiniz.");
	}
}
