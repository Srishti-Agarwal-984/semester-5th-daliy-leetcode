# Last updated: 7/31/2025, 5:28:33 PM
class Solution:
    def findArray(self, pref: List[int]) -> List[int]:
        f=[]
        f.append(pref[0])
        for i in range(1,len(pref)):
            a=pref[i-1]^pref[i]
            f.append(a)
        return f
        