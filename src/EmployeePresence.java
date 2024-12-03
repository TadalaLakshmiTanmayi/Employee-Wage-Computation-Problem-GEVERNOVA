import java.util.Random;

public class EmployeePresence {

    public static void checkPresence() {
        Random random = new Random();
        int attendance = random.nextInt(2); // 0 - Absent, 1 - Present
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
