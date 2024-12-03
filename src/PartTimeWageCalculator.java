public class PartTimeWageCalculator {
    private static final int WAGE_PER_HOUR = 20;
    private static final int PART_TIME_HOURS = 4;

    public static void calculatePartTimeWage() {
        int partTimeWage = PART_TIME_HOURS * WAGE_PER_HOUR;
        System.out.println("Daily wage for part-time employee: " + partTimeWage);
    }
}
