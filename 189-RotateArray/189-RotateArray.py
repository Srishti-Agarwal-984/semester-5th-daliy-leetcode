# Last updated: 7/31/2025, 5:36:11 PM
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        s=[]
        f=len(nums)-k
        if f>0:
            for i in range(0,f):
                s.append(nums[0])
           
                nums.remove(nums[0])
            nums.extend(s)
            return nums
        else:
            a=abs(len(nums)+f)
            for i in range(0,a):
                s.append(nums[0])
           
                nums.remove(nums[0])
            nums.extend(s)
            return nums

        