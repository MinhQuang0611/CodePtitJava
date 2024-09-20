import java.util.Scanner;

public class SoKoLienKe {
    public static boolean check1(String k) {
        for(int i = 0; i < k.length()-1; i++) {
            int digit = k.charAt(i) - '0';
            int next = k.charAt(i + 1) - '0';
            if (Math.abs(digit - next) != 2) return false;


        }
        return true;
    }
    public static boolean check2(String k) {
        int sum = 0;
        for(int i = 0; i < k.length();i++){
            int digit = k.charAt(i) -'0';
            sum += digit;
        }
        if (sum % 10 == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String k = sc.next();
            if(check1(k) && check2(k)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
