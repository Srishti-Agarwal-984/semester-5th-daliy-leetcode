# Last updated: 7/31/2025, 5:38:05 PM
from itertools import permutations
class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        a=list(map(list,permutations(nums)))
        b=[]
        for i in a:
            if i in b:
                pass
            else:
                b.append(i)
        return b
        