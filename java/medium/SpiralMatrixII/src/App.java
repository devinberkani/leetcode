import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.deepToString(generateMatrix(2)));
    }

    public static int[][] generateMatrix(int n) {
        int[][] r = new int[n][n];

        int xStart = 0;
        int xEnd = r.length - 1;
        int yStart = 0;
        int yEnd = r[0].length - 1;
        int count = 1;

        while(true) {

            for (int i = yStart; i <= yEnd; i++) r[xStart][i] = count++;

            if (count > n * n) break;
            xStart++;

            for (int i = xStart; i <= xEnd; i++) r[i][yEnd] = count++;

            if (count > n * n) break;
            yEnd--;

            for (int i = yEnd; i >= yStart; i--) r[xEnd][i] = count++;

            if (count > n * n) break;
            xEnd--;

            for (int i = xEnd; i >= xStart; i--) r[i][yStart] = count++;

            if (count > n * n) break;
            yStart++;

        }
        return r;
    }
}
