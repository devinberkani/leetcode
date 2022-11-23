import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(4)));
    }

    public static int[] constructRectangle(int area) {
        if (isPrime(area)) {
            return new int[] {area, 1};
        }
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            w--;
        }
        return new int[] {area / w, w};
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}