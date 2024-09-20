import java.util.Scanner;
import java.math.BigInteger;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger gcd = a.gcd(b);

            BigInteger lcm = a.multiply(b).divide(gcd);
        System.out.println(lcm);
        }
    }
}
