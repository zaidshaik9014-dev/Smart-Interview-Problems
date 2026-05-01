import java.util.*;

public class NumOfMul {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long mul3 = n / 3;
        long mul5 = n / 5;
        long mul15 = n / 15;

        long res = mul3 + mul5 - mul15;
        System.out.println(res);
    }
}