package hospital;

import org.junit.Assert;
import org.junit.Test;

public class DoctorTest {

	Doctor testDoc = new Doctor("123", "Greg", 90000, "General Practice");
	Patient testPatient = new Patient("234", "Tanya");
	
	@Test
	public void shouldReturnDocName() {
		String docName = testDoc.getName();
		
		Assert.assertEquals(docName, "Greg");
	}
	
	@Test
	public void shouldReturnSpecialty() {
		String docJob = testDoc.getSpecialty();
		
		Assert.assertEquals(docJob, "General Practice");
	}
	
	@Test
	public void shouldHealPatient() {
		int beforeHeal = testPatient.getHealthLevel();
		testPatient.damagePatient();
		testPatient.damagePatient();
		testDoc.careForPatient(testPatient);
		int afterHeal = testPatient.getHealthLevel();
		
		Assert.assertEquals(beforeHeal, afterHeal);  
	}
	
	@Test
	public void shouldDrawBlood( ) {
		int beforeDraw = testPatient.getBloodLevel();
		testDoc.drawBlood(testPatient);
		int afterDraw = testPatient.getBloodLevel();
		
		Assert.assertEquals(beforeDraw, afterDraw + 2);
	}
	
	@Test
	public void shouldGiveBlood() {
		testDoc.drawBlood(testPatient);
		int beforeGiveBlood = testPatient.getBloodLevel();
		testDoc.givePatientBlood(testPatient);
		int afterGiveBlood = testPatient.getBloodLevel();
		
		Assert.assertEquals(beforeGiveBlood + 2, afterGiveBlood);
	}

}
