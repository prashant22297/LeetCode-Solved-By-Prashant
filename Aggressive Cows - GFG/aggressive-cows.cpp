//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
public:
    bool isPossible(vector<int> & stalls,int n , int k ,int mid){
        int count=1,distance=stalls[0];
        for(int i=0;i<n;i++){
            if(stalls[i]-distance >= mid ){
                count++;
                if(count==k) return true;
                distance = stalls[i];
                
            }
        }
        if(count<k) return false;
        return true;
    }
    int solve(int n, int k, vector<int> &stalls) {
        sort(stalls.begin(),stalls.end());
        if(k>n) return -1;
        int start=0,end=stalls[n-1],mid,ans=-1;
        while(start <= end){
            mid=start+(end-start)/2;
            if(isPossible(stalls, n,k ,mid)){
                ans=mid;
                start = mid+1;
            }
            else end= mid-1;
        }
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t = 1;
    cin >> t;

    // freopen ("output_gfg.txt", "w", stdout);

    while (t--) {
        // Input

        int n, k;
        cin >> n >> k;

        vector<int> stalls(n);
        for (int i = 0; i < n; i++) {
            cin >> stalls[i];
        }
        // char ch;
        // cin >> ch;

        Solution obj;
        cout << obj.solve(n, k, stalls) << endl;

        // cout << "~\n";
    }
    // fclose(stdout);

    return 0;
}
// } Driver Code Ends