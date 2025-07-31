# Last updated: 7/31/2025, 5:36:15 PM
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        d=0
        l=0
        for i in nums:
            s=nums.count(i)
            o=s
            while o!=0:
                nums.remove(i)
                o=o-1
            if s>d:
                l=i
                d=s
        return l
