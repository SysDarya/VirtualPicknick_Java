import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    private File file;

    public WordCounter(File file){
        this.file = file;
    }

    public int countWords(){
        int counter = 0;
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()){
                scan.next();
                counter++;
            }
            scan.close();
        } catch (FileNotFoundException e){
            System.out.println("Ошибка: Файл не найден.");
        }
        return counter;
    }
}
