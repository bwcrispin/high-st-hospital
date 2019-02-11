package hospital;

public class Patient {

		private String name;
		private String patientID;
		private int bloodLevel;
		private int healthLevel;
		private String injury;
		
		
		static int DEFAULT_BLOOD_LEVEL = 20;
		static int DEFAULT_HEALTH_LEVEL = 10;
		
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
			bloodLevel -= 4;
			healthLevel -= 2;
		}
		
		public void healPatient() {
			healthLevel += 2;
			healthLevel = enforceMaxValue(healthLevel);
		}
		
		public void bloodLoss() {
			bloodLevel -= 1;
		}
		
		public void giveBlood() {
			bloodLevel = DEFAULT_BLOOD_LEVEL;
		}
		
		public void getStatus() {
			System.out.println(getName() + " has a blood level of " + getBloodLevel() + " and a health level of " + getHealthLevel());
		}
		
		public int enforceMaxValue(int value) {
			if (value > 20) {
				value = 20;
			}
			return value;
		}
		
		public Patient(String patientID, String name) {
			this.name = name;
			this.patientID = patientID;
			this.bloodLevel = DEFAULT_BLOOD_LEVEL;
			this.healthLevel = DEFAULT_HEALTH_LEVEL;
		}


}
