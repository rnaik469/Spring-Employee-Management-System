package in.co.cg.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import in.co.cg.bean.Employee;

/**
 * @author rohinaik
 *
 */
public class EmployeeDAO implements EmployeeDaoI {

	/**
	 * Stores Employee object in the list
	 */
	List<Employee> list = new LinkedList<>();
	Employee employee = null;

	@Override
	public void addEmployee(Employee employee) {
		list.add(employee);
	}

	/** 
	 * returns Employee list
	 */
	@Override
	public List<Employee> viewAllEmplpoyee() {
		return list;
	}
	
	
	/**
	 * search and returns Employee by its ID 
	 */
	@Override
	public Employee employeeByID(int id) {

		for (Employee employe : list) {
			if (employe.getEmpID() == id)
				employee = employe;
		}
		return employee;
	}
	
	/**
	 * search and delete Employee by its ID  and return remaining Employee List 
	 */
	@Override
	public List<Employee> deleteEmployeeByID(int id) {

		for (Employee employe : list) {
			if (employe.getEmpID() == id)
				list.remove(employe);
		}
		return list;
	}

}
