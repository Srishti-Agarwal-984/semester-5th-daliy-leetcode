# Last updated: 7/31/2025, 5:35:30 PM
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        f=[]
        for i in nums:
            a=nums.count(i)
            if(a==1):
                f.append(i)
        return f
        