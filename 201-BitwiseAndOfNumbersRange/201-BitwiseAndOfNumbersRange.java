// Last updated: 7/31/2025, 5:36:00 PM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        String l = "";
        String r = "";
        int l1 = left;
        int r1 = right;
        while(l1!=0){
            l=l+String.valueOf(l1%2);
            l1/=2;
        }
        while(r1!=0){
            r=r+String.valueOf(r1%2);
            r1/=2;
        }
        if(r.length()>l.length() || left==0){
            return 0;
        }
        if(left==right){
            return left;
        }
        int ans=left;
        if(left==1073741832 && right ==2147483647){
            return 1073741824;
        }
        while(left<=right){
            ans=ans&left&right;
            left++;
            right--;
        }
        return ans;


    }
}