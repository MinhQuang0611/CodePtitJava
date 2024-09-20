import java.util.Scanner;

public class GCD_LCM {
    public static long gcd(long a, long b) {
        while (b != 0){
            long tmp = b;
            b = a % b ;
            a = tmp;
        }
        return a;
    }
    public static long lcm(long a, long b) {
        return (a*b) / gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long GCD = gcd(a,b);
            long LCM = lcm(a,b);

            System.out.println(LCM + " " + GCD);
        }
    }


}
