import java.util.Random;

public class MonthlyWageCalculator {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOURS = 8;
    private static final int WORKING_DAYS_PER_MONTH = 20;

    public static void calculateMonthlyWage() {
        Random random = new Random();
        int totalWage = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            boolean isPresent = random.nextBoolean();
            if (isPresent) {
                totalWage += WAGE_PER_HOUR * FULL_DAY_HOURS;
            }
        }

        System.out.println("Total Monthly Wage for " + WORKING_DAYS_PER_MONTH + " days:" + totalWage);
    }
}