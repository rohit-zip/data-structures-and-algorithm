package numberSystem;

public class AnyBaseAddition {
    public static void main(String[] args) {
        int n1 = 346;
        int n2 = 777;
        int base = 8;
        int ans = anyBaseAddition(n1, n2, base);
        System.out.println(ans);
    }

    private static int anyBaseAddition(int n1, int n2, int base) {
        int c = 0;
        int p = 1;
        int rv = 0;
        while (n1!=0 || n2!=0 || c!=0) {
            int d1 = n1%10;
            int d2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;
            int d = d1 + d2 + c;
            c = d/base;
            d = d%base;
            rv += d * p;
            p = p * 10;
        }
        return rv;
    }
}
