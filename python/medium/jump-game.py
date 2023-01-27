class Solution(object):
    def canJump(self, nums):
        if len(nums) == 1:
            return True
        if nums[0] == 0:
            return False
        c = nums[0]
        for i in range(1, len(nums) - 1):
            c -= 1
            if nums[i] > c:
                c = nums[i]
            if c == 0:
                return False
        return True


print(Solution().canJump([2, 3, 1, 1, 4]))
print(Solution().canJump([3, 2, 1, 0, 4]))
