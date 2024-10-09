import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayrollSystem payrollSystem = new PayrollSystem();

        System.out.println("Enter the number of employees to add: ");
        int numberOfEmployees = scanner.nextInt();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Enter name: ");
            String name = scanner.next();

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();

            System.out.print("Enter employee type (1 for Full-Time, 2 for Part-Time): ");
            int type = scanner.nextInt();

            if (type == 1) {
                System.out.print("Enter annual salary: ");
                double salary = scanner.nextDouble();
                FullTimeEmployee emp = new FullTimeEmployee(name, id, salary);
                payrollSystem.addEmployee(emp);
            } else if (type == 2) {
                System.out.print("Enter hourly rate: ");
                double hourlyRate = scanner.nextDouble();

                System.out.print("Enter hours worked: ");
                int hoursWorked = scanner.nextInt();

                PartTimeEmployee emp = new PartTimeEmployee(name, id, hourlyRate, hoursWorked);
                payrollSystem.addEmployee(emp);
            } else {
                System.out.println("Invalid type entered. Skipping employee.");
            }
        }

        // Display the starting list of employees
        System.out.println("\nStarting Employee List:");
        payrollSystem.displayEmployees();

        // Optionally remove an employee
        System.out.print("\nEnter the ID of the employee to remove (or -1 to skip): ");
        int removeId = scanner.nextInt();
        if (removeId != -1) {
            payrollSystem.removeEmployee(removeId);
        }

        // Display the final list of employees
        System.out.println("\nFinal Employee List:");
        payrollSystem.displayEmployees();

        scanner.close();
    }
}
