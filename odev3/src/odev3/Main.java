package odev3;

public class Main {

	public static void main(String[] args) {
		
		Student �mer = new Student();
		�mer.userName = "arslantalha79";
		
		Instructor �nstructor = new Instructor();
		�nstructor.firstName = "Engin";
		�nstructor.lastName = "Demiro�";
		
		UserManager userManager = new UserManager();
		
		User[] users = {�mer , �nstructor};
		
		userManager.Add(users);
	}

}
