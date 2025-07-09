package model;

public class Employee {
	
    private  int id;
    private  String name;
    private  String department;
    private  double salary;
    private  String email;
    private  String phone;
    private  String address;

    private Employee(EmployeeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.department = builder.department;
        this.salary = builder.salary;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }


    public static class EmployeeBuilder {
    	
        private  int id;
        private  String name;
        private  String department;
        private double salary;
        private String email;
        private String phone;
        private String address;
        
        
        
        public EmployeeBuilder setId(int id) {
			this.id = id;
			return this;
		}



		public EmployeeBuilder setName(String name) {
			this.name = name;
			return this;
		}



		public EmployeeBuilder setDepartment(String department) {
			this.department = department;
			return this;
		}



		public EmployeeBuilder setSalary(double salary) {
			this.salary = salary;
			return this;
		}



		public EmployeeBuilder setEmail(String email) {
			this.email = email;
			return this;
		}



		public EmployeeBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}



		public EmployeeBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Employee getEmployee() {
		    return new Employee(this);
		}
        
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}