import java.util.Scanner;

public class ConsoleUtils {

    public static String selectLevel() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    +=======================+
                    |Select level:          |
                    |Easy Normal Hard Custom|
                    +=======================+""");
            String level = sc.nextLine();
            if ((level
                    .equalsIgnoreCase("Easy")) ||
                    (level.equalsIgnoreCase("Normal")) ||
                    (level.equalsIgnoreCase("Hard")) ||
                    (level.equalsIgnoreCase("Custom"))) {
                return level;
            } else System.out.println("=========Incorrect input!=========");
        }
    }

    public static int getNumberInRange(String message, int from, int to) {
        while (true) {
            System.out.println(message);
            Scanner sc = new Scanner(System.in);
            int inputNumber = sc.nextInt();
            if (inputNumber >= from && inputNumber <= to)
                return inputNumber;
            else System.out.println("===Incorrect input! Please check enter values!===");
        }

    }
}
