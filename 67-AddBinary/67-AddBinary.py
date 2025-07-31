# Last updated: 7/31/2025, 5:37:42 PM
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        p =eval("0b"+((a)))
        k = (eval("0b"+b))
        s = str(bin(p+k))
        return s[2:]
        