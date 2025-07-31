# Last updated: 7/31/2025, 5:37:43 PM
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        s=0
        d=0
        while(d<len(digits)):
            s = (s*10) + digits[d]
            d=d+1
        b=s+1
        c=list(map(int,(str(b))))
        return c
        