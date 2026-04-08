package exam12_상속후;

public class Engineer extends Employee {
	String skill;

	public Engineer() {
	}

	public Engineer(String name,int salary,String skill) {
		super(name,salary);
		System.out.println("Engineer");
//		this.name = name;
//		this.salary = salary;
		this.skill = skill;
	}
	
//	public String getEngineer() {
//		return name+"\t"+salary+"\t"+skill;
//	}
		@Override
		public String getEmployee() {
			return name+"\t"+salary+"\t"+skill;
		}

		@Override
		public String toString() {
			return "Engineer [skill=" + skill + ", name=" + name + ", salary=" + salary + "]";
		}

	

		
	
}
