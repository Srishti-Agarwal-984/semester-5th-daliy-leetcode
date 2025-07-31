# Last updated: 7/31/2025, 5:37:21 PM
class Solution:
    def grayCode(self, n: int) -> List[int]:
        d=2**n
        a=[]
        j=0
        for i in range(d):
            a.append(i ^ (i >> 1))
            
        return a
        