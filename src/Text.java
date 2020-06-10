import java.io.*;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws IOException {
        Scanner regex = new Scanner(System.in);
        String word = regex.next();
        int counter = 0;
        StringBuilder result = new StringBuilder();
        File output = new File("textTwo.txt");
        File input = new File("textOne.txt");
        Scanner scanner = new Scanner("textTwo.txt");
        int lines = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            lines++;
        }
        scanner.close();
        System.out.println(lines);
        try {
            FileReader reader = new FileReader(input);
            FileWriter writer = new FileWriter(output);
            BufferedReader bufReader = new BufferedReader(reader);
            BufferedWriter bufWriter = new BufferedWriter(writer);
            String line = bufReader.readLine();
            lines--;
            while (lines != 0) {
                if (line.contains(word)) {
                    result.append(line).append("\n");
                    System.out.println(line);
                    line = bufReader.readLine();
                }
                lines--;
            }
            bufWriter.write(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}