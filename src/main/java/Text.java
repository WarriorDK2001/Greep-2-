import java.io.*;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
    }

    public void Filter(Greep greep) throws IOException {
        try {
            Scanner scanner = new Scanner(greep.input);
            ;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(greep.word)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}