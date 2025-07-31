# Last updated: 7/31/2025, 5:36:48 PM
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        a=0
        for i in range(len(prices)-1):
            b=prices[i+1]-prices[i]
            if b>0:
                a=a+b
        return a
        