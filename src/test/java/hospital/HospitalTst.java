package hospital;

import org.junit.Assert;
import org.junit.Test;



public class HospitalTst {

	Hospital testHospital = new Hospital();
	
	@Test
	public void shouldReturnHospitalCleanliness() {
		int hospStat = testHospital.getHospitalCleanliness();
		
		Assert.assertEquals(hospStat, 100);
	}
	
	@Test
	public void shouldDirtyHospital() {
		int beforeDirt = testHospital.getHospitalCleanliness();
		testHospital.dirtyHospital();
		int afterDirt = testHospital.getHospitalCleanliness();
		
		Assert.assertEquals(beforeDirt, afterDirt + 20);
	}
	
	// The following test should be looked after by the Janitor.  Just testing the method works.
	@Test
	public void shouldCleanHospital() {
		testHospital.dirtyHospital();
		int beforeClean = testHospital.getHospitalCleanliness();
		testHospital.cleanHospital();
		int afterClean = testHospital.getHospitalCleanliness();
		
		Assert.assertEquals(beforeClean + 20, afterClean);
	}
	
}
