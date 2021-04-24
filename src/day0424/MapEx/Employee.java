package day0424.MapEx;

public class Employee {
	private String name;
	private int salary;
	private String address;
	
	public Employee(String name, int salary, String address) {
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름은 : " + name + "  연봉은 : " + salary + "  주소 : " + address ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
