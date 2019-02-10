package hospital;

public class Patient {

		private String name;
		private String patientID;
		private int bloodLevel;
		private int healthLevel;
		
		
		static int DEFAULT_BLOOD_LEVEL = 20;
		static int DEFAULT_HEALTH_LEVEL = 20;
		
		public String getName() {
			return name;
		}

		public String getPatientID() {
			return patientID;
		}

		public int getBloodLevel() {
			return bloodLevel;
		}
		
		public int getHealthLevel() {
			return healthLevel;
		}
		
		public void damagePatient() {
			bloodLevel -= 2;
			healthLevel -= 1;
		}
		
		public void healPatient() {
			healthLevel += 2;
		}
		
		public void bloodLoss() {
			bloodLevel -= 2;
		}
		
		public void giveBlood() {
			bloodLevel = DEFAULT_BLOOD_LEVEL;
		}
		
		public Patient(String patientID, String name) {
			this.name = name;
			this.patientID = patientID;
			this.bloodLevel = DEFAULT_BLOOD_LEVEL;
			this.healthLevel = DEFAULT_HEALTH_LEVEL;
		}

}
