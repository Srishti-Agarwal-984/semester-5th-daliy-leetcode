// Last updated: 12/3/2025, 2:04:56 PM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int ans=0;
4        for(int i=0; i<nums.length; i++){
5            int even=0, odd=0;
6            HashSet<Integer> st = new HashSet<>();
7            for(int j=i; j<nums.length; j++){
8                if(!st.contains(nums[j])){
9                    st.add(nums[j]);
10                    if(nums[j]%2==0){
11                        even++;
12                    }
13                    else{
14                        odd++;
15                    }
16                }
17                if(even==odd){
18                    ans=Math.max(j-i+1, ans);
19                }
20            }
21        }
22        return ans;
23        
24    }
25}