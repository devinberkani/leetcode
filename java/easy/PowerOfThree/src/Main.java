public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(244));
    }

    public static boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        while (n > 3) {
            if (n % 3 != 0) {
                return false;
            }
            n /= 3;
        }

        return n == 3;
    }
}