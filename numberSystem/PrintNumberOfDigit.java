package numberSystem;

public class PrintNumberOfDigit {
    public static void main(String[] args) {
        int n = 747457847;
        int digits = countDigit(n);
        int div = (int) Math.pow(10, digits - 1);
        while (n != 0) {
            int d = n / div;
            n = n % div;
            div /= 10;
            System.out.println(d);
        }
    }

    static int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            n = n/10;
            count++;
        }

        return count;
    }
}
