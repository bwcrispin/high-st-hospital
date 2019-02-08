package hospital;

public class Patient {

		private String name;
		private String patientID;
		private int bloodLevel;
		private int healthLevel;
		
		
		final int DEFAULT_BLOOD_LEVEL;
		final int DEFAULT_HEALTH_LEVEL;
		
		public String getName() {
			return name;
		}

		public String getPatientID() {
			return patientID;
		}

		public int getBloodLevel() {
			return DEFAULT_BLOOD_LEVEL;
		}
		
		public int getHealthLevel() {
			return DEFAULT_HEALTH_LEVEL;
		}
		
		public Patient(String patientID, String name) {
			this.name = name;
			this.patientID = patientID;
			DEFAULT_BLOOD_LEVEL = 20;
			DEFAULT_HEALTH_LEVEL = 10;
		}
}
