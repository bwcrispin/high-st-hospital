package hospital;

import org.junit.Assert;
import org.junit.Test;

import hospital.Patient;


public class MedicalStaffTest {

	MedicalStaff testStaff = new MedicalStaff("123", "Bob", 45000);
	Patient testPat = new Patient("234", "Mary");
	
	@Test
	public void shouldDrawBlood() {
		int beforeDraw = testPat.getBloodLevel();
		System.out.println(testPat.getBloodLevel());
		testStaff.drawBlood(testPat);
		int afterDraw = testPat.getBloodLevel();
		
		Assert.assertEquals(beforeDraw -2, afterDraw);
	}
	
	@Test
	public void shouldGiveBlood() {
		int beforeGive = testPat.getBloodLevel();
		testStaff.drawBlood(testPat);
		testStaff.drawBlood(testPat);
		testStaff.givePatientBlood(testPat);
		int afterGive = testPat.getBloodLevel();
		
		Assert.assertEquals(beforeGive , afterGive);
	}
}
