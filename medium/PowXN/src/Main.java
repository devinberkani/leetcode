public class Main {
    public static void main(String[] args) {
        System.out.println(myPow(-1, Integer.MIN_VALUE));
    }

    public static double myPow(double x, int n) {
        double r = 1;
        if (n == 0) return r;
        if (n == 1 || x == 1) return x;
        if (n == Integer.MIN_VALUE) {
            if (x == -1) return 1;
            return 0;
        }
        if (n < 0) {
            x = 1 / x;
            n *= -1;
        }
        while (n > 0) {
            if (n % 2 == 0) n /= 2;
            else {
                r *= x;
                n = (n - 1) / 2;
            }
            x *= x;
        }
        return r;
    }
}

// 2^10 = 4^5 = 4^1 * 16^2 = 4^1 * 256^1
// 2.1^3 = 2.1^1 * 4.41^1
// 1/2^10 = 1/4^5 = 1/4^1 * 1/16^2 = 1/4^1 * 1/256^1