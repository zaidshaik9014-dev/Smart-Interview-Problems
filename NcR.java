import java.util.*;

public class NcR {

    public static int fact(int n) {
        int Fact = 1;
        for (int i = 1; i <= n; i++) {
            Fact *= i;
        }

        return Fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), r = sc.nextInt();

        if (r > n) {
            System.out.println(0);
        } else {
            int res = fact(n) / (fact(r) * fact(n - r));
            System.out.println(res);
        }

        sc.close();
    }
}