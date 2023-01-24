class Solution(object):
    def minPathSum(self, grid):
        m = len(grid)
        n = len(grid[0])

        for i in range(1,m): grid[i][0] += grid[i - 1][0]
        for j in range(1,n): grid[0][j] += grid[0][j - 1]

        for c in range(1,n):
            for r in range(1,m):
                grid[r][c] += min(grid[r - 1][c], grid[r][c - 1])

        return grid[m - 1][n - 1]

test1 = [[1,3,1],[1,5,1],[4,2,1]]
test2 = [[1,2,3],[4,5,6]]

print(Solution().minPathSum(test1))
print(Solution().minPathSum(test2))

        