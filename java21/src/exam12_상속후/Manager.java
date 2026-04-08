package exam12_상속후;

public class Manager extends Employee {
	String depart;

	public Manager() {
	}

	public Manager(String name,int salary,String depart) {
		super(name,salary);
		System.out.println("Engineer");
//		this.name = name;
//		this.salary = salary;
		this.depart = depart;
	}
	
//	public String getEngineer() {
//		return name+"\t"+salary+"\t"+skill;
//	}
		@Override
		public String getEmployee() {
			return name+"\t"+salary+"\t"+depart;
		}

		@Override
		public String toString() {
			return "Manager [depart=" + depart + ", name=" + name + ", salary=" + salary + "]";
		}

		

	

		
	
}
