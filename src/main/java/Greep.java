import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Greep {
    public String word;
    public File input;
    public String regex;

    public Greep(String[] args) {
        for (int i = 0; i < args.length; i++) {
            this.word = args[0];
            this.input = new File(args[1]);
            this.regex = makeRegex(word);
        }
    }

    public String makeRegex(String word) {
        String result = "";
        String[] splitWord = word.split("");
        for (int i = 0; i < splitWord.length; i++) {
            result += "[" + splitWord[i] + "]";
        }
        System.out.println(result);
        return result;
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
