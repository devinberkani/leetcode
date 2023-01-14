class Solution(object):
  def twoSum(self, nums, target):
          """
          :type nums: List[int]
          :type target: int
          :rtype: List[int]
          """
          i = 0
          while i < len(nums):
            j = 1
            while j < len(nums):
              if nums[i] + nums[j] == target:
                return [i, j]
            j+=1
          i += 1

test = Solution()

print(test.twoSum([2,7,11,15], 9))