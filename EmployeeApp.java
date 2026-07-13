import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main application for managing employees.
 * Provides a menu-driven console interface for CRUD operations on Employee records.
 */
public class EmployeeApp {
    // List to store employee records dynamically
    static ArrayList<Employee> employees = new ArrayList<>();
    // Scanner for reading user input
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Department");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = -1;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                sc.nextLine(); // clear the invalid token from scanner buffer
                continue;
            }

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> viewEmployees();
                case 3 -> searchEmployee();
                case 4 -> updateDepartment();
                case 5 -> {
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please choose a valid option (1-5).");
            }
        }
    }

    /**
     * Adds a new employee to the list.
     */
    static void addEmployee() {
        int id = -1;
        while (true) {
            System.out.print("ID: ");
            try {
                id = sc.nextInt();
                sc.nextLine(); // consume the newline character
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid ID format. Employee ID must be an integer.");
                sc.nextLine(); // clear input buffer
            }
        }

        // Check if employee with the same ID already exists
        for (Employee e : employees) {
            if (e.id == id) {
                System.out.println("Error: Employee with ID " + id + " already exists!");
                return;
            }
        }

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();

        employees.add(new Employee(id, name, dept));
        System.out.println("Employee added successfully.");
    }

    /**
     * Prints all employee records in the list.
     */
    static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found in the system.");
            return;
        }
        System.out.println("\n--- Employee Records ---");
        System.out.println("ID | Name | Department");
        System.out.println("----------------------");
        for (Employee e : employees) {
            System.out.println(e.id + " | " + e.name + " | " + e.department);
        }
    }

    /**
     * Searches for an employee by their unique ID.
     */
    static void searchEmployee() {
        System.out.print("Enter ID: ");
        int id;
        try {
            id = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid ID format. Employee ID must be an integer.");
            sc.nextLine(); // clear input buffer
            return;
        }

        for (Employee e : employees) {
            if (e.id == id) {
                System.out.println("Found: " + e.name + " (" + e.department + ")");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    /**
     * Updates the department of an existing employee.
     */
    static void updateDepartment() {
        System.out.print("Employee ID: ");
        int id;
        try {
            id = sc.nextInt();
            sc.nextLine(); // consume newline
        } catch (InputMismatchException e) {
            System.out.println("Invalid ID format. Employee ID must be an integer.");
            sc.nextLine(); // clear input buffer
            return;
        }

        for (Employee e : employees) {
            if (e.id == id) {
                System.out.print("New Department: ");
                e.department = sc.nextLine();
                System.out.println("Department updated.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
