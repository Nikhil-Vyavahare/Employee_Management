package Menu;

import java.util.List;
import java.util.Scanner;


import model.Employee;
import srevice.Service;
import srevice.ServiceImp;

public class menu {
	private static Service service = new ServiceImp();
    private static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		int choice;
		while (true) {
			System.out.println("\n========= Employee Management Menu =========");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
			case 1:
				System.out.print("Enter ID: ");
				int id =sc.nextInt();
				System.out.print("Enter Name: ");
			    String name = sc.next();
			    System.out.print("Enter Department: ");
			    String department = sc.next();
			    System.out.print("Enter Salary: ");
			    double salary = sc.nextDouble();
			    System.out.print("Enter Email: ");
			    String email = sc.next();
			    System.out.print("Enter Phone: ");
			    String phone = sc.next();
			    System.out.print("Enter Address: ");
			    String address = sc.next();
			    Employee employee = new Employee.EmployeeBuilder()
			    		.setId(id).
			    		setEmail(email)
			    		.setAddress(address)
			    		.setDepartment(department)
			    		.setSalary(salary).
			    		setName(name)
			    		.setPhone(phone)
			    		.getEmployee();
			    service.addEmployee(employee);
			    break;
			case 2:
				List<Employee> employees = service.getAllEmployees();
				if(employees.isEmpty()) {
					System.out.println("\n");
					System.out.print("No result found..........");
					System.out.println("\n");
				}
				else {
					for (Employee emp: employees) {
						System.out.println(emp);
					}
				}
				break;
			case 3:
				System.out.print("Enter Employee ID to search: ");
				 id = sc.nextInt();
				 Employee found = service.getEmployeeById(id);
				 if(found != null) {
					 System.out.print(found);
				 }else {
					 System.out.print("Employee not found with id:"+id);
				}
				 break;
			case 4:
				System.out.print("Enter Employee ID to update: ");
				id =sc.nextInt();
				System.out.print("Enter Name: ");
			    name = sc.next();
			    System.out.print("Enter Department: ");
			    department = sc.next();
			    System.out.print("Enter Salary: ");
			    salary = sc.nextDouble();
			    System.out.print("Enter Email: ");
			    email = sc.next();
			    System.out.print("Enter Phone: ");
			    phone = sc.next();
			    System.out.print("Enter Address: ");
			    address = sc.next();
			    employee = new Employee.EmployeeBuilder()
			    		.setId(id).
			    		setEmail(email)
			    		.setAddress(address)
			    		.setDepartment(department)
			    		.setSalary(salary).
			    		setName(name)
			    		.setPhone(phone)
			    		.getEmployee();
			    service.updateEmployee(employee);
			    System.out.println("Update successfuly.....");
			    System.out.println(employee);
			    break;
			case 5:
				System.out.print("Enter ID of employee to delete: ");
				 id = sc.nextInt();
				 found = service.getEmployeeById(id);
				 if(found != null) {
					service.deleteEmployee(id);
					System.out.println("Employee deleted successfully.");
				 }else {
					 System.out.print("Employee not found with id:"+id);
				}
				 break;
			case 6:
				System.out.println("Exiting... Goodbye!");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
			
		}
	}
}
