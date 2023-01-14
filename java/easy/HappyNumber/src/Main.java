import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(0));
    }

    public static boolean isHappy(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (n != 1) {
            numbers.add(n);
            n = squareSum(n);
            if (numbers.contains(n)) {
                return false;
            }
        }
        return true;
    }

    public static int squareSum(int n) {
        int total = 0;
        while (n != 0) {
            int current = n % 10;
            total += current * current;
            n /= 10;
        }
        return total;
    }
}