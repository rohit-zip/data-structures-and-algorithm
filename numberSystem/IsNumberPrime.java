package numberSystem;
import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++) {
            int a = sc.nextInt();
            int count = 0;
            for (int div = 1 ; div <= a ; div++) {
                if (a % div == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
