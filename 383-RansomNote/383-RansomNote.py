# Last updated: 7/31/2025, 5:34:59 PM
class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        if ransomNote in magazine:
            return True
        a=list(magazine)
        c=0
        for i in ransomNote:
            if i in a:
                c=c+1
                a.remove(i)
            else:
                return False
        return True