# Last updated: 7/31/2025, 5:28:17 PM
class Solution:
    def evenOddBit(self, n: int) -> List[int]:
        a=[]
        i=0
        j=0
        k=0
        while(n!=0):
            d=n%2
            if(d==1):
                print(i)
                if(i%2==0):
                    j=j+1
                else:
                    k=k+1
            i=i+1
            n=n//2
        a.append(j)
        a.append(k)
        return a



        
        