import java.io.*;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws IOException {
        Greep test = new Greep("Hello", new File("textOne.txt"));
        test.greepPrint();
    }
}