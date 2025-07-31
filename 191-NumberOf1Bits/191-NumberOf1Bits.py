# Last updated: 7/31/2025, 5:36:08 PM
class Solution:
    def hammingWeight(self, n: int) -> int:
        a=list(str(bin(n)))
        b=a.count("1")
        return b

        