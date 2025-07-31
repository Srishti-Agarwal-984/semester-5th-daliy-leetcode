# Last updated: 7/31/2025, 5:36:37 PM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        for i in nums:
            a=nums.count(i)
            if(a==1):
                return i
        