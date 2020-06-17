import java.io.*;

public class Text {
    public static void main(String[] args) throws IOException {
        Greep test = new Greep(args);
        test.greepPrint();
        String word = "hello";
        String result = "";
        String[] splitWord = word.split("");
        for (int i = 0; i < splitWord.length; i++) {
            result += "[" + splitWord[i] + "]";
        }
        System.out.println(result);

    }
}