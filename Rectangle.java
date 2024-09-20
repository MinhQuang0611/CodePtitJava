import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int width = sc.nextInt();

        if(length <= 0 || width <= 0) {
            System.out.print(0);
        }
        else {
            int chuVi = 2 * (length + width);
            int dienTich = length * width;
            System.out.print(chuVi + " "+  dienTich);
        }

    }
}
