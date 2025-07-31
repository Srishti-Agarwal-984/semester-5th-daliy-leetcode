# Last updated: 7/31/2025, 5:31:01 PM
class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        d=max(candies)
        s=[]
        e=extraCandies
        for i in range(len(candies)):
            w=e+candies[i]
            if w>=d:
                s.append(True)
            else:
                s.append(False)
        return s

        