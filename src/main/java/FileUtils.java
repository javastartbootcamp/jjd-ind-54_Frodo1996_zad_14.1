import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileUtils {

    public List<Integer> saveNumbersFromFile() throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("liczby.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int number = Integer.parseInt(line);
                numbers.add(number);
            }
        }
        return numbers;
    }

    public void printNumbersOccurrence(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new TreeSet<>(numbers);
        for (Integer uniqueNumber : uniqueNumbers) {
            findNumbersOccurrence(uniqueNumber, numbers);
        }
    }

    private void findNumbersOccurrence(Integer uniqueNumber, List<Integer> numbers) {
        int counter = 0;
        for (Integer number : numbers) {
            if (uniqueNumber.compareTo(number) == 0) {
                counter++;
            }
        }
        System.out.println(uniqueNumber + " - liczba wystąpień " + counter);
    }

//    public void testPrintNumbersOccurrence() {
//        Set<Integer> uniqueNumbers = new TreeSet<>(numbers);
//        for (Integer uniqueNumber : uniqueNumbers) {
//            int counter = 1;
//            if (numbers.contains(uniqueNumber)) {
//                counter++;
//            }
//            System.out.println(uniqueNumber + " - liczba wystąpień " + counter);
//        }
//    }
}