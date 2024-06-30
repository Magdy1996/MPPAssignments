public class Main {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("E001", 20, 40);
        SalariedEmployee salariedEmployee = new SalariedEmployee("E002", 3000);
        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("E003", 1500, 0.10);

        commissionedEmployee.addOrder(new Order("O001", java.time.LocalDate.of(2024, 4, 15), 5000));
        commissionedEmployee.addOrder(new Order("O002", java.time.LocalDate.of(2024, 4, 20), 3000));

        Paycheck hourlyPaycheck = hourlyEmployee.calcCompensation(4, 2024);
        Paycheck salariedPaycheck = salariedEmployee.calcCompensation(4, 2024);
        Paycheck commissionedPaycheck = commissionedEmployee.calcCompensation(4, 2024);

        System.out.println("Hourly Employee Paycheck:");
        hourlyPaycheck.print();

        System.out.println("\nSalaried Employee Paycheck:");
        salariedPaycheck.print();

        System.out.println("\nCommissioned Employee Paycheck:");
        commissionedPaycheck.print();
    }
}
