package hospital;

public class VampireJanitor extends Janitor implements CanDrawBlood{

	public VampireJanitor(String eID, String name, int salary, String role) {
		super(eID, name, salary, role);
		
	}

	public void drawBlood(Patient a) {
		a.damagePatient();
	}
}
