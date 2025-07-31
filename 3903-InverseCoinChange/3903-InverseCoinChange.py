# Last updated: 7/31/2025, 5:25:40 PM
class Solution(object):
    def findCoins(self, numWays):
        """
        :type numWays: List[int]
        :rtype: List[int]
        """
        n=len(numWays);
        r=[]
        dp=[0]*(n+1)
        dp[0]=1
        for coin in range(1, n+1):
            temp=dp[:]
            for i in range(coin, n+1):
                temp[i]+=temp[i-coin]
            if all(temp[i]<=numWays[i-1] for i in range(1, n+1)):
                r.append(coin)
                dp=temp
        if dp[1:]== numWays:
            return r
        else:
            return []
        