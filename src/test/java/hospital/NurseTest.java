package hospital;

import org.junit.Assert;
import org.junit.Test;



public class NurseTest {
	
		Nurse testNurse = new Nurse("098", "Sam", 50000);
		Patient testPatient = new Patient("123", "Rob");

		@Test
		public void shouldReturnNurseName() {
			String nurseName = testNurse.getName();
			
			Assert.assertEquals(nurseName, "Sam");
		}
		
		@Test
		public void shouldHealPatient() {
			int beforeHeal = testPatient.getHealthLevel();
			testPatient.damagePatient();
			testPatient.damagePatient();
			testNurse.careForPatient(testPatient);
			int afterHeal = testPatient.getHealthLevel();
			
			Assert.assertEquals(beforeHeal, afterHeal);  
		}
		
		@Test
		public void shouldDrawBlood( ) {
			int beforeDraw = testPatient.getBloodLevel();
			testNurse.drawBlood(testPatient);
			int afterDraw = testPatient.getBloodLevel();
			
			Assert.assertEquals(beforeDraw, afterDraw + 2);
		}
		
		@Test
		public void shouldGiveBlood() {
			testNurse.drawBlood(testPatient);
			int beforeGiveBlood = testPatient.getBloodLevel();
			testNurse.givePatientBlood(testPatient);
			int afterGiveBlood = testPatient.getBloodLevel();
			
			Assert.assertEquals(beforeGiveBlood + 2, afterGiveBlood);
		}
}
