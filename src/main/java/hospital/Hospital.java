package hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Hospital {
	
	//private HashMap<String, Patient> patients;
	//private HashMap<String, Employee> employees;
	
	private HashMap<String, Patient> patients = new HashMap<String, Patient>();
	private HashMap<String, Employee> employees = new HashMap<String, Employee>();
	
	private int hospitalCleanliness;
	
	public Hospital() {
		this.hospitalCleanliness = 100;
	}

	public int getHospitalCleanliness() {
		return hospitalCleanliness;
	}

	public void cleanHospital() {
		hospitalCleanliness += 20;	
	}

	public void dirtyHospital() {
		hospitalCleanliness -= 20;
	}

	public HashMap<String, Patient> getPatientList() {
		return patients;
	}

	public HashMap<String, Employee> getEmployeeList() {
		return employees;
	}
	
	public void addPatient(Patient patientToAdd) {
		patients.put(patientToAdd.getPatientID(), patientToAdd);
	}
	
	public void addEmployee(Employee employeeToAdd) {
		employees.put(employeeToAdd.geteID(), employeeToAdd);
	}
	
	public int getPatientListSize() {
		return patients.size();
	}
	
	public int getEmployeeListSize() {
		return employees.size();
	}
	
	/*public void getAllPatientStatus() {
		List<Patient> patientsByName = new ArrayList<>(patientList.values());

		Collections.sort(patientsByName, Comparator.comparing(Patient::getName));

		for (Patient specificPatient : patientList.values()) {
			if (specificPatient instanceof Patient) {
				((Patient) specificPatient).getStatus();
				System.out.println("");
			} 
		}
	}*/
	
	public Collection<Patient> getPatients() {
		return patients.values();
	}
	
	public Collection<Employee> getEmployees() {
		return employees.values();
	}
	

}
