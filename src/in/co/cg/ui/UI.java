package in.co.cg.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.co.cg.bean.Employee;
import in.co.cg.controller.AppController;

public class UI {
	Scanner get = new Scanner(System.in);
	ApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
	AppController appController = (AppController) context.getBean("appController");
	Employee employee;

	public void acceptDataAndOperations() {
		int cont = 0;
		do {employee = new Employee();
			System.out.println("Make choice\n1.Add New Employee\n2.Get All Employee Details\n3.Get Employee Details by ID\n4.Delete Employee By ID\n5.Exit");
			int choice = get.nextInt();
			switch (choice) {
			case 1:
				empAddDetails();
				break;
			case 2:
				empGetDetails();
				break;
			case 3:
				empGetDetailsById();
				break;
			case 4:
				empDeleteById();
				break;
			default:
				System.exit(1);
			}
			System.out.println("Press 1 to continue.....");
			cont = get.nextInt();
		} while (cont == 1);
	}

	public void empAddDetails() {
		System.out.println("Enter Employee Details");
		System.out.println("Employee Name:");
		String empName=get.next();
		employee.setEmpName(empName);
		appController.addEmployee(employee);
	}

	public void empGetDetails() {
		appController.setViewAllEmplpoyee().stream().forEach(System.out::println);
	}

	public void empGetDetailsById() {
		System.out.println("Enter Employee ID to get Details");
		int id = get.nextInt();
		System.out.println(appController.setEmployeeByID(id));
	}

	public void empDeleteById() {
		System.out.println("Enter Employee ID to delete");
		int id = get.nextInt();
		System.out.println("Employee Deleted\nRemaining Employees Details\n"+appController.setDeleteEmployeeByID(id));
	}

}
