package srevice;

import java.util.List;

import dao.EmployeeDAO;
import dao.EmployeeDAOImp;
import model.Employee;

public class ServiceImp implements Service {
	
	private final EmployeeDAO employeeDAO = new EmployeeDAOImp();

	@Override
	public void addEmployee(Employee emp) {
		employeeDAO.addEmployee(emp);		
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeDAO.getEmployeeById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeDAO.updateEmployee(emp);
		
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDAO.deleteEmployee(id);
		
	}
	
}
