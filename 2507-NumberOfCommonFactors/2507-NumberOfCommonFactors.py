# Last updated: 7/31/2025, 5:28:42 PM
class Solution:
    def commonFactors(self, a: int, b: int) -> int:
        s=min(a,b)
        c=0
        while(s!=0):
            if(a%s==0 and b%s==0):
                c=c+1
            s=s-1
        return c
        