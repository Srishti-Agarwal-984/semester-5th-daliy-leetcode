# Last updated: 7/31/2025, 5:35:06 PM
class Solution:
    def reverseVowels(self, s: str) -> str:
        h=""
        f=list(s)
        for i in range(len(f)):
            if f[i] in "aeiouAEIOU":
                h=h+f[i]
                f[i]="*"
        g=list(h)
        g.reverse()
        print(g)
        u=0
        for i in range(len(f)):
            if f[i] in "*":
                f[i]=g[u]
                u=u+1
        q=''.join(f)
        return q 

        


        