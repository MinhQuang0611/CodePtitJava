import java.util.Scanner;
public class NhiPhan {
    static long solve(int n, long k, long[] arr){
        if(n < 3) return n - 1;
        if(k <= arr[n - 2]) return solve(n - 2, k, arr);
        return solve(n - 1, k - arr[n - 2], arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] arr = new long[92];
        arr[1] = 1; arr[2] = 1;
        for(int i = 3;i < 92;i++) arr[i] = arr[i - 1] + arr[i - 2];
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(solve(n, k, arr));
        }
    }

}