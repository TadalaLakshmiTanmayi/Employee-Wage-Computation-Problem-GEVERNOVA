import java.util.Random;

public class EmpWageBuilder {
    private String companyName;
    private int wagePerHr;
    private int workingDaysPerMonth;
    private int totalWorkingHrs;
    private int totalWage;

    // Constructor to initialize the company's details
    public EmpWageBuilder(String companyName, int wagePerHr, int workingDaysPerMonth, int totalWorkingHrs) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.totalWorkingHrs = totalWorkingHrs;
        this.totalWage = 0;
    }

    // Method to calculate wage for the company
    public void calculateEmployeeWage() {
        int empHrs = 0;
        int empWagePerDay;
        int totalEmployeeHrs = 0;
        int totalWorkingDays = 0;
        Random random = new Random();

        System.out.println("\nCalculating Employee Wage for " + companyName + "...");

        while (totalEmployeeHrs < totalWorkingHrs && totalWorkingDays < workingDaysPerMonth) {
            totalWorkingDays++;

            // Generate a random employee type (0: Absent, 1: Full-Time, 2: Part-Time)
            int employeeType = random.nextInt(3);  // 0, 1, or 2

            switch (employeeType) {
                case 1:  // Full-time employee
                    empHrs = 8;
                    break;
                case 2:  // Part-time employee
                    empHrs = 4;
                    break;
                default:  // Absent employee
                    empHrs = 0;
                    break;
            }

            empWagePerDay = empHrs * wagePerHr;
            totalEmployeeHrs += empHrs;
            totalWage += empWagePerDay;

            // Display details for the day
            System.out.println(companyName + " - Employee's Wage per Day: " + empWagePerDay);
            System.out.println(companyName + " - Total Working Days: " + totalWorkingDays);
            System.out.println(companyName + " - Total Working Hours: " + totalEmployeeHrs);
            System.out.println(companyName + " - Total Wage So Far: " + totalWage);
        }

        // Final monthly wage
        System.out.println(companyName + " - Final Monthly Wage: " + totalWage);
    }

    // Getter method for total wage
    public int getTotalWage() {
        return totalWage;
    }

    // Getter method for company name
    public String getCompanyName() {
        return companyName;
    }
}
