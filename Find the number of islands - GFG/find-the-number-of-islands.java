//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,m,n,grid);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(int i, int j, int m ,int n, char[][] grid){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]!='1') return;
        
        grid[i][j]='0';
        int[] ax = {0,0,1,1,1,-1,-1,-1};
        int[] ay = {+1,-1,-1,0,1,-1,0,1};
        for(int k=0;k<8;k++){
            int nx = ax[k]+i;
            int ny = ay[k]+j;
            dfs(nx,ny,m,n,grid);
        }
    }
}