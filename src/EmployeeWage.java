import java.util.Random;

public class EmployeeWage {

    // Method to calculate Employee Wage for multiple companies
    public static void calculateEmployeeWageForCompany(String companyName, int wagePerHr, int workingDaysPerMonth, int totalWorkingHrs) {
        // Create an EmpWageBuilder instance for the company
        EmpWageBuilder wageBuilder = new EmpWageBuilder(companyName, wagePerHr, workingDaysPerMonth, totalWorkingHrs);

        // Call the method to calculate the wage
        wageBuilder.calculateEmployeeWage();

        // You can print the total wage here as well
        System.out.println(companyName + " - Final Total Wage: " + wageBuilder.getTotalWage());
    }

    public static void EmployeeWageCalculator() {
        // Default values
        String companyName = "Default Company";
        int wagePerHr = 20;
        int workingDaysPerMonth = 20;
        int totalWorkingHrs = 100;

        // Call the method to calculate the wage
        calculateEmployeeWageForCompany(companyName, wagePerHr, workingDaysPerMonth, totalWorkingHrs);
    }
}
