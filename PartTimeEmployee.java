public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    // Constructor should match the parameters used in the main method
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee [ID=" + getID() + ", Name=" + getName() +
                ", Hourly Rate=" + hourlyRate + ", Hours Worked=" + hoursWorked +
                ", Salary=" + calculateSalary() + "]";
    }
}
