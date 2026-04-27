import java.util.*;
//Problem: Ternary Array
public class TernaryArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int totalCost = 0;
        for (int i = 0; i < n; i++) {
            int minCost = Integer.MAX_VALUE;
            
            for (int val = 0; val <= 2; val++) {
                if (val != a[i]) {
                    int cost = Math.abs(a[i] - val);
                    minCost = Math.min(minCost, cost);
                }
            }

            totalCost += minCost;
        }

        System.out.println(totalCost);
        sc.close();
    }
}