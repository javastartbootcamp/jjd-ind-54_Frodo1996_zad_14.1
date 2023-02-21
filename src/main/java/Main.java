import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils();
        try {
            ArrayList<Integer> numbersFromFile = fileUtils.saveNumbersFromFile();
            System.out.println("Lista numerów znajdujących się w pliku: " + numbersFromFile);
            fileUtils.printNumbersOccurrence();
        } catch (FileNotFoundException e) {
            System.err.println("Nie udało się wczytać pliku.");
        }
    }
}