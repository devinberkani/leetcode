public class Main {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int c = grid[i][j];
                if (c == 1) {
                    int t = i == 0 || grid[i - 1][j] == 0 ? 1 : 0;
                    int b = i == grid.length - 1 || grid[i + 1][j] == 0 ? 1 : 0;
                    int l = j == 0 || grid[i][j - 1] == 0 ? 1 : 0;
                    int r = j == grid[i].length - 1 || grid[i][j + 1] == 0 ? 1 : 0;
                    res += t + b + l + r;
                }
            }
        }
        return res;
    }
}