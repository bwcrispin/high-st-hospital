package hospital;

public class Doctor extends MedicalStaff {

	private String specialty;
	
	public Doctor(String eID, String name, int salary, String role, String specialty) {
		super(eID, name, salary, role);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}
}
