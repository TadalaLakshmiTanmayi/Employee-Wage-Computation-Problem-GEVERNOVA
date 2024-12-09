import java.util.ArrayList;
import java.util.Random;

public class CompanyEmpWage {
    private String companyName;
    private int wagePerHr;
    private int workingDaysPerMonth;
    private int totalWorkingHrs;
    private int totalWage;
    private ArrayList<Integer> dailyWages;  // To store daily wages for each working day

    // Constructor to initialize the company's details
    public CompanyEmpWage(String companyName, int wagePerHr, int workingDaysPerMonth, int totalWorkingHrs) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.totalWorkingHrs = totalWorkingHrs;
        this.totalWage = 0;
        this.dailyWages = new ArrayList<>();  // Initialize the daily wages list
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

            // Store daily wage
            dailyWages.add(empWagePerDay);

            // Display daily wage
            System.out.println(companyName + " - Day " + totalWorkingDays + ": Wage = " + empWagePerDay + ", Total Hours = " + totalEmployeeHrs + ", Total Wage = " + totalWage);
        }

        // Display all daily wages and final monthly wage
        System.out.println("\nDaily Wages for " + companyName + ": " + dailyWages);
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

    // Getter method for daily wages
    public ArrayList<Integer> getDailyWages() {
        return dailyWages;
    }
}
