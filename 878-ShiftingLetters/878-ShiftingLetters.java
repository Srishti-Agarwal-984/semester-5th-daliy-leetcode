// Last updated: 7/31/2025, 5:32:52 PM
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] arr = s.toCharArray();
        long totalShift = 0;
        for(int i=0;i<shifts.length;i++){
            totalShift+=shifts[i];
        }
        for(int i=0;i<shifts.length;i++){
            arr[i] = (char) ('a' + (arr[i] - 'a' + totalShift) % 26);
            totalShift-=shifts[i];
        } 
        return new String(arr);
    }
}