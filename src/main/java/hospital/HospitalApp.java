package hospital;

import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Hospital Hospital = new Hospital();
		String userChoice;
		
		String start = "Welcome to the High St. Hospital administration console.\n"
		+ "Please work from the choices below to keep the hospital running.\n";
		
		String help = "Commands\n"
				+ " 1. \n"
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
		

	}

}
