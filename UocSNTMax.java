import java.util.Scanner;
public class UocSNTMax {

    public static long check1(long k) {
        long kq = -1;
        for(int i = 2; i <= (int)Math.sqrt(k) +1; i++){
            if(k % i == 0) {
                kq = Math.max(kq,i);
                while (k % i == 0) {
                    k /= i;
                }
            }
        }
        if(k > 1) kq = Math.max(kq,k);
        return kq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        while (n-- >  0) {
            long k = sc.nextLong();
            System.out.println(check1(k));
        }
    }
}
