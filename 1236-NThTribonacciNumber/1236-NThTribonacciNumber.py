# Last updated: 7/31/2025, 5:31:59 PM
class Solution:
    def tribonacci(self, n: int) -> int:
        a=0
        b=1
        c=1
        if(n==0):
            return 0
        if(n==1 or n==2):
            return 1
        if(n>=3):
            i=3
            while(i<=n):
                s=a+b+c
                a=b
                b=c
                c=s
                i=i+1
        return s
            