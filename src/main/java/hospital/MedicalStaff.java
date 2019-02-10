package hospital;


public abstract class MedicalStaff extends Employee implements CanDrawBlood{

	public MedicalStaff(String eID, String name, int salary) {
		super(eID, name, salary);
	}

	public void drawBlood(Patient a) {
		a.bloodLoss();
		
	}
	
	public void careForPatient(Patient a) {
		a.healPatient();
	}
	
	public void givePatientBlood(Patient a) {
		a.giveBlood();
	}

}
