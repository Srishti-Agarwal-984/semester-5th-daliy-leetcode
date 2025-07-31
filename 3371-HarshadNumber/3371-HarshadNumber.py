# Last updated: 7/31/2025, 5:27:36 PM
class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        b=x
        s=0
        while(x!=0):
            d=x%10
            s=s+d
            x=x//10
        if(b%s==0):
            return s
        else:
            f=-1
            return f
        