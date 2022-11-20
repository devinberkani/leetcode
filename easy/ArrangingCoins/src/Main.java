public class Main {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(Integer.MAX_VALUE));
    }

    public static int arrangeCoins(int n) {
        int c = n;
        for (int i = 1; i <= n; i++) {
            c -= i;
            if (c < 0) {
                return i - 1;
            }
        }
        return 1;
    }
}