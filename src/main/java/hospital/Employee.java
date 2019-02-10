package hospital;

public abstract class Employee {

		private String eID;
		private String name;
		private int salary;
		
		public Employee(String eID, String name, int salary) {
			this.eID = eID;
			this.name = name;
			this.salary = salary;
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
