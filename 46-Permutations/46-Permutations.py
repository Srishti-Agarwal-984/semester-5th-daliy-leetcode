# Last updated: 7/31/2025, 5:38:08 PM
from itertools import permutations
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        a=list(map(list,permutations(nums)))
        return a

        