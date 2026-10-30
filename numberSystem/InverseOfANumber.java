package numberSystem;
import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(inverse(n));
    }

    static int inverse(int n) {
        int p = 1;
        int ans = 0;
        while (n != 0) {
            int ld = n % 10;
            ans = ans + p * (int) Math.pow(10, ld - 1);
            p++;
            n = n/10;
        }
        return ans;
    }
}
