import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0;
        for(int i = 1; i <= n; i++) {
            long k = 1;
            for(int j = 1; j <=i; j++) {
                k *= j;
            }
           s += k;
        }
        System.out.println(s);
    }
}
