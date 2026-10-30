package numberSystem;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int div = 2 ; div < n/div ; div++) {
            while (n % div == 0) {
                n = n /div;
                System.out.println(div);
            }
        }
        if (n!=1) {
            System.out.println(n);
        }
    }
}
