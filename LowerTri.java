import java.util.*;
//Problem: Lower Triangle
public class LowerTri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();

                if (j <= i) {
                    sum += val;
                }
            }
        }
        
        System.out.println(sum);
        sc.close();
    }
}