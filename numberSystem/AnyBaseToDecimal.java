package numberSystem;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        int n = 1172;
        int b = 8;
        int decimalNumber = getValueInDecimal(n, b);
        System.out.println(decimalNumber);
    }

    public static int getValueInDecimal(int n, int b) {
        int ans = 0;
        int p = 1;
        while (n != 0) {
            int d = n % 10;
            n = n / 10;
            ans += d * p;
            p = p * b;
        }
        return ans;
    }
}
