 Employee Management System

A simple, robust, console-based Employee Management System built in Core Java.

This application demonstrates fundamental Core Java and Object-Oriented Programming (OOP) concepts such as class creation, constructor usage, ArrayList collections, Scanner for input parsing, loop constructs, conditionals, and modular method-based structure.

 Features
- **Add Employee**: Add new employees with unique IDs, names, and departments.
- **View Employees**: Display a list of all current employees.
- **Search Employee**: Search for an employee by their ID.
- **Update Department**: Update the department of an existing employee by their ID.
- **Exit**: Safely terminate the application.

Prerequisites
- Java SE Development Kit (JDK) 8 or higher (Java 22/23 recommended).

Compilation and Running Instructions

1. **Open Terminal / PowerShell** and navigate to the project directory:
   ```bash
   cd C:\Users\sonag\EmployeeManagementSystem
   ```

2. **Compile the Java files**:
   ```bash
   javac Employee.java EmployeeApp.java
   ```

3. **Run the application**:
   ```bash
   java EmployeeApp
   ```

Sample Input/Output Flow

Main Menu
Upon starting, the application presents the following menu options:
```text
1. Add Employee
2. View Employees
3. Search Employee
4. Update Department
5. Exit
Enter choice:
```

1. View All Employees (Option 2)
The application comes pre-populated with a few sample records for convenience:
```text
Enter choice: 2
101 | Alice Johnson | Engineering
102 | Bob Smith | HR
103 | Charlie Davis | Marketing
```

2. Add a New Employee (Option 1)
```text
Enter choice: 1
ID: 104
Name: Diana Prince
Department: Quality Assurance
Employee added successfully.
```

3. Search Employee by ID (Option 3)
```text
Enter choice: 3
Enter ID: 101
Found: Alice Johnson (Engineering)
```

4. Update Employee Department (Option 4)
```text
Enter choice: 4
Employee ID: 102
New Department: Finance
Department updated.
```
