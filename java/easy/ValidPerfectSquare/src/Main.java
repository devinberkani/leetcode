public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(25));
    }

    public static boolean isPerfectSquare(int num) {

        long g = Math.min(num / 2, 46340);
        while (true) {
            g = (long) (0.5 * (g + ((double) num / g)));
            if (g * g == num) {
                return true;
            }
            if ((g - 1) * (g - 1) < num && (g + 1) * (g + 1) > num) {
                return false;
            }
        }
    }
}