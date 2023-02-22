import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        try {
            List<Integer> list = fileUtils.saveNumbersFromFile();
            fileUtils.printNumbersOccurrence(list);
        } catch (FileNotFoundException e) {
            System.err.println("Nie udało się wczytać pliku.");
        }
    }
}