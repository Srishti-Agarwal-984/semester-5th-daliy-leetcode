# Last updated: 1/1/2026, 10:38:51 AM
1class Solution:
2    def plusOne(self, digits: List[int]) -> List[int]:
3        s=0
4        d=0
5        while(d<len(digits)):
6            s = (s*10) + digits[d]
7            d=d+1
8        b=s+1
9        c=list(map(int,(str(b))))
10        return c
11        