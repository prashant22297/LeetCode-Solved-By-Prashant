//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution{
    public:
    int lenOfLongSubarr(int A[],  int N, int K) 
    { 
        int curr_sum=0,res=0;
        unordered_map<int,int> mp;
        for(int i=0;i<N;i++){
            curr_sum+=A[i];
            if(curr_sum==K){
                res=max(res,i+1);
            }
            if(mp.find(curr_sum)==mp.end())
            mp[curr_sum]=i;
            if(mp.find(curr_sum-K)!=mp.end()){
                res=max(res,i-mp[curr_sum-K]);
            }
        }
        return res;
    } 

};

//{ Driver Code Starts.

int main() {
	//code
	
	int t;cin>>t;
	while(t--)
	{
	    int n, k;
	    cin>> n >> k;
	    int a[n];
	    
	    for(int i=0;i<n;i++)
	        cin>>a[i];
	   Solution ob;
	   cout << ob.lenOfLongSubarr(a, n , k)<< endl;
	    
	}
	
	return 0;
}
// } Driver Code Ends