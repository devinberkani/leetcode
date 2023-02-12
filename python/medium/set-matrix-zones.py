class Solution(object):
    def setZeroes(self, matrix):
        rows = set()
        columns = set()

        for i, arr in enumerate(matrix):
            for j, n in enumerate(arr):
                if n == 0:
                    rows.add(i)
                    columns.add(j)

        if len(rows) == 0 and len(columns) == 0:
            return

        for r in rows:
            matrix[r] = [0] * len(matrix[0])

        for c in columns:
            for i in range(len(matrix)):
                matrix[i][c] = 0


print(Solution().setZeroes([[1, 1, 1], [1, 0, 1], [1, 1, 1]]))
print(Solution().setZeroes([[0, 1, 2, 0], [3, 4, 5, 2], [1, 0, 1, 5]]))
