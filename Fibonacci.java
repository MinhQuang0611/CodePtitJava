import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] fibo = new long[95];
        fibo[1] = fibo[2] = 1;
        for (int i = 3; i <= 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
            while (n > 0) {
                int k = sc.nextInt();
                System.out.print(fibo[k] + "\n");
                n -= 1;
            }
        }
    }

