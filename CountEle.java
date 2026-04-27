import java.io.*;
import java.util.*;
//Problem: Count the Elements - Matrix in Array
public class CountEle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int o = sc.nextInt();
        int[] b = new int[o];

        for (int i = 0; i < o; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < m; j++) {
                for (int k = 0; k < o; k++) {
                    if (a[i][j] == b[k]) {
                        count++;
                        break;
                    }
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}