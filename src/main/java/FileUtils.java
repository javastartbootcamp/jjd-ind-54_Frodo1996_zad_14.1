import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileUtils {

    ArrayList<Integer> numbers = new ArrayList<>();

    public ArrayList<Integer> saveNumbersFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("liczby.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int number = Integer.parseInt(line);
            numbers.add(number);
        }
        return numbers;
    }

    public void printNumbersOccurrence() {
        TreeSet<Integer> uniqueNumbers = new TreeSet<>(numbers);
        for (Integer uniqueNumber : uniqueNumbers) {
            findNumbersOccurrence(uniqueNumber);
        }
    }

    private void findNumbersOccurrence(Integer uniqueNumber) {
        int counter = 0;
        for (Integer number : numbers) {
            if (uniqueNumber.compareTo(number) == 0) {
                counter++;
            }
        }
        System.out.println(uniqueNumber + " - liczba wystąpień " + counter);
    }

}