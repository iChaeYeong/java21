package exam12_상속후;

public abstract class Employee {
	String name;
	int salary;

	public Employee() {
		System.out.println("Employee");
	}

	public Employee(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
	}
	
	public abstract String getEmployee();
}
