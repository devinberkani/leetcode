class Solution(object):
    def searchMatrix(self, matrix, target):
        m = len(matrix)
        n = len(matrix[0])

        if target < matrix[0][0] or target > matrix[m - 1][n - 1]:
            return False

        rowStart = 0
        columnStart = 0
        rowEnd = m - 1
        columnEnd = n - 1

        while rowStart < rowEnd:

            midRow = ((rowEnd - rowStart) // 2) + rowStart
            midNumLow = matrix[midRow][columnStart]
            midNumHigh = matrix[midRow][columnEnd]

            if midNumLow == target or midNumHigh == target:
                return True
            elif midNumLow > target:
                rowEnd = midRow - 1
            elif midNumHigh < target:
                rowStart = midRow + 1
            else:
                rowStart = midRow
                break

        while columnStart <= columnEnd:

            midColumn = ((columnEnd - columnStart) // 2) + columnStart
            midNum = matrix[rowStart][midColumn]

            if midNum == target:
                return True

            if midNum < target:
                columnStart = midColumn + 1
            elif midNum > target:
                columnEnd = midColumn - 1
            else:
                return False

        return False


print(Solution().searchMatrix([[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]], 3))
print(Solution().searchMatrix([[1], [3], [5]], 3))
print(Solution().searchMatrix([[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]], 13))
print(Solution().searchMatrix([[1,3,5,7],[10,11,16,20],[23,30,34,50]], 11))

