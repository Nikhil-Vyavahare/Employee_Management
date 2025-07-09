package srevice;

import java.util.List;

import model.Employee;

public interface Service {
	void addEmployee(Employee emp);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee emp);
    void deleteEmployee(int id);
}
