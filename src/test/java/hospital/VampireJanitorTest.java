package hospital;

import org.junit.Assert;
import org.junit.Test;

public class VampireJanitorTest {

	VampireJanitor testVamp = new VampireJanitor("321", "Vlad", 40000);
	Hospital testHos = new Hospital();
	Patient testPat = new Patient("23", "BloodBag");
	
	@Test
	public void shouldGetEmployeeID() {
		String empID = testVamp.geteID();
		
		Assert.assertEquals(empID, "321");
	}
	
	@Test
	public void shouldSweepHospital() {
		testHos.dirtyHospital();
		int beforeClean = testHos.getHospitalCleanliness();
		testVamp.sweep(testHos);
		int afterClean = testHos.getHospitalCleanliness();
		
		Assert.assertEquals(beforeClean + 20, afterClean);
	}
	
	@Test
	public void shouldDrawBlood() {
		int beforeDrawBlood = testPat.getBloodLevel();
		int beforeDrawHealth = testPat.getHealthLevel();
		testVamp.drawBlood(testPat);
		int afterDrawBlood = testPat.getBloodLevel();
		int afterDrawHealth = testPat.getHealthLevel();
		
		Assert.assertEquals(beforeDrawBlood, afterDrawBlood + 2);
		Assert.assertEquals(beforeDrawHealth, afterDrawHealth + 1);
	}
}
