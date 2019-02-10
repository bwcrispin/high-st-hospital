package hospital;

import org.junit.Assert;
import org.junit.Test;

public class JanitorTest {

	Janitor testJan = new Janitor("345", "Fred", 40000);
	Hospital testHos = new Hospital();
	
	@Test
	public void shouldSweep() {
		testHos.dirtyHospital();
		int beforeSweep = testHos.getHospitalCleanliness();
		testJan.sweep(testHos);
		int afterSweep = testHos.getHospitalCleanliness();
		
		Assert.assertEquals(beforeSweep + 20, afterSweep);
	}

}
