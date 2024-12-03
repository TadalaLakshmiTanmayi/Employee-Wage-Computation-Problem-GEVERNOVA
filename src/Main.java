import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        Scanner scanner = new Scanner(System.in);
        int choice;
        int i =1;
        do {
            // Display menu options
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Employee Presence");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    EmployeePresence.checkPresence();
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }
            System.out.println("Enter 0 to exit");
            i = scanner.nextInt();
        } while (i!=0);
        System.out.println("Thank You");
        scanner.close();
    }
}