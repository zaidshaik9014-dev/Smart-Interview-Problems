import java.util.*;
//Problem: Left Sum and Right Sum
public class LeftRightSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += a[i];
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - a[i];
            int b = Math.abs(leftSum - rightSum);

            System.out.print(b + " ");

            leftSum += a[i];
        }
        sc.close();
    }
}