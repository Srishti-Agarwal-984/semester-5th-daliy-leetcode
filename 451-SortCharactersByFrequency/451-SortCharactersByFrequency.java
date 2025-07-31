// Last updated: 7/31/2025, 5:34:24 PM
class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[123];
       for(int i=0; i<s.length(); i++){
            freq[(int)(s.charAt(i))]++;
       }
       List<Integer> df = new ArrayList<>();
       List<Integer> cp = new ArrayList<>();
       for(int i=0; i<123; i++){
            df.add(freq[i]);
            cp.add(freq[i]);
       }
       Collections.sort(cp);
       StringBuilder sp = new StringBuilder();
       while(cp.size()>=1 && cp.get(cp.size()-1)>=1){
            StringBuilder kl = new StringBuilder();

            int u= cp.get(cp.size()-1);
            int fg = df.indexOf(cp.get(cp.size()-1));
            String r = ""+ (char)(df.indexOf(cp.get(cp.size()-1)));
            while(u!=0){
                kl.append(r);
                u--;
            }
            sp.append(kl);
            df.set(fg, 0);
            cp.remove(cp.size()-1);

       }
       return sp.toString();
    }
}