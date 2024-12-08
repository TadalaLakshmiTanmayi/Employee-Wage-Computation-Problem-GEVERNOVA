import java.util.Random;

public class EmployeeWage {
    private static final int isFullTime = 1;
    private static final int isPartTime = 2;

    // Method to calculate Employee Wage for multiple companies
    public static void calculateEmployeeWageForCompany(String companyName, int wagePerHr, int workingDaysPerMonth, int totalWorkingHrs) {
        int empHrs = 0, empWagePerMonth = 0, totalWorkingDays = 0, totalEmployeeHrs = 0;
        Random random = new Random();

        // Calculate wage for the given company
        System.out.println("\nCalculating Employee Wage for " + companyName + "...");

        while (totalEmployeeHrs < totalWorkingHrs && totalWorkingDays < workingDaysPerMonth) {
            totalWorkingDays++;

            // Generate a random employee type (0: Absent, 1: Full-Time, 2: Part-Time)
            int employeeType = random.nextInt(3);  // 0, 1, or 2

            switch (employeeType) {
                case isFullTime:  // Full-time employee
                    System.out.println(companyName + " - Employee is doing FULL-TIME");
                    empHrs = 8;  // Full-time working hours
                    break;
                case isPartTime:  // Part-time employee
                    System.out.println(companyName + " - Employee is doing PART-TIME");
                    empHrs = 4;  // Part-time working hours
                    break;
                default:  // Absent employee
                    System.out.println(companyName + " - Employee is ABSENT");
                    empHrs = 0;  // No working hours
                    break;
            }

            // Calculate daily wage
            int empWagePerDay = empHrs * wagePerHr;
            empWagePerMonth += empWagePerDay;
            totalEmployeeHrs += empHrs;

            // Display employee's daily wage and work details
            System.out.println(companyName + " - Employee's Wage per Day is: " + empWagePerDay);
            System.out.println(companyName + " - Employee's Current Total Working Days: " + totalWorkingDays);
            System.out.println(companyName + " - Employee's Current Total Working Hours: " + totalEmployeeHrs);
            System.out.println(companyName + " - Employee's Current Total Wage: " + empWagePerMonth);
        }

        // Display the final monthly wage for the company
        System.out.println(companyName + " - Employee's wage per Month is: " + empWagePerMonth);
    }

    // Method to calculate Employee Wage using default values (without company-specific input)
    public static void EmployeeWageCalculator() {
        // Default values (could be replaced with user input if needed)
        String companyName = "Default Company";
        int wagePerHr = 20;
        int workingDaysPerMonth = 20;
        int totalWorkingHrs = 100;

        // Call calculateEmployeeWageForCompany with default values
        calculateEmployeeWageForCompany(companyName, wagePerHr, workingDaysPerMonth, totalWorkingHrs);
    }
}
