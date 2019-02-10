package hospital;

public class Surgeon extends Doctor {

	private boolean operate;
	
	public Surgeon(String eID, String name, int salary, String specialty) {
		super(eID, name, salary, specialty);
		this.operate = false;
	}

	public void toggleOperate() {
		this.operate = !this.operate; 
	}
	
	public boolean isOperating() {
		return operate;
	}
	
}
