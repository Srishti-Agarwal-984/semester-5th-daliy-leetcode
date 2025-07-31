# Last updated: 7/31/2025, 5:27:07 PM
class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        nums.sort()
        a=0
        g=len(nums)-1
        k=[]
        while(a<=g):
            b=nums[a]+nums[g]
            j=b/2
            k.append(j)
            a=a+1
            g=g-1
        s=min(k)
        return s
        