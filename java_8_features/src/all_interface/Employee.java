package all_interface;

class Employee implements Comparable
{
	private int empCode;
	private String empName;
	public Employee(int empCode, String empName) {
		super();
		this.empCode = empCode;
		this.empName = empName;
	}
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		if(this.empCode>e.empCode)
			return 1;
		else if(this.empCode<e.empCode)
			return -1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + "]";
	}
	
	
}

    class Backwardcompatibility {

	public static void main(String[] args) {
		
		Employee earray[]={new Employee(10,"Siva"),new Employee(4,"Ram"),new Employee(7,"Prasad")};
		Comparable<Employee> comparable=(e)->{
			System.out.println(e);
			return 0;
		};
		
		int i=comparable.compareTo(earray[1]);
		System.out.println(i);
	}

}