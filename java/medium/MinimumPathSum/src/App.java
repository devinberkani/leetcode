import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(minPathSum(new int[][] {{1,3,1},{1,5,1},{4,2,1}}));
        System.out.println(minPathSum(new int[][] {{1,2,3},{4,5,6}}));
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 1; i < m; i++) grid[i][0] += grid[i - 1][0];
        for (int j = 1; j < n; j++) grid[0][j] += grid[0][j - 1];

        for (int c = 1; c < n; c++) {
            for (int r = 1; r < m; r++) {
                grid[r][c] += Math.min(grid[r - 1][c], grid[r][c - 1]);
            }
        }

        return grid[m - 1][n - 1];
    }


    public static void printGrid(int[][] grid) {
        Arrays.stream(grid)
                    .forEach(a -> System.out.println(Arrays.toString(a)));
        System.out.println();
    }

        // iterate x and y borders and add as you go
        // iterate from top to bottom for each row going from left to right to compare values in [i-1][j] and [i][j-1] as you go
        // example to show steps:
        // [1][1][1][1]
        // [1][2][3][4]
        // [1][2][3][4]
        // [1][2][3][4]

        // BOTTOM RIGHT CORNER IS THE ANSWER
}
