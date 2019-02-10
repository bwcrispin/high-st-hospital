package hospital;

public class VampireJanitor extends Janitor implements CanDrawBlood{

	public VampireJanitor(String eID, String name, int salary) {
		super(eID, name, salary);
		
	}

	public void drawBlood(Patient a) {
		a.damagePatient();
	}
}
