public class Main {
    public static void main(String[] args) {
        System.out.println(mySqrt(2));

        for (int i = 0; i < 100; i++) {
            System.out.println("The square root of " + i + " is " + mySqrt(i));
        }
    }

    public static int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }

        double root;
        double guess = x;

        while (true) {

            root = 0.5 * (guess + (x / guess));

            if (Math.abs(root - guess) < 1) {
                break;
            }

            guess = root;
        }

        return (int) root;
    }

}