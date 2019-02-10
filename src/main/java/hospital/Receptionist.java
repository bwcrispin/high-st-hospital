package hospital;

public class Receptionist extends Employee {

	private boolean onPhone;
	
	public Receptionist(String eID, String name, int salary) {
		super(eID, name, salary);
		this.onPhone = false;
	}

	public boolean isOnPhone() {
		return onPhone;
	}
	
	public void toggleOnPhone() {
		onPhone = !onPhone;
		
	}

}
