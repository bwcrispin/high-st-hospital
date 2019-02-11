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
	
	public void addPatient(Patient patient) {
		patients.put(patient.getPatientID(), patient);
	}
	
	public void addEmployee(Employee employee) {
		employees.put(employee.geteID(), employee);
	}
	
	public int getPatientListSize() {
		return patients.size();
	}
	
	public int getEmployeeListSize() {
		return employees.size();
	}
	
	public Collection<Patient> getPatients() {
		return patients.values();
	}
	
	public Collection<Employee> getEmployees() {
		return employees.values();
	}
	
	public void statusPatientAll() {
		List<Patient> patientByName = new ArrayList<>(patients.values());

		Collections.sort(patientByName, Comparator.comparing(Patient::getName));

		//System.out.println();
		for (Patient specificPatient : patientByName) {
				specificPatient.getStatus();
				System.out.println("");
		}
	}
	
	public void endTurn() {
		statusPatientAll();
	}

}
