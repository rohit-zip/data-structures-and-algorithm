package numberSystem;
import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = gcd(n1, n2);
        int lcm = (n1 * n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }

    static int gcd(int n1, int n2) {
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }
}
