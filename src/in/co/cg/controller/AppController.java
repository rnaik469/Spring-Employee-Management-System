package in.co.cg.controller;

import java.util.List;
import in.co.cg.bean.Employee;
import in.co.cg.service.EmployeeService;

/**
 * @author rohit naik
 *
 */
//App Controller Class
public class AppController {
	EmployeeService employeeService;//EmployeeService referenece
	
	
	/**
	 * @param employeeService
	 * setter for EmployeeService 
	 */
	public void setAddEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * @param employee
	 * pass reference of Employee class
 	 */
	public void addEmployee(Employee employee) {
		employeeService.addEmployee(employee);
	}

	/**
	 * @return All Employees List
	 */
	public List<Employee> setViewAllEmplpoyee() {
		return employeeService.viewAllEmplpoyee();
	}

	/**
	 * @param empid
	 * @return Employee details of Employee having id=empid 
	 */
	public Employee setEmployeeByID(int empid) {
		return employeeService.employeeByID(empid);
	}

	/**
	 * @param empid
	 * @return All Employees details except the Employee who is deleted i.e. having Employee id=empid 
	 */
	public List<Employee> setDeleteEmployeeByID(int empid) {
		return employeeService.deleteEmployeeByID(empid);
	}
}
