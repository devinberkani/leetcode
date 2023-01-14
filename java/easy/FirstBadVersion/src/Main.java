public class Main {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }

    public static int firstBadVersion(int n) {

        if (n == 1) {
            return n;
        }

        long lowRange = 1;
        long highRange = n;
        int guess = (int)Math.ceil((double)(lowRange + highRange) / 2);

        while (lowRange <= highRange) {
            if (isBadVersion(guess)) {
                highRange = guess - 1;
            } else {
                lowRange = guess + 1;
            }
            guess = (int) Math.ceil((double)(lowRange + highRange) / 2);
        }

        return guess;

    }

    public static boolean isBadVersion(int n) {
        return n >= 1702766719;
    }
}