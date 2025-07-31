# Last updated: 7/31/2025, 5:37:47 PM
from itertools import permutations
class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        h=[]
        for i in range(1,n+1):
            h.append(i)
        a=list(map(list,permutations(h)))
        b=a[k-1]
        c=""
        for i in b:
            c=c+str(i)
        return c   

        