import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Greep {
    public String word;
    public File input;
    
    public Greep(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i==0) this.word=args[i];
            if (i==1) this.input= new File(args[i]);
        }
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
