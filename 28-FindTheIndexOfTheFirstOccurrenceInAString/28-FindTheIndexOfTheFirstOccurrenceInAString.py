# Last updated: 7/31/2025, 5:38:33 PM
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        g=0
        k=0
        u=list(haystack)
        l=list(needle)
        h=len(u)
        while(g<h):
            p = u[g]
            t = l[k]
            if (p == t):
                k=k+1
            else:
                
                g=g-k
                k=0
            if (k==len(l)):
                return g-k+1
            g=g+1
        y=-1
        return y