# Last updated: 7/31/2025, 5:36:54 PM
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        a=""
        p=[]
        if (numRows<=5):
            for i in range(numRows):
                s=pow(11,i)
                a=str(s)
                p.append(list(map(int,a)))
            return p
        else:
            for i in range(5):
                s=pow(11,i)
                a=str(s)
                p.append(list(map(int,a)))
            i=4
            j=0
            k=[1]
            while(i<numRows-1):
                if(len(p[i])-1>j):
                    k.append((p[i][j]) + (p[i][j+1]))
                    j=j+1
                else:
                    k.append(1)
                    p.append(k)
                    i=i+1
                    k=[1]
                    j=0
            return p


        