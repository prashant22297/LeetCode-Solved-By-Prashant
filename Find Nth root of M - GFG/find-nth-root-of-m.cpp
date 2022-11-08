//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution{
	public:
	double multi(int n, double mid){
	    double ans=1;
	    while(n-->0){
	        ans*=mid;
	    }
	    return ans;
	}
	int NthRoot(int n, int m)
	{
	    long long l=0,h=m,mid;
	    while(l<=h){
	        mid=l+(h-l)/2;
	        double t=multi(n,mid);
	        if(t==m) return mid;
	        else if(t>m) h=mid-1;
	        else l=mid+1;
	    }
	    return -1;
	}  
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		Solution ob;
		int ans = ob.NthRoot(n, m);
		cout << ans << "\n";
	}  
	return 0;
}
// } Driver Code Ends