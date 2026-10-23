package numberSystem;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        int ans = anyBaseProduct(234, 76, 8);
        System.out.println(ans);
    }

    private static int anyBaseProduct(int n1, int n2, int b) {
        int rv = 0;
        int p = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int singleProduct = getProductForSingleDigit(n1, d2, b);
            rv = anyBaseAddition(rv, singleProduct * p, b);
            p = p * 10;
        }
        return rv;
    }

    private static int getProductForSingleDigit(int n1, int d, int b) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n1 != 0 || c != 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int nd = d1 * d + c;
            c = nd / b;
            nd = nd % b;
            rv += nd * p;
            p = p * 10;
        }
        return rv;
    }

    private static int anyBaseAddition(int n1, int n2, int b) {
        int rv = 0;
        int p = 1;
        int c = 0;
        while (n1!=0 || n2!=0 || c!=0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1/10;
            n2 = n2/10;
            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;
            rv += d * p;
            p = p * 10;
        }
        return rv;
    }
}
