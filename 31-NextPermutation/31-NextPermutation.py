# Last updated: 7/31/2025, 5:38:31 PM
from typing import List

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        n = len(nums)
        if n <= 1:
            return
        
        # Step 1: Find the rightmost ascending order pair
        i = n - 2
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        
        if i >= 0:  # There is a valid ascending pair
            # Step 2: Find the element to swap with
            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1
            
            # Step 3: Swap elements
            nums[i], nums[j] = nums[j], nums[i]
        
        # Step 4: Reverse the elements after the ith position
        self.reverse(nums, i + 1, n - 1)
    
    def reverse(self, nums: List[int], start: int, end: int) -> None:
        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1
