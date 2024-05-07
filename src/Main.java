
public class Main {
    public static void main(String[] args) {
        String level = ConsoleUtils.selectLevel();
        int[][] field = CreateField.createFieldByLevel(level);

    }
}