import java.util.*;

public class CatalanNum {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long res = factorial(2 * n) / (factorial(n + 1) * factorial(n));

        System.out.println(res);
    }
}