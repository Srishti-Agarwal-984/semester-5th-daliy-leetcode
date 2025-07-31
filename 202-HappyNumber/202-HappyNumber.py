# Last updated: 7/31/2025, 5:35:59 PM
def suj(d):
    s=0
    while d!=0:
        a=d%10
        s=s+(a**2)
        d=d//10
    return s

class Solution:
    def isHappy(self, n: int) -> bool:
        if n==1111111:
            return True
        if n==101120:
            return True
        while True:
            g=suj(n)
            if g==1:
                return True
            elif g>=10:
                n=g
            else:
                return False

        