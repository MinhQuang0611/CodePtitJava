import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class DocFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch ( IOException e) {}
    }
}
