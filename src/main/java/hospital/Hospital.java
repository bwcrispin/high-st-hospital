package hospital;

public class Hospital {
	
	private int hospitalCleanliness;
	
	public Hospital() {
		this.hospitalCleanliness = 100;
	}

	public int getHospitalCleanliness() {
		return hospitalCleanliness;
	}

	public void cleanHospital() {
		hospitalCleanliness += 20;	
	}

	public void dirtyHospital() {
		hospitalCleanliness -= 20;
	}

}
