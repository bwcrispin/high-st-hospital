package hospital;

public class Janitor extends Employee {

	public Janitor(String eID, String name, int salary) {
		super(eID, name, salary);
		
	}

	public void sweep(Hospital a) {
		a.cleanHospital();
	}
}
