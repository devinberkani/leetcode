class Solution(object):
    def longestCommonPrefix(self, strs):
        r = ""
        if len(strs) == 0:
            return r
        n = 0
        i = 0
        c = strs[0]
        while n < len(c) and n < len(strs[i]) and strs[i][n] == c[n]:
            i += 1
            if (i == len(strs)):
                r += c[n]
                i = 0
                n += 1
        return r

print(Solution().longestCommonPrefix(["flower","flow","flight"]))
print(Solution().longestCommonPrefix(["dog","racecar","car"]))
print(Solution().longestCommonPrefix(["dogecoin","doggydog","dogboi"]))