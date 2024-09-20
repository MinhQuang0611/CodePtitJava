import java.util.Scanner;

public class PhanSo {

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long tuSo = sc.nextLong();
        long mauSo = sc.nextLong();

        long gcd = gcd(tuSo, mauSo);

        tuSo /= gcd;
        mauSo /= gcd;

        System.out.println(tuSo + "/" + mauSo);

    }


}
