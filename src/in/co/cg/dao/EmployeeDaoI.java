package in.co.cg.dao;

import java.util.List;

import in.co.cg.bean.Employee;

public interface EmployeeDaoI {

	/* (non-Javadoc)
	 * @see in.co.cg.dao.EmployeeDaoI#addEmployee(in.co.cg.bean.Employee)
	 */
	void addEmployee(Employee employee);

	/* (non-Javadoc)
	 * @see in.co.cg.dao.EmployeeDaoI#viewAllEmplpoyee()
	 */
	List<Employee> viewAllEmplpoyee();

	/* (non-Javadoc)
	 * @see in.co.cg.dao.EmployeeDaoI#employeeByID(java.lang.String)
	 */
	Employee employeeByID(int id);

	/* (non-Javadoc)
	 * @see in.co.cg.dao.EmployeeDaoI#deleteEmployeeByID(java.lang.String)
	 */
	List<Employee> deleteEmployeeByID(int id);

}