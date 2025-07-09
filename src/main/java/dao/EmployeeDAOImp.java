package dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import Database.DBConnection;
import model.Employee;
import query.sqlQuery;
import java.sql.*;
public class EmployeeDAOImp implements EmployeeDAO {

	@Override
	public void addEmployee(Employee emp) {
		String query = sqlQuery.INSERT;
		try(Connection conn = DBConnection.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, emp.getId());
			statement.setString(2,emp.getName());
			statement.setString(3,emp.getDepartment());
			statement.setDouble(4,emp.getSalary());
			statement.setString(5,emp.getEmail());
			statement.setString(6,emp.getPhone());
			statement.setString(7, emp.getAddress());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		String query = sqlQuery.SELECT;
		try(Connection conn = DBConnection.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, id);
			
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				return new Employee.EmployeeBuilder().setId(resultSet.getInt("id")).setName(resultSet.getString("name")).setDepartment(resultSet.getString("department")).
						setSalary(resultSet.getDouble("salary")).setAddress(resultSet.getString("address")).setEmail(resultSet.getString("email")).
						setPhone(resultSet.getString("phone")).getEmployee();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		String query = sqlQuery.SELECTALL;
		List<Employee> list = new ArrayList<>();
		try (Connection conn = DBConnection.getConnection()){
			PreparedStatement statement = conn.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				list.add(new Employee.EmployeeBuilder().setId(resultSet.getInt("id")).setName(resultSet.getString("name")).setDepartment(resultSet.getString("department")).
					setSalary(resultSet.getDouble("salary")).setAddress(resultSet.getString("address")).setEmail(resultSet.getString("email")).
					setPhone(resultSet.getString("phone")).getEmployee());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void updateEmployee(Employee emp) {
		String query = sqlQuery.UPDATE;
		try(Connection conn = DBConnection.getConnection()) {
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1,emp.getName());
			statement.setString(2,emp.getDepartment());
			statement.setDouble(3,emp.getSalary());
			statement.setString(4,emp.getEmail());
			statement.setString(5,emp.getPhone());
			statement.setString(6, emp.getAddress());
			statement.setInt(7,emp.getId());
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEmployee(int id) {
		String query = sqlQuery.DELETE;
		try (Connection conn = DBConnection.getConnection()){
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setInt(1, id);
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
