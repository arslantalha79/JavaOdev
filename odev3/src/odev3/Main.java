package odev3;

public class Main {

	public static void main(String[] args) {
		
		Student ömer = new Student();
		ömer.userName = "arslantalha79";
		
		Instructor ýnstructor = new Instructor();
		ýnstructor.firstName = "Engin";
		ýnstructor.lastName = "Demiroð";
		
		UserManager userManager = new UserManager();
		
		User[] users = {ömer , ýnstructor};
		
		userManager.Add(users);
	}

}
