import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    private File file;

    public WordFrequencyCounter(File file) {
        this.file = file;
    }

    public Map <String, Integer> frequencyCounter() {
        Map <String, Integer> frequencyList = new HashMap<>();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                String word = scan.next();
                frequencyList.put(word, frequencyList.getOrDefault(word, 0) + 1);
            }
        } catch (FileNotFoundException e){
            System.out.println("Ошибка: Файл не найден.");
        }

        return frequencyList;
    }
}
