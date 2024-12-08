import java.util.Random;

public class EmployeeWage {

    // Constants
    private static final int isFullTime = 1;
    private static final int isPartTime = 2;
    private static final int wagePerHr = 20;
    private static final int workingDaysPerMonth = 20;  // Max working days in a month
    private static final int totalWorkingHrs = 100;  // Max working hours in a month

    // Method to calculate Employee Wage
    public static void EmployeeWageCalculator() {
        int empHrs = 0, empWagePerMonth = 0, totalWorkingDays = 0, totalEmployeeHrs = 0;

        // UC-6 Total Hours and Days logic
        Random random = new Random();
        while (totalEmployeeHrs <= totalWorkingHrs && totalWorkingDays < workingDaysPerMonth) {
            totalWorkingDays++;

            // Generate a random employee type (0: Absent, 1: Full-Time, 2: Part-Time)
            int employeeType = random.nextInt(3);  // 0, 1, or 2

            switch (employeeType) {
                case isFullTime:  // Full-time employee
                    System.out.println("Employee is doing FULL-TIME");
                    empHrs = 8;  // Full-time working hours
                    break;
                case isPartTime:  // Part-time employee
                    System.out.println("Employee is doing PART-TIME");
                    empHrs = 4;  // Part-time working hours
                    break;
                default:  // Absent employee
                    System.out.println("Employee is ABSENT");
                    empHrs = 0;  // No working hours
                    break;
            }

            // Calculate daily wage
            int empWagePerDay = empHrs * wagePerHr;
            empWagePerMonth += empWagePerDay;
            totalEmployeeHrs += empHrs;

            // Display employee's daily wage and work details
            System.out.println("Employee's Wage per Day is: " + empWagePerDay);
            System.out.println("Employee's Current Total Working Days: " + totalWorkingDays);
            System.out.println("Employee's Current Total Working Hours: " + totalEmployeeHrs);
            System.out.println("Employee's Current Total Wage: " + empWagePerMonth);
        }

        // Display the final monthly wage
        System.out.println("Employee's wage per Month is: " + empWagePerMonth);
    }
}