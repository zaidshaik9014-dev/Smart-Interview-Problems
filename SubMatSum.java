import java.util.*;
//Submatrix Sum
public class SubMatSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt(), l = sc.nextInt();

        int[][] z = new int[n][n];

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                z[a][b] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int a = i; a <= k; a++) {
            for (int b = j; b <= l; b++) {
                sum += z[a][b];
            }
        }

        System.out.println(sum);
        sc.close();
    }
}