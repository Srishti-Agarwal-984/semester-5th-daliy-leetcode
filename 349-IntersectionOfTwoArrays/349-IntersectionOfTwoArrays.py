# Last updated: 7/31/2025, 5:35:03 PM
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        k=[]
        a = len(nums1)
        b = len(nums2)
        if(a<b):
            for i in nums1:
                if(i in nums2 and i not in k ):
                    k.append(i)
        else:
            for i in nums2:
                if(i in nums1 and i not in k ):
                    k.append(i)
        return k



        

