import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if( a == 0 && b != 0) {
            System.out.print("VN");
        } else if (a == 0 && b == 0) {
            System.out.print("VSN");
        }
        else {
            double k = -b/a;
            System.out.printf("%.2f\n", k);
        }
    }
}
