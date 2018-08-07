package in.co.cg.service;

import java.util.List;

import in.co.cg.bean.Employee;
import in.co.cg.dao.EmployeeDAO;
import in.co.cg.dao.EmployeeDaoI;

public class EmployeeService {
	EmployeeDAO employeeDAO;// EmployeeDaoI reference
	public void setAddEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	/**
	 * @param employee
	 * pass Employee object to addEmployee
	 */
	public void addEmployee(Employee employee) {
		employeeDAO.addEmployee(employee);
	}

	/**
	 * @return all employee list
	 */
	public List<Employee> viewAllEmplpoyee() {
		return employeeDAO.viewAllEmplpoyee();
	}

	/**
	 * @param empid
	 * @return employee details by its ID
	 */
	public Employee employeeByID(int empid) {
		return employeeDAO.employeeByID(empid);
	}

	/**
	 * @param empid
	 * @return all employee details except the deleted one
	 */
	public List<Employee> deleteEmployeeByID(int empid) {
		return employeeDAO.deleteEmployeeByID(empid);
	}
}
