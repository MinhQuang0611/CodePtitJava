import java.util.Scanner;

public class TamPhan
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            boolean ok =true;
            for(char x : s.toCharArray()) {
                if(x != '0' && x != '1' &&  x != '2') {
                    ok = false;
                }
            }
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
