package hospital;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class HospitalTst {

	Hospital testHospital = new Hospital();
	private HashMap<String, Patient> testPatList = new HashMap<String, Patient>();
	private HashMap<String, Employee> testEmpList = new HashMap<String, Employee>();
	
	Nurse testNurse = new Nurse("1", "Betty", 50000);
	Nurse testNurse1 = new Nurse("2", "Dino", 50000);
	Doctor testDoc = new Doctor("3", "Pebbles", 90000, "Cancer");
	Doctor testDoc1 = new Doctor("4", "BamBam", 90000, "Eye");
	Surgeon testSurg = new Surgeon("5", "Barney", 120000, "Foot");
	Surgeon testSurg1 = new Surgeon("6", "Wilma", 120000, "Lung");
	Janitor testJan = new Janitor("7", "Fred", 40000);
	VampireJanitor testVamp = new VampireJanitor("8", "Vlad", 40000);
	Receptionist testRep = new Receptionist("9", "Babs", 45000);
	Patient testPat = new Patient("1", "Bobby");
	Patient testPat2 = new Patient("2", "Hank");
	Patient testPat3 = new Patient("3", "Khan");
	
	
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
	
	@Test
	public void addToPatientList() {
		int patListSize = testPatList.size();
		((HashMap<String, Patient>) testPatList).put("1", testPat);
		((HashMap<String, Patient>) testPatList).put("2", testPat2);
		((HashMap<String, Patient>) testPatList).put("3", testPat3);
		int patListSizeAfterAdding = testPatList.size();
		
		Assert.assertEquals(patListSize + 3, patListSizeAfterAdding);
		
	}

	@Test
	public void getAllPatientStatus() {
		((HashMap<String, Patient>) testPatList).put("1", testPat);
		((HashMap<String, Patient>) testPatList).put("2", testPat2);
		((HashMap<String, Patient>) testPatList).put("3", testPat3);
		
		Assert.assertEquals(testPatList.getPatients() instanceof Collection<?>, true );
	}
	
}
