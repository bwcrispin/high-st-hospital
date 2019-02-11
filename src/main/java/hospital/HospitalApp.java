package hospital;

import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Hospital Hospital = new Hospital();
		String userChoice;
		String userEmployeeChoice;
		String userPatientChoice;
		
		// Adding employees
		Hospital.addEmployee(new Nurse("1", "Sonny", 50000, "Nurse"));
		Hospital.addEmployee(new Nurse("2", "Cher", 50000, "Nurse"));
		Hospital.addEmployee(new Nurse("3", "Captain", 50000, "Nurse"));
		Hospital.addEmployee(new Nurse("4", "Tenille", 50000, "Nurse"));
		Hospital.addEmployee(new Doctor("5", "Doctor", 90000, "Doctor", "Eye"));
		Hospital.addEmployee(new Doctor("6", "Feelgood", 90000, "Doctor", "Heart"));
		Hospital.addEmployee(new Doctor("7", "Worm", 90000, "Doctor", "Stomach"));
		Hospital.addEmployee(new Doctor("8", "Lee, PhD", 90000, "Doctor", "Butt"));
		Hospital.addEmployee(new Surgeon("9", "Stabby", 120000, "Surgeon", "Eye"));
		Hospital.addEmployee(new Surgeon("10", "Slashy", 1200000, "Surgeon", "Heart"));
		Hospital.addEmployee(new Surgeon("11", "Hacky", 1200000, "Surgeon", "Stomach"));
		Hospital.addEmployee(new Surgeon("12", "Slicey", 1200000, "Surgeon", "Butt"));
		Hospital.addEmployee(new Janitor("13", "Janitor", 40000, "Janitor"));
		Hospital.addEmployee(new Janitor("14", "Jan Itor", 40000, "Janitor"));
		Hospital.addEmployee(new Janitor("15", "Scruffy", 40000, "Janitor"));
		Hospital.addEmployee(new VampireJanitor("16", "Vlad", 40000, "Janitor"));
		Hospital.addEmployee(new Receptionist("17", "Edna", 45000, "Receptionist"));
		Hospital.addEmployee(new Receptionist("18", "Lois", 45000, "Receptionist"));
		
		// Add Patients
		Hospital.addPatient(new Patient("1", "Batman"));
		Hospital.addPatient(new Patient("2", "Aquaman"));
		Hospital.addPatient(new Patient("3", "Magneto"));
		Hospital.addPatient(new Patient("4", "Cyclops"));
		Hospital.addPatient(new Patient("5", "Vision"));
		Hospital.addPatient(new Patient("6", "Thor"));
		Hospital.addPatient(new Patient("7", "Superman"));
		Hospital.addPatient(new Patient("8", "Flash"));
		Hospital.addPatient(new Patient("9", "StarLord"));
		Hospital.addPatient(new Patient("10", "Sneezy"));
		
		String start = "Welcome to the High St. Hospital administration console.\n"
		+ "Please work from the choices below to keep the hospital running.\n";
		
		String help = "Commands\n"
				+ " 1. List staff\n"
				+ " 2. \n"
				+ " 3. \n"
				+ " 4. \n"
				+ " 5. \n"
				+ " 6. \n"
				+ " 7. \n" 
				+ " 8. \n"
				+ " 9. \n"
				+ " 0. \n" 
				+ " Exit";
		
		System.out.println(start);
		System.out.println(help);
		System.out.println("What would you like to do?");
		String userInput = input.nextLine();

		while (userInput.toLowerCase().equals("help")) {
			System.out.println(start);
			System.out.println(help);
			System.out.println("What would you like to do?");
			userInput = input.nextLine();
		}
		
		while (true) {
			System.out.println("What would you like to do?");
			userInput = input.nextLine();
			userChoice = "";
			
			if (userChoice.equalsIgnoreCase("List staff") || userChoice.equalsIgnoreCase("1")) {
				Hospital.endTurn();
			}
		}	
		
		
	}
}
