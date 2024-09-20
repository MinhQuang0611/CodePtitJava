import java.util.Scanner;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            boolean ok = true;
            for (int i = 0; i < s.length()-1; i++) {
                int digit = s.charAt(i) -'0';
                int next = s.charAt(i+1) -'0';
                if(Math.abs(digit-next) != 1) {
                    ok = false;
                    break;
                }
            }
            if(ok) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
