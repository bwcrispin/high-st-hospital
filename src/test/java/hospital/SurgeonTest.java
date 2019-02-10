package hospital;

import org.junit.Assert;
import org.junit.Test;

public class SurgeonTest {

	Surgeon testSurgeon = new Surgeon("123", "Greg", 120000, "Heart");
	Patient testPatient = new Patient("234", "Spongebob");
	
	@Test
	public void shouldReturnDocName() {
		String docName = testSurgeon.getName();
		
		Assert.assertEquals(docName, "Greg");
	}
	
	@Test
	public void shouldReturnSpecialty() {
		String docJob = testSurgeon.getSpecialty();
		
		Assert.assertEquals(docJob, "Heart");
	}
	
	@Test
	public void shouldHealPatient() {
		int beforeHeal = testPatient.getHealthLevel();
		testPatient.damagePatient();
		testPatient.damagePatient();
		testSurgeon.careForPatient(testPatient);
		int afterHeal = testPatient.getHealthLevel();
		
		Assert.assertEquals(beforeHeal, afterHeal);  
	}
	
	@Test
	public void shouldDrawBlood( ) {
		int beforeDraw = testPatient.getBloodLevel();
		testSurgeon.drawBlood(testPatient);
		int afterDraw = testPatient.getBloodLevel();
		
		Assert.assertEquals(beforeDraw, afterDraw + 2);
	}
	
	@Test
	public void shouldGiveBlood() {
		testSurgeon.drawBlood(testPatient);
		int beforeGiveBlood = testPatient.getBloodLevel();
		testSurgeon.givePatientBlood(testPatient);
		int afterGiveBlood = testPatient.getBloodLevel();
		
		Assert.assertEquals(beforeGiveBlood + 2, afterGiveBlood);
	}
	
	@Test
	public void shouldcheckOperationStatus() {
		boolean opStatus = testSurgeon.isOperating();
		
		Assert.assertEquals(opStatus, false);
	}
	
	@Test
	public void shouldToggleOperationStatus() {
		testSurgeon.toggleOperate();
		boolean opStatus = testSurgeon.isOperating();
		
		Assert.assertEquals(opStatus, true);
	}
	
	@Test
	public void shouldBeDoneWithOperation() {
		testSurgeon.toggleOperate();
		testSurgeon.toggleOperate();
		boolean opStatus = testSurgeon.isOperating();
		
		Assert.assertEquals(opStatus, false);
	}

}
