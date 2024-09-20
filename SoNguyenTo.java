import java.util.Scanner;

public class SoNguyenTo {
    public static boolean ok (int k) {
        if(k < 2 ) return false;
        if(k == 2) return true;
        for(int i = 2; i < (int)(Math.sqrt(k)+1); i++) {
            if(k % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int k = sc.nextInt();
            if( ok(k)){
                System.out.print("YES\n" );
            }
            else System.out.print("NO\n");
            n-=1;
        }
    }

}
