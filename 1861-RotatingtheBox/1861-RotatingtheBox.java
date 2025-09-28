// Last updated: 9/28/2025, 2:47:02 PM
class Solution {
    public char[][] rotateTheBox(char[][] grid) {
        for(int i=0; i<grid.length; i++){
            int c=0;
            char[] a = new char[grid[0].length];
            Arrays.fill(a, '.');
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='*'){
                    int u=j-1;
                    while(c!=0){
                        a[u]='#';
                        c--;
                        u--;
                    }
                    a[j]='*';
                }
                if(grid[i][j]=='#'){
                    c++;
                }
            }
            int u=grid[i].length-1;
            while(c!=0){
                a[u]='#';
                c--;
                u--;
            }
            grid[i]=a;
        }
        char[][] ans = new char[grid[0].length][grid.length];
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                ans[i][j]=grid[j][i];
            }
            int p=ans[0].length-1;
            for(int j=0; j<ans[0].length/2; j++){
                char temp=ans[i][j];
                ans[i][j]=ans[i][p];
                ans[i][p]=temp;
                p--;

            }


        }
        return ans;

    }
}