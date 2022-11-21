public class Main {
    public static void main(String[] args) {
        System.out.println(arrangeCoins2(5));
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

    public static int arrangeCoins2(int n) {
        long l = 0, r = n;
        while (l <= r) {
            System.out.println("left is " + l);
            System.out.println("right is " + r);
            long k = l + ((r - l) / 2);
            System.out.println("current guess for number of rows is " + k);
            long c = (k * (k + 1)) / 2;
            System.out.println("currently checking how " + c + " (sum of all numbers up to " + k + ") compares to n, which is " + n);

            if (c == n) {
                System.out.println("the guess is equal to the input, so " + k + " is the correct answer");
                return (int) k;
            } else if (c < n) {
                l = k + 1;
                System.out.println(c + " is less than " + n + " (guess needs to be higher), so l is now " + l + " and right is " + r);
            } else {
                r = k - 1;
                System.out.println(c + " is greater than " + n + " (guess needs to be lower), so r is now " + r + " and left is " + l);
            }
        }
        return (int) r;
    }
}