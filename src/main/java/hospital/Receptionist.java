package hospital;

public class Receptionist extends Employee {

	private boolean onPhone;
	
	public Receptionist(String eID, String name, int salary, String role) {
		super(eID, name, salary, role);
		this.onPhone = false;
	}

	public boolean isOnPhone() {
		return onPhone;
	}
	
	public void toggleOnPhone() {
		onPhone = !onPhone;
		
	}

}
