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
}
