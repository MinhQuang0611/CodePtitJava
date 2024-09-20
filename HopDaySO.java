import java.util.Scanner;

public class HopDaySO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        boolean ind_a[] = new boolean[1007];
        boolean ind_b[] = new boolean[1007];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            ind_a[a[i]] = true;
        }
        for(int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            ind_b[b[i]] = true;
        }
        for(int i = 0; i <=1000; i++) {
            if(ind_a[i] || ind_b[i]) {
                System.out.print(i +" ");
            }
        }
    }
}
