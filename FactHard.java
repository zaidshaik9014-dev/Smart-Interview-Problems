import java.util.*;

public class FactHard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long mod = 1000000007;
        long res = 1;

        for (int i = 1; i <= n; i++) {
            res = (res * i) % mod;
        }

        System.out.println(res);
    }
}