# Last updated: 7/31/2025, 5:36:33 PM
class Solution:
    def reverseWords(self, s: str) -> str:
        a=list(s.split())
        a.reverse()
        c=' '.join(a)
        return c
        