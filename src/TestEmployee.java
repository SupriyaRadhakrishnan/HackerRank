
public class TestEmployee  {

	
	public TestEmployee(String dept, int salary) {
		this.dept = dept;
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "TestEmployee [dept=" + dept + ", salary=" + salary + "]";
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private String dept;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	private int salary;
}
