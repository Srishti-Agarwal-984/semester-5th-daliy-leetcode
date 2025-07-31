// Last updated: 7/31/2025, 5:36:19 PM
class Solution {
    public int compareVersion(String version1, String version2) {
        String s="";
        List<Integer> ar = new ArrayList<>();
        for(int i=0; i<version1.length(); i++){
            if(version1.charAt(i)=='.'){
                ar.add(Integer.parseInt(s));
                //System.out.println(ar.get(ar.size()-1));
                s="";
            }
            else{
                s=s+version1.charAt(i);
            }
        }
        ar.add(Integer.parseInt(s));
        //System.out.println(ar.get(ar.size()-1));
        s="";
        List<Integer> ar1 = new ArrayList<>();
        for(int i=0; i<version2.length(); i++){
            if(version2.charAt(i)=='.'){
                ar1.add(Integer.parseInt(s));
                s="";
            }
            else{
                s=s+version2.charAt(i);
            }
        }
        ar1.add(Integer.parseInt(s));
        int u=0, m=0;
        int o= ar.size(), l= ar1.size();
        while(u<o && m<l){
            if(ar.get(u)>ar1.get(m)){
                return 1;
            }
            if(ar.get(u)<ar1.get(m)){
                return -1;
            }
            u++;
            m++;
        }
        while(u<o){
            if(ar.get(u)>0){
                return 1;
            }
            u++;
        }
        while(m<l){
            if(ar1.get(m)>0){
                return -1;
            }
            m++;
        }
        return 0;
        
    }
}