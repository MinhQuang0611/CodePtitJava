
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class HelloFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("Hello.txt"));
            while(sc.hasNextLine()) {
                System.out.print(sc.nextLine() +  "\n");
            }
        } catch (FileNotFoundException e) {

        }

    }
}
