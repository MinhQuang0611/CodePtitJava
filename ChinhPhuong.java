import java.util.Scanner;

public class ChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0) {
            long k = sc.nextLong();
            long s = (long) Math.sqrt(k);
            if(s*s == k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
