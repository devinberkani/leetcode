import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(uniquePaths(4, 4));
    }


    // math - simplest, but not fastest solution using combinatorics
    public static int uniquePaths(int m, int n) {
        long ans = 1;
        for(int i = m+n-2, j = 1; i >= Math.max(m, n); i--, j++) {
            ans = (ans * i) / j;
        }
        return (int) ans;
    }


    // dynamic programming with reduction of space - even faster - single '&' is used to switch back and forth between two rows
    // public static int uniquePaths(int m, int n) {
    //     int[][] dp = new int[2][n];
    //     for (int[] a : dp) Arrays.fill(a, 1);
    //     for (int i = 1; i < m; i++) {
    //         for (int j = 1; j < n; j++) {
    //             System.out.println(i & 1);
    //             dp[i & 1][j] = dp[(i - 1 & 1)][j] + dp[i & 1][j - 1];
    //             printArr(dp);;
    //         }
    //     }
    //     return dp[(m - 1) & 1][n - 1];
    // }

    // // dynamic programming with tabulation - very fast
    // public static int uniquePaths(int m, int n) {
    //     int[][] dp = new int[m][n];
    //     for (int[] a : dp) Arrays.fill(a, 1);
    //     for (int i = 1; i < m; i++) {
    //         for (int j = 1; j < n; j++) {
    //             dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
    //         }
    //     }
    //     return dp[m - 1][n - 1];
    // }

    public static void printArr(int[][] dp) {
        Arrays.stream(dp).forEach(a -> System.out.println(Arrays.toString(a)));
        System.out.println();
    }

    // dynamic programming with memoization - faster and accepted, but not very fast
    // static int[][] dp = new int[101][101];
    // public static int uniquePaths(int m, int n) {
    //     return h(m, n, 0,0);
    // }

    // public static int h(int m, int n, int i, int j) {
    //     if (i >= m || j >= n) return 0;
    //     if (i == m - 1 && j == n - 1) return 1;
    //     if (dp[i][j] != 0) return dp[i][j];
    //     return dp[i][j] = h(m, n, i + 1, j) + h(m, n, i, j + 1);
    // }

    // brute force solution - too slow
    // public static int uniquePaths(int m, int n) {
    //     return h(m, n, 0,0);
    // }

    // public static int h(int m, int n, int i, int j) {
    //     if (i >= m || j >= n) return 0;
    //     if (i == m - 1 && j == n - 1) return 1;
    //     return h(m, n, i + 1, j) + h(m, n, i, j + 1);
    // }
}
