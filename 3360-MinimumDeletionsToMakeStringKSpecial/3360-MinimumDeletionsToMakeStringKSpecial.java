// Last updated: 7/31/2025, 5:27:29 PM
class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        int np=0;
        for(int i=0; i<word.length(); i++){
            freq[word.charAt(i)-'a']++;
            if(freq[word.charAt(i)-'a']==1){
                np++;

            }
        }
        Arrays.sort(freq);
        List<Integer> kl = new ArrayList<>();
        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                kl.add(freq[i]);
            }
        }
        int min=0, max=word.length();
        int ans=max;
        if(kl.get(kl.size()-1)-kl.get(0)<=k){
            return 0;
        }
        for(int g=0; g<kl.size(); g++){
            ans=Math.min(ans, helper(kl.get(g),k,kl));
        }
        return ans;

    }
    public int helper(int mid, int k,List<Integer> kl ){
        int sum=0;
        for(int i=0; i<kl.size();  i++){
            if(kl.get(i)<mid){
                sum+=kl.get(i);
            }
            else if(kl.get(i)>mid+k){
                sum+=kl.get(i)-mid-k;
            }
            else{
                continue;
            }
        }
        return sum;
    }
}