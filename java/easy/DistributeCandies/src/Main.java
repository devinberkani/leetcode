import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[] {1, 11}));
    }

    public static int distributeCandies(int[] candyType) {
        if (candyType.length == 2) return 1;
        int r = 1;
        Arrays.sort(candyType);
        for (int i = 1; i < candyType.length; i++) {
            if (candyType[i] != candyType[i - 1]) {
                r++;
                if (r == candyType.length / 2) break;
            }
        }
        return r;
    }
}