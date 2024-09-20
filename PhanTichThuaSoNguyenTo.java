import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long sqr = (long) Math.sqrt(n);
            System.out.print("Test " + (i + 1) + ": ");

            boolean isFirst = true;

            for (long j = 2; j <= sqr; j++) {
                if (n % j == 0) {
                    int cnt = 0;
                    while (n % j == 0) {
                        cnt++;
                        n /= j;
                    }
                    if (!isFirst) {
                        System.out.print(" ");
                    }
                    System.out.print(j + "(" + cnt + ")");
                    isFirst = false;
                    sqr = (long) Math.sqrt(n);
                }
            }

            if (n > 1) {
                if (!isFirst) {
                    System.out.print(" ");
                }
                System.out.print(n + "(1)");
            }
            System.out.println();
        }

    }
}
