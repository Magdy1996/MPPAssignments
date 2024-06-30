public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private int hoursPerWeek;

    public HourlyEmployee(String empId, double hourlyWage, int hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    protected double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4; // Assuming 4 weeks per month
    }
}

