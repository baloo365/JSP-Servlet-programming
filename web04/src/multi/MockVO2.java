package multi;

public class MockVO2 {
	private String number;
	private String name;
	private String department;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "MockVO2 [number=" + number + ", name=" + name + ", department=" + department
		+ "]";
	}
}