package in.co.cg.bean;

/**
 * @author rohit naik
 *
 */
public class Employee {
	
	private String empName;
	private final int empID;
	private static int empid;

	// Generating Employee ID
	static {
		empid = 15500;
	}

	{
		this.empID = ++empid;
	}

	// getters and Setters
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + "]";
	}

	public int getEmpID() {
		return empID;
	}

}
