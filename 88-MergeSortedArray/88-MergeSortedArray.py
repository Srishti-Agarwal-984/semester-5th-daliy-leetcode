# Last updated: 7/31/2025, 5:37:22 PM
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        nums1.extend(nums2)
        nums1.sort()
        g=len(nums2)
        d=nums1.count(0)
        i=0
        if g<d:
            while i!=g:
                nums1.remove(0)
                i=i+1
            return nums1
        else:
            while i!=d:
                nums1.remove(0)
                i=i+1
            return nums1
            
        
            
        