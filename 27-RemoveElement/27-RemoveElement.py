# Last updated: 7/31/2025, 5:38:27 PM
class Underscore:
    def __repr__(self):
        return "_"
underscore=Underscore()
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        a=nums.count(val)
        l=a
        k=l
        while a!=0:
            nums.remove(val)
            a=a-1
        '''while(k!=0):
            nums.append(underscore)
            k=k-1'''
        return len(nums)
        return nums
        