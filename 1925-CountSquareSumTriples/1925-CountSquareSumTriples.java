// Last updated: 12/8/2025, 5:59:02 AM
1class Solution {
2    public int countTriples(int n) {
3        int ans=0;
4        for(int i=1; i<=n; i++){
5            for(int j=i+1; j<=n; j++){
6                int si=j+1;
7                int en = n;
8                while(si<=en){
9                    int mid = si+(en-si)/2;
10                    if(mid*mid==(i*i+j*j)){
11                        ans=ans+2;
12                        break;
13                    }
14                    else if(mid*mid>(i*i+j*j)){
15                        en=mid-1;
16                    }
17                    else{
18                        si=mid+1;
19                    }
20                }
21            }
22        }
23        return ans;
24        
25    }
26}