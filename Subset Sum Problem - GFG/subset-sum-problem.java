//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static Boolean isSubsetSum(int n, int arr[], int sum){
        boolean[][] dp = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0) dp[i][j]=false;
                if(j==0) dp[i][j]=true;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
    // public static boolean solve(int i, int n, int arr[],int sum){
    //     if(sum==0) {
    //         dp[i][sum]=true;
    //         return true;
    //     }
    //     if(n-1==i) return false;
    //         // if(dp[i][sum]==false) return false;
    //         // else return true;
        
    //     if(arr[i]<=sum){
    //         if(dp[i][sum-arr[i]]==true) return dp[i][sum-arr[i]];
    //         else{
    //             return dp[i][sum-arr[i]]=solve(i+1,n,arr,sum-arr[i]) || solve(i+1,n,arr,sum);
    //         }
    //     }
    //     else {
    //         return dp[i][sum]=solve(i+1,n,arr,sum);
    //     }
    // }
}