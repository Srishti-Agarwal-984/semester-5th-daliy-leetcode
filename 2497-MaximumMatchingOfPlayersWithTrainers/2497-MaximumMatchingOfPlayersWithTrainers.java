// Last updated: 7/31/2025, 5:28:38 PM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int j=0;
        int c=0;
        for(int i=0; i<trainers.length; i++){
            if(j<players.length && players[j]<=trainers[i]){
                c++;
                j++;
            }
            if(j==players.length){
                break;
            }
        }
        return c;
    }
}