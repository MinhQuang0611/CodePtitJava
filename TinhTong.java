import java.util.Scanner;
public class TinhTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0) {
            long k = sc.nextInt();
            long kq = (k * (k+1)) / 2;
            System.out.print(kq +"\n");
            n -= 1;
        }
    }

}
