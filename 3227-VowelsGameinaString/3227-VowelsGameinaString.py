# Last updated: 9/13/2025, 5:15:04 AM
class Solution:
    def doesAliceWin(self, s: str) -> bool:
        d=""
        b=0
        i=0
        while(i<len(s)):
            p=s[i]
            if(p in "aeiou" or p in "AEIOU"):
                b=b+1
            i=i+1
        if(b==0):
            return False
        return True

        