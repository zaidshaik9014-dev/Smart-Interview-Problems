import java.util.*;

public class MinSub {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int pow = 1;

        while (pow * 2 <= n) {
            pow *=  2;
        }

        int x = n - pow;
        System.out.println(x);
    }
}