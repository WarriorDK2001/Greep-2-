import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Greep {
    public String word;
    public File input;

    public Greep(String word, File input) {
        this.word = word;
        this.input = input;
    }
    public void greepPrint() throws IOException {
        try {
            Scanner scanner = new Scanner(input);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
