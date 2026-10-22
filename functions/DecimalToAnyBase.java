package functions;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        int n = 634;
        int b = 8;
        int ans = getValueInBase(n, b);
        System.out.println(ans);
    }

    public static int getValueInBase(int n, int b) {
        int ans = 0;
        int p = 1;
        while (n != 0) {
            int d = n % b;
            n = n / b;
            ans += d * p;
            p *= 10;
        }
        return ans;
    }
}
