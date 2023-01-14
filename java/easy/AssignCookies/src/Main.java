import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[] {10,9,8,7}, new int[] {5,6,7,8}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int r = 0;
        for (int j : s) {
            r = g[r] <= j ? r + 1 : r;
            if (r == g.length) {
                break;
            }
        }
        return r;
    }
}