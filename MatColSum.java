import java.util.*;
//Matrix Column Sum
public class MatColSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        int[] colSum = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int val = sc.nextInt();
                colSum[j] += val;
            }
        }

        for (int j = 0; j < m; j++) {
            System.out.println(colSum[j]);
        }

        sc.close();
    }
}