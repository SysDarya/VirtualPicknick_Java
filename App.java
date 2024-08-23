import java.io.File;
import java.util.Map;

/**
 * Главный класс программы.
 */
public class App {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");

        WordCounter wordCounter = new WordCounter(inputFile);
        int wordCount = wordCounter.countWords();
        System.out.println("Количество слов в файле: " + wordCount);

        TheLongestWordFinder theLongestWordFinder = new TheLongestWordFinder(inputFile);
        String longestWord = theLongestWordFinder.findTheLongestWord();
        System.out.println("Самое длинное слово в файле: " + longestWord);

        WordFrequencyCounter wordFrequencyCalculator = new WordFrequencyCounter(inputFile);
        Map<String, Integer> wordFrequency = wordFrequencyCalculator.frequencyCounter();
        System.out.println("Частота слов в файле: " + wordFrequency);
    }
}
