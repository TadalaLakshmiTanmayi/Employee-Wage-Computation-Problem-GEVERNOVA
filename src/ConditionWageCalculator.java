import java.util.Random;

public class ConditionWageCalculator {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;
    private static final int MAX_WORKING_HOURS = 100;
    private static final int MAX_WORKING_DAYS = 20;

    public static void calculateConditionWage() {
        Random random = new Random();
        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;
        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {
            totalDays++;
            int empCheck = random.nextInt(3); // 0 - Absent, 1 - Full-Time, 2 - Part-Time

            switch (empCheck) {
                case 1: // Full-Time employee
                    totalHours += FULL_DAY_HOURS;
                    totalWage += WAGE_PER_HOUR * FULL_DAY_HOURS;
                    break;
                case 2: // Part-Time employee
                    totalHours += PART_TIME_HOURS;
                    totalWage += WAGE_PER_HOUR * PART_TIME_HOURS;
                    break;
                default: // Absent employee, no wage
                    break;
            }
        }

        // Print only the total wage at the end
        System.out.println("Total Wage:" + totalWage);
    }
}
