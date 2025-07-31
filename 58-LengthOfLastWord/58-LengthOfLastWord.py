# Last updated: 7/31/2025, 5:37:50 PM
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        a=list(s.split())
        b=len(a[len(a)-1])
        return b
        