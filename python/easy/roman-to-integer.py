class Solution(object):
    def romanToInt(self, s):
        dict = {'I': 1,'IV': 4,'V': 5,'IX': 9,'X': 10,'XL': 40,'L': 50,'XC': 90,'C': 100,'CD': 400,'D': 500,'CM': 900,'M': 1000}
        r = 0
        i = 0
        while i < len(s):
            curr = s[i]
            if i < len(s) - 1:
                if s[i] + s[i + 1] in dict:
                    curr = s[i] + s[i + 1]
                    i += 1
            r += dict[curr]
            i += 1
        return r

print(Solution().romanToInt('CM'))
print(Solution().romanToInt('LVIII'))
print(Solution().romanToInt('MCMXCIV'))