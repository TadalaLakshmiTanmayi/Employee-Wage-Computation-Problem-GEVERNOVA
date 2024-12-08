public class EmployeeWage {
    // Method to calculate Employee Wage using default values (without company-specific input)
    public static void EmployeeWageCalculator() {
        // Default values
        String companyName = "Default Company";
        int wagePerHr = 20;
        int workingDaysPerMonth = 20;
        int totalWorkingHrs = 100;

        // Create an instance of CompanyEmpWage to use the wage calculation logic
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHr, workingDaysPerMonth, totalWorkingHrs);

        // Calculate the wage for the company
        companyEmpWage.calculateEmployeeWage();
    }
}
