# Last updated: 7/31/2025, 5:38:52 PM
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        a=sorted(list(nums1+nums2))
        if len(a)%2!=0:
            return (float(a[(len(a))//2]))
        else:
            p=a[(len(a))//2]
            
            g=a[((len(a))//2)-1]
            return float((p+g)/2)
        