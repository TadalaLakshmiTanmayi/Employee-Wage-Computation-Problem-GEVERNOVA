import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        Scanner scanner = new Scanner(System.in);
        int choice;
        int i = 1;
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();  // Create an EmpWageBuilder instance

        do {
            // Display menu options
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Employee Presence");
            System.out.println("2. Calculate Daily Wage");
            System.out.println("3. Calculate Part-Time Wage");
            System.out.println("4. Calculate Wage using Switch Case");
            System.out.println("5. Calculate Monthly Wage");
            System.out.println("6. Calculate Wages with Conditions");
            System.out.println("7. Calculate Employee Wage");
            System.out.println("8. Compute Employee Wage for Multiple Companies");
            System.out.println("9. Query Total Wage by Company");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    EmployeePresence.checkPresence();
                    break;
                case 2:
                    DailyWageCalculator.calculateDailyWage();
                    break;
                case 3:
                    PartTimeWageCalculator.calculatePartTimeWage();
                    break;
                case 4:
                    SwitchCaseWage.calculateWage();
                    break;
                case 5:
                    MonthlyWageCalculator.calculateMonthlyWage();
                    break;
                case 6:
                    ConditionWageCalculator.calculateConditionWage();
                    break;
                case 7:
                    EmployeeWage.EmployeeWageCalculator();
                    break;
                case 8:
                    computeEmployeeWageForMultipleCompanies(scanner, empWageBuilder);
                    break;
                case 9:
                    // UC14: Query Total Wage by Company
                    queryTotalWageByCompany(scanner, empWageBuilder);
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }
            System.out.println("Enter 0 to exit");
            i = scanner.nextInt();
        } while (i != 0);
        System.out.println("Thank You");
        scanner.close();
    }

    public static void computeEmployeeWageForMultipleCompanies(Scanner scanner, EmpWageBuilder empWageBuilder) {
        System.out.println("Enter the number of companies:");
        int numberOfCompanies = scanner.nextInt();

        // Take company details as input
        for (int i = 0; i < numberOfCompanies; i++) {
            System.out.println("Enter details for Company " + (i + 1) + ":");
            System.out.print("Enter Company Name: ");
            scanner.nextLine();  // Consume the leftover newline
            String companyName = scanner.nextLine();

            System.out.print("Enter Wage Per Hour: ");
            int wagePerHr = scanner.nextInt();

            System.out.print("Enter Number of Working Days: ");
            int workingDaysPerMonth = scanner.nextInt();

            System.out.print("Enter Maximum Working Hours per Month: ");
            int totalWorkingHrs = scanner.nextInt();

            // Add the company to EmpWageBuilder
            empWageBuilder.addCompanyEmpWage(companyName, wagePerHr, workingDaysPerMonth, totalWorkingHrs);
        }

        // Calculate and display wages for all companies
        empWageBuilder.calculateWagesForAllCompanies();
    }

    public static void queryTotalWageByCompany(Scanner scanner, EmpWageBuilder empWageBuilder) {
        System.out.print("Enter the company name to query total wage: ");
        scanner.nextLine();  // Consume the leftover newline
        String companyName = scanner.nextLine();

        int totalWage = empWageBuilder.getTotalWageByCompany(companyName);
        if (totalWage != -1) {
            System.out.println("Total wage for " + companyName + ": " + totalWage);
        } else {
            System.out.println("Company " + companyName + " not found.");
        }
    }
}
