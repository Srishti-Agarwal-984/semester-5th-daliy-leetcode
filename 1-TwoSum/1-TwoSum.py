# Last updated: 7/31/2025, 5:38:56 PM
from typing import List, Optional

class Solution:
    def twoSum(self, nums: List[int], target: int) -> Optional[List[int]]:
        # A dictionary to store number and its index
        num_to_index = {}
        
        # Iterate over the list
        for i, num in enumerate(nums):
            # Calculate the complement
            complement = target - num
            
            # Check if complement exists in the dictionary
            if complement in num_to_index:
                # Return indices of the two numbers
                return [num_to_index[complement], i]
            
            # Store the number and its index in the dictionary
            num_to_index[num] = i
        
        # If no solution is found, return None
        return None

# Example usage:
