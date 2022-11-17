public class Main {
    public static void main(String[] args) {
        System.out.println(guessNumber(2126753390));
    }

    public static int guessNumber(int n) {

        int l = 0;
        while (true) {
            int g = l + ((n - l) / 2);
            if (guess(g) == -1) {
                n = g - 1;
            } else if (guess(g) == 1) {
                l = g + 1;
            } else {
                return g;
            }
        }

    }

    public static int guess(int num) {
        int c = 1702766719;
        return Integer.compare(c, num);
    }
}