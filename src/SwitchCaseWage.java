import java.util.Random;
import java.util.Scanner;

public class SwitchCaseWage {
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;

    public static void calculateWage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Employee Type:");
        System.out.println("1. Full-Time");
        System.out.println("2. Part-Time");
        System.out.print("Enter your choice: ");
        int empType = scanner.nextInt();

        switch (empType) {
            case 1:
                int fullTimeWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
                System.out.println("Employee is FULL-TIME.");
                System.out.println("Daily Wage:" + fullTimeWage);
                break;
            case 2:
                int partTimeWage = WAGE_PER_HOUR * PART_TIME_HOURS;
                System.out.println("Employee is PART-TIME.");
                System.out.println("Daily Wage:" + partTimeWage);
                break;
            default:
                System.out.println("Invalid Employee Type Selected.");
        }
    }
}