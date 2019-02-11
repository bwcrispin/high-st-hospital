package hospital;

import org.junit.Assert;
import org.junit.Test;



public class PatientTest {

	Patient testPatient = new Patient("234", "Mary");
	
	@Test
	public void shouldReturnPatientID() {
		// Act
		String pID = testPatient.getPatientID();
		// Assert
		Assert.assertEquals(pID, "234");
	}
	
	@Test
	public void shouldReturnPatientName() {
		// Act
		String pName = testPatient.getName();
		// Assert
		Assert.assertEquals(pName, "Mary");
	}
	
	@Test
	public void shouldReturnBloodLevel() {
		// Act
		int bLevel = testPatient.getBloodLevel();
		// Assert
		Assert.assertEquals(bLevel, 20);
	}
	
	@Test
	public void shouldReturnHealthLevel() {
		// Act
		int hLevel = testPatient.getHealthLevel();
		// Assert
		Assert.assertEquals(hLevel, 10);
	}
	
	@Test
	public void shouldDamagePatientBlood() {
		int beforeDamage = testPatient.getBloodLevel();
		testPatient.damagePatient();
		testPatient.damagePatient();
		int afterDamage = testPatient.getBloodLevel();
		
		Assert.assertEquals(beforeDamage, afterDamage +4);
	}
	
	@Test
	public void shouldHealPatient() {
		int beforeHeal = testPatient.getHealthLevel();
		testPatient.healPatient();
		int afterHeal = testPatient.getHealthLevel();
		
		Assert.assertEquals(beforeHeal + 2, afterHeal);
	}
	
	@Test
	public void shouldGetStatus() {
		testPatient.getStatus();
	}
}
