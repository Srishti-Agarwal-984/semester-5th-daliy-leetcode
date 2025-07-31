# Last updated: 7/31/2025, 5:36:44 PM
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        for i in nums:
            w=nums.count(i)
            if(w==1):
                return i
        