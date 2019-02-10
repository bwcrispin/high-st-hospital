package hospital;

import org.junit.Assert;
import org.junit.Test;


public class ReceptionistTest {

	Receptionist testRep = new Receptionist("234", "Rodrigo", 45000);
	
	@Test
	public void shouldGetSalary() {
		int money = testRep.getSalary();
		
		Assert.assertEquals(money, 45000);
	}
	
	@Test
	public void isOnPhone() {
		boolean talking = testRep.isOnPhone();
		
		Assert.assertEquals(talking, false);
	}
	
	@Test
	public void shouldBeTalking() {
		testRep.toggleOnPhone();
		boolean talking = testRep.isOnPhone();
		
		Assert.assertEquals(talking, true);
	}
	
	@Test
	public void shouldBeDoneTalking() {
		boolean beforeTalking = testRep.isOnPhone();
		testRep.toggleOnPhone();
		testRep.toggleOnPhone();
		boolean afterTalking = testRep.isOnPhone();
		
		Assert.assertEquals(beforeTalking, afterTalking);
	}

}
