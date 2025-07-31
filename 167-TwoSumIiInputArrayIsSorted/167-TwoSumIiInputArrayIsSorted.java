// Last updated: 7/31/2025, 5:36:17 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] s = new int[2];
        int c=0;
        for(int  i=0; i<numbers.length-1; i++){
            // int a = target-numbers[i];
            int j=i+1, l= numbers.length-1; 
            while(j<=l){
                int mid = (l+j)/2;
                if(numbers[mid]== (target-numbers[i])){
                    s[0]=i+1;
                    s[1]=mid+1;
                    c=1;
                    break;
                }
                else if (numbers[mid]>(target-numbers[i])){
                    l=mid-1;
                }
                else{
                    j=mid+1;
                }
            }
            if(c==1){
                break;
            }
        }
        return s;
        
    }
}