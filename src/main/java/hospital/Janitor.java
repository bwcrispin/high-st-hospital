package hospital;

public class Janitor extends Employee {

	public Janitor(String eID, String name, int salary, String role) {
		super(eID, name, salary, role);
		
	}

	public void sweep(Hospital a) {
		a.cleanHospital();
	}
}
