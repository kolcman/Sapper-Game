import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CreateField {
    public static int[][] createFieldByLevel(String level) {

        Scanner sc = new Scanner(System.in);
        if (level.equalsIgnoreCase("Easy"))
            return new int[9][9];
        if (level.equalsIgnoreCase("Normal"))
            return new int[15][15];
        if (level.equalsIgnoreCase("Hard"))
            return new int[25][25];

        int weight = ConsoleUtils.getNumberInRange(
                "Please, input weight range from 1 to 100: ", 1, 100
        );
        int height = ConsoleUtils.getNumberInRange(
                "Please, input height range from 1 to 100: ", 1, 100
        );
        return new int[height][weight];
    }

    public static int countOfMinesByLevel(String level, int[][] field) {
        if (level.equalsIgnoreCase("Easy"))
            return 10;
        if (level.equalsIgnoreCase("Normal"))
            return 40;
        if (level.equalsIgnoreCase("Hard"))
            return 99;

        int countOfMines = ConsoleUtils.getNumberInRange(
                "Please, input count of mines: ", 1, field.length * field[0].length / 4
        );
        {
            return countOfMines;
        }
    }

    public static void randomFillField(int[][] field, int countOfMines){
        for (int i = 0; i < countOfMines; i++){
            int row = ThreadLocalRandom.current().nextInt(0, field.length);
            int column = ThreadLocalRandom.current().nextInt(0, field[0].length);
            field[row][column] = -1;
        }
    }

}
