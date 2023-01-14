public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
    }

    public static boolean isPowerOfTwo(int n) {

        if (n < 1) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        double d = n;
        while (d > 2) {
            d /= 2;
        }
        return d == 2;
    }
}