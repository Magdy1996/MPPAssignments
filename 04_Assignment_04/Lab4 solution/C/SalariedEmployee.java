public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    protected double calcGrossPay(int month, int year) {
        return salary;
    }
}
