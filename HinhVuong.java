import java.util.Scanner;

public class HinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();


        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int minx = Math.min(x1,x3);
        int miny = Math.min(y1,y3);
        int maxx = Math.max(x2,x4);
        int maxy = Math.max(y2,y4);

        int length = Math.max(maxx-minx, maxy-miny);

        System.out.println(length*length);
    }
}
