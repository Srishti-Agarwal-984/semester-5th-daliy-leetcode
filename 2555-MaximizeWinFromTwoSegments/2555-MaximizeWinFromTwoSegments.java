// Last updated: 1/23/2026, 3:36:31 AM
1class Solution {
2    public int maximizeWin(int[] arr, int k) {
3        int n = arr.length;
4        int[] left = new int[n];
5        int[] right = new int[n];
6        left[0] = 1;
7        for(int i = 1, j = 0; i<n; i++){
8            while(arr[i]-arr[j] > k){
9                j++;
10            }
11            left[i] = Math.max(left[i-1],(i-j+1));
12        }
13
14        right[n-1] = 1;
15        for(int i = n-2, j = n-1; i>=0; i--){
16            while(arr[j]- arr[i] > k){
17                j--;
18            }
19            right[i] = Math.max(right[i+1],(j-i+1));
20        } 
21
22        int ans = 0;
23        for(int i = 0; i<=n; i++){
24            ans = Math.max(ans,((i == 0) ? 0 : left[i-1]) + ((i == n) ? 0 : right[i]));
25        }
26        return ans;
27        
28        
29    }
30}