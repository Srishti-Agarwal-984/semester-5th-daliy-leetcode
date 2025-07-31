// Last updated: 7/31/2025, 5:36:07 PM
class Solution {
    public String largestNumber(int[] nums) {
        String[] st = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            st[i]=nums[i]+"";
        }
        sort(st);
        String ans="";
        int c=0;
        for(int i=0; i<nums.length; i++){
            ans+=st[i];
            if(st[i].equals("0")){
                c++;
            }
        }
        if(c==nums.length){
            return "0";
        }
        return ans;


    }
    public static void sort(String[] st){
        for(int i=1; i<st.length; i++){
            for(int j=0; j<st.length-1; j++){
                if(camp(st[j],st[j+1])){
                    String temp = st[j];
                    st[j]=st[j+1];
                    st[j+1]=temp;
                }
            }
        }
    }
    public static boolean camp(String a, String b ){
        String k = a+b;
        String l = b+a;
        return k.compareTo(l)<0;
    }

}