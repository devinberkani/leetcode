public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        boolean b = Math.abs(x) > 1000000000 || x == Integer.MIN_VALUE;
        int comp = Integer.MAX_VALUE;
        int d = 1000000000;
        int r = 0;
        while (x != 0) {
            int c = x % 10;
            if (b) {
                int cb = comp / d;
                if (Math.abs(c) > cb) return 0;
                if (Math.abs(c) == cb) {
                    comp -= (cb * d);
                    d /= 10;
                } else b = false;
            }
            x /= 10;
            r = (r * 10) + c;
        }
        return r;
    }
}