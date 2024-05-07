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
}
