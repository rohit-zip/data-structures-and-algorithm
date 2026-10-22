package numberSystem;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        int n = 24;
        int b1 = 8;
        int b2 = 2;
        int ans = anyBaseToAnyBase(n, b1, b2);
        System.out.println(ans);
    }

    private static int anyBaseToAnyBase(int n, int b1, int b2) {
        int decimal = anyBaseToDecimal(n, b1);
        int ans = decimalToAnyBase(decimal, b2);
        return ans;
    }

    private static int anyBaseToDecimal(int n, int b) {
        int ans = 0;
        int p = 1;
        while (n != 0) {
            int ld = n % 10;
            n = n / 10;
            ans += ld * p;
            p *= b;
        }
        return ans;
    }

    private static int decimalToAnyBase(int n, int b) {
        int ans = 0;
        int p = 1;
        while (n != 0) {
            int rem = n % b;
            n = n / b;
            ans += rem * p;
            p *= 10;
        }
        return ans;
    }
}
