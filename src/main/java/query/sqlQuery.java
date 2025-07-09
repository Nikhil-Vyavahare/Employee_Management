package query;

public  class sqlQuery {
	public static final String INSERT = "INSERT INTO employees (id, name, department, salary, email, phone, address) VALUES (?,?,?,?,?,?,?);";
	public static final String SELECT = "SELECT * FROM employees WHERE id = ?";
	public static final String SELECTALL = "SELECT * FROM employees";
	public static final String UPDATE =  "UPDATE employees SET name = ?, department = ?, salary = ?, email = ?, phone = ?, address = ? WHERE id = ?";
	public static final String DELETE = "DELETE FROM employees WHERE id = ?";
	
}