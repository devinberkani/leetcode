public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(uniquePathsWithObstacles(new int[][]{{0,1},{0,0}}));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1) return 0;
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        return h(obstacleGrid.length, obstacleGrid[0].length, 0, 0, obstacleGrid, dp);
    }

    public static int h (int m, int n, int i, int j, int[][] obstacleGrid, int[][] dp) {
        if (i >= m || j >= n || obstacleGrid[i][j] == 1) return 0;
        if (i == m - 1 && j == n - 1) return 1;
        if (dp[i][j] != 0) return dp[i][j];
        return dp[i][j] = h(m, n, i + 1, j, obstacleGrid, dp) + h(m, n, i, j + 1, obstacleGrid, dp);
    }
}
