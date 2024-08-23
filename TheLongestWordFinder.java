import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheLongestWordFinder {
    private File file;

    public TheLongestWordFinder(File file) {
        this.file = file;
    }

    public String findTheLongestWord() {
        String theLongestWord = "";
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                String word = scan.next();
                if (word.length() > theLongestWord.length()) {
                    theLongestWord = word;
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден");
        }
        return theLongestWord;
    }
}
