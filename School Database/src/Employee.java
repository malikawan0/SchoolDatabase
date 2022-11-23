

public class Employee extends Person  {
	
	
	private String deptName;
	private static int numEmployees = 0;
	private int employeeID;
	
	
	public Employee() {
		
		super("", 0);
		this.deptName = "";
		numEmployees++;
		this.employeeID = numEmployees;
		
	}
	
	public Employee (String deptName) {
		super("", 0);
		this.deptName = deptName;
		numEmployees++;
		this.employeeID = numEmployees;
		
		
	}
	
	public Employee(String name, int birthYear, String deptName) {
		
		super(name, birthYear);
		
		this.deptName = deptName;
		numEmployees++;
		this.employeeID = numEmployees;
		
		
	}
	
	public String getDeptName() {
		
		return this.deptName;
		
		
	}
	
public void setDeptName(String deptName) {
		
		this.deptName = deptName;
		
		
	}
	
	
	public static int getNumEmployees() {
		
		return numEmployees;
		
		
		
		
	}
	
	public int getEmployeeID() {
		
	return this.employeeID;
		
		
		
		
	}
	
	
	
	
	// methods
	
	
	public boolean equals(Object o) {
		
		if(o instanceof Employee) {
			
			Employee e = (Employee) o;
			
			if(super.equals(e)) {
				if(this.deptName.equals(e.deptName) && this.employeeID == e.employeeID) {
					return true;
				}
			}
					
		}
		return false;
		
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + String.format(" Employee: Department: %20s | Employee Number: %3d", getDeptName(), getEmployeeID());
	}

	public int compareTo(Employee p) {
		Employee e = (Employee)p;
		if(this.employeeID > e.employeeID) {
			return 1;
		}
		else if (this.employeeID < e.employeeID) {
			return -1;
		}
		return 0;
		
	}
	

}
