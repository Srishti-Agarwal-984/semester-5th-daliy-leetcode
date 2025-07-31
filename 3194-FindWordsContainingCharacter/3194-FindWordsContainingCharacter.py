# Last updated: 7/31/2025, 5:27:47 PM
class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        a=list(map(list,words))
        c=[]
        for i in range(len(a)):
            k=a[i].count(x)
            if(k>0):
                c.append(i)
        return c
        