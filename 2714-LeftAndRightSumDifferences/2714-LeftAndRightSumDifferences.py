# Last updated: 7/31/2025, 5:28:06 PM
class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        if(len(nums)==1):
            return [0]
        a=0
        m=[]
        d=sum(nums)
        for i in range(len(nums)):
            g=d-nums[i]
            w=a-g
            if(w>0):
                m.append(w)
            else:
                m.append(-w)
            d=d-nums[i]
            a=a+nums[i]
        return m
            
        