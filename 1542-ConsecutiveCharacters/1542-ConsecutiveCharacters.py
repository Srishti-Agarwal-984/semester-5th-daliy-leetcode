# Last updated: 7/31/2025, 5:30:57 PM
class Solution:
    def maxPower(self, s: str) -> int:
        c=0
        o=1
        i=0
        if len(s)==1:
            c=1
        else:
            while i!=len(s)-1:
                if s[i]==s[i+1]:
                    o=o+1
                else:
                    o=1
                if(c<o):
                    c=o
                i=i+1
        return c

        