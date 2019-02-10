package hospital;

import org.junit.Assert;
import org.junit.Test;

// Test made before class changed to abstract

public class EmployeeTest {

	Employee testEmp = new Employee("123", "Greg", 45000);
	
	@Test
	public void shouldReturnEmployeeID( ) {
		String emID = testEmp.geteID();
		
		Assert.assertEquals(emID, "123");
	}
	
	@Test
	public void shouldReturnEmployeeName() {
		String emName = testEmp.getName();
		
		Assert.assertEquals(emName, "Greg");
	}
	
	@Test
	public void shouldReturnEmployeeSalary() {
		int eSalary = testEmp.getSalary();
		
		Assert.assertEquals(eSalary, 45000);
	}
}
