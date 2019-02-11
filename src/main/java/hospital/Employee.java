package hospital;

public abstract class Employee {

		private String eID;
		private String name;
		private int salary;
		private String role;
		
		public Employee(String eID, String name, int salary, String role) {
			this.eID = eID;
			this.name = name;
			this.salary = salary;
			this.role = role;
		}

		public String geteID() {
			return eID;
		}

		public String getName() {
			return name;
		}
		
		public int getSalary() {
			return salary;
		}

}
