import java.util.Scanner;

public class FourAndSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        int count4 = 0;
        int count7 = 0;

        for (char digit : N.toCharArray()) {
            if (digit == '4') {
                count4++;
            } else if (digit == '7') {
                count7++;
            }
        }

        int total = count4 + count7;

        if (total == 4 || total == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
