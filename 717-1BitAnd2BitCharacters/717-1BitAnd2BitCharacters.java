// Last updated: 7/31/2025, 5:33:19 PM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        for(i=0;i<bits.length-1;i++){
            if(bits[i]==1)
            i++;
        }
        return i==bits.length-1;
    }
}