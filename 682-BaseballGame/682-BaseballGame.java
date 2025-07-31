// Last updated: 7/31/2025, 5:33:25 PM
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> ar = new ArrayList<>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("D")){
                ar.add(2*ar.get(ar.size()-1));
            }
            else if(operations[i].equals("C")){
                ar.remove(ar.size()-1);
            }
            else if(operations[i].equals("+")){
                ar.add(ar.get(ar.size()-1)+ar.get(ar.size()-2));
            }
            else{
                ar.add(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        for(int i=0; i<ar.size(); i++){
            sum+=ar.get(i);
        }
        return sum;

        
    }
}