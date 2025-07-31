# Last updated: 7/31/2025, 5:30:23 PM
class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        p=0
        for i in nums:
            s=nums.count(i)
            if(s==1):
                p=p+i
        return p

        