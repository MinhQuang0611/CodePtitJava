import java.util.Scanner;

public class UocChiaHet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long N = sc.nextLong();
            long count = 0;

            for (long j = 1; j * j <= N; j++) {
                if (N % j == 0) {
                    if (j % 2 == 0) {
                        count++;
                    }
                    if (j != N / j && (N / j) % 2 == 0) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

    }
}
