# 📊 Employee Management System

A **console-based application** built using **Core Java**, **Maven**, and **PostgreSQL** that allows you to manage employee records with full CRUD (Create, Read, Update, Delete) operations.

---

## 🛠️ Features

- Add new employees
- View all employees
- Search employee by ID
- Update employee details
- Delete employee
- PostgreSQL database integration
- Builder pattern for `Employee` object creation
- JDBC for database access
- Modular structure (DAO, Service, UI, Model)

---

## 💼 Technologies Used

- Java 17+ (Core Java)
- PostgreSQL (Database)
- JDBC (Database access)
- Maven (Build & Dependency Management)

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   ├── dao/                # Data Access Layer
│   │   ├── model/              # Employee Model with Builder Pattern
│   │   ├── query/              # SQL query constants
│   │   ├── srevice/            # Business Logic Layer (Service Layer)
│   │   ├── Database/           # DBConnection utility class
│   │   ├── Menu/               # Console UI
│   │   └── main/               # Main entry point
└── resources/
```

---

## 🧾 Database Setup (PostgreSQL)

Run the following SQL to create the `employees` table:

```sql
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100),
    salary NUMERIC(10, 2),
    email VARCHAR(100),
    phone VARCHAR(15),
    address TEXT
);
```

---

## ⚙️ Database Configuration

Database connection is hardcoded in:

```
src/main/java/Database/DBConnection.java
```

```java
private static final String URL = "jdbc:postgresql://localhost:5432/emp";
private static final String USER = "postgres";
private static final String PASSWORD = "1895";
```

✅ Update the `URL`, `USER`, and `PASSWORD` as per your PostgreSQL setup.

---

## 🚀 How to Run

1. **Clone or Download** the project
2. **Import as a Maven project** in your IDE (e.g., IntelliJ, Eclipse)
3. **Build the project** using Maven:
   ```
   mvn clean install
   ```
4. **Run** the application:
   - Run `main.App.java` or use:
     ```
     java -cp target/employee-management-system.jar main.App
     ```

---

## 📌 Example Usage

```
========= Employee Management Menu =========
1. Add Employee
2. View All Employees
3. Search Employee by ID
4. Update Employee
5. Delete Employee
6. Exit
Enter choice:
```

---

## 🧩 Future Improvements

- Add validations and exception handling
- Add file or DB-based logging
- GUI using Swing or JavaFX
- REST API version using Spring Boot

---
---

## Output


---

## 🧑‍💻 Authors

Developed by 
1) VYAVAHARE NIKHIL RAJU
2) BEDAGE SANKET SUNILKUMAR
3) RANGREZ SANIYA PARVEEN F AHMAD
4) JADHAV TRUPTI ASHOK
   
Project Type: Educational / Practice  
