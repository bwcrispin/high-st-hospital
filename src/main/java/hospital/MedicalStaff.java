package hospital;


public class MedicalStaff extends Employee implements CanDrawBlood{

	public MedicalStaff(String eID, String name, int salary) {
		super(eID, name, salary);
	}

	public void drawBlood(Patient a) {
		a.bloodLoss();
		
	}
	
	

}
