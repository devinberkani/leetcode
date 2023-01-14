import math

class Solution(object):
    def isPalindrome(self, x):
        if x < 0:
            return False
        o = x
        c = 0
        while (x > 0):
            c *= 10
            c += math.floor(x % 10)
            x = math.floor(x / 10)
        return o == c

print(Solution().isPalindrome(12121))
print(Solution().isPalindrome(-121))
print(Solution().isPalindrome(10))
