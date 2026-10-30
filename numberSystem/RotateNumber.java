package numberSystem;
import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rotate = rotate(n, k);
        System.out.println(rotate);
    }

    static int rotate(int n, int k) {
        int digits = countDigits(n);
        k = k % digits;
        if (k < 0) {
            k = k + digits;
        }
        int remDiv = (int) Math.pow(10, k);
        int multiplier = (int) Math.pow(10, digits - k);
        int rd = n % remDiv;
        int div = n / remDiv;
        rd = rd * multiplier;
        return rd + div;
    }

    static int countDigits(int n) {
        int count = 0;
        while(n != 0) {
            n = n/10;
            count++;
        }
        return count;
    }
}
