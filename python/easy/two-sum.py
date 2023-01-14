class Solution(object):
    # def twoSum(self, nums, target):
    #     """
    #     :type nums: List[int]
    #     :type target: int
    #     :rtype: List[int]
    #     """
    #     i = 0
    #     while i < len(nums):
    #         j = 1
    #         while j < len(nums):
    #             if i != j and nums[i] + nums[j] == target:
    #                 return [i, j]
    #             j+=1
    #         i+=1

# much faster solution - python hashmap
    def twoSum(self, nums, target):
        dict = {}
        for i in range((len(nums))):
            dict[nums[i]] = i

        for i in range(len(nums)):
            if (target - nums[i]) in dict and i != dict[target - nums[i]]:
                return [i, dict[target - nums[i]]]


print(Solution().twoSum([2,7,11,15], 9))
print(Solution().twoSum([3,2,4], 6))
print(Solution().twoSum([3,3], 6))