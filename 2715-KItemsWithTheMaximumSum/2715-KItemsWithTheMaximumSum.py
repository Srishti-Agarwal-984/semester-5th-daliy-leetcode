# Last updated: 7/31/2025, 5:28:04 PM
class Solution:
    def kItemsWithMaximumSum(self, numOnes: int, numZeros: int, numNegOnes: int, k: int) -> int:
        s=numOnes
        b=numZeros
        if(k<=s):
            return k
        if(k>s and k<=s+b):
            return s
        if(k>s+b):
            a=k-(s+b)
            return s-a
        