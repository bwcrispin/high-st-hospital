package hospital;

public class Doctor extends MedicalStaff {

	private String specialty;
	
	public Doctor(String eID, String name, int salary, String specialty) {
		super(eID, name, salary);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}
}
