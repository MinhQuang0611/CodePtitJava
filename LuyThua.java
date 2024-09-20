import java.math.BigInteger;
import java.util.*;

public class LuyThua {
    public static long pow(long a, long b, long mod){
        long res = 1;
        while(b > 0){
            if(b % 2 == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long mod = 1000000007;
        long a, b;
        while (true) {
            a = sc.nextLong();
            b = sc.nextLong();
            if( a== 0 && b == 0) break;
            else {
                System.out.println(pow(a,b,mod));
            }
        }
    }
}
