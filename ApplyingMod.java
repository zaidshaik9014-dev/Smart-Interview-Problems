import java.util.*;

public class ApplyingMod {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong(), e = sc.nextLong(), f = sc.nextLong();

        long first = ((a % MOD) * (b % MOD)) % MOD;
        first = (first * (c % MOD)) % MOD;

        long sec = ((d % MOD) * (e % MOD)) % MOD;
        sec = (sec * (f % MOD)) % MOD;

        long res = (first - sec + MOD) % MOD;

        System.out.println(res);

        sc.close();
    }
}