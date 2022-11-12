import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(10)));
    }

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            String s = String.join("", Integer.toBinaryString(i).split("0+"));
            result[i] = s.length();
        }
        return result;
    }
}