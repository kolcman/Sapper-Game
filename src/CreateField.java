import java.util.Scanner;

public class CreateField {
    public static int[][] createFieldByLevel(String level) {
        Scanner sc = new Scanner(System.in);
        if(level.equalsIgnoreCase("Easy"))
                return new int[9][9];
        if(level.equalsIgnoreCase("Normal"))
                return new int[15][15];
        if(level.equalsIgnoreCase("Hard"))
                return new int[25][25];

        int weight = ConsoleUtils.getNumberInRange(
                "Please, input weight range from 1 to 100: ", 1, 100
        );
        int height = ConsoleUtils.getNumberInRange(
                "Please, input height range from 1 to 100: ", 1, 100
        );
        return new int[height][weight];
    }

}
