import java.util.*;
//Problem: Matrix Row Sum

public class RowSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 0; j < m; j++) {
                int val = sc.nextInt();
                sum += val;
            }

            System.out.println(sum);
        }
        sc.close();
    }
}