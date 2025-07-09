package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDAO {
	
	void addEmployee(Employee emp);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee emp);
    void deleteEmployee(int id);
    
}
