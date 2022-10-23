//{ Driver Code Starts

#include<bits/stdc++.h>

using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:	
	/* if x is present in arr[] then returns the count
		of occurrences of x, otherwise returns 0. */
	int search(int arr[],int x , bool isleft,int n){
	    int l=0,h=n-1,m,res=-1;
	    while(l<=h){
	        m=l+(h-l)/2;
	        if(arr[m]==x){
	            res=m;
	            if(isleft) h=m-1;
	            else l=m+1;
	        }
	        else if(arr[m]>x) h=m-1;
	        else l=m+1;
	    }
	    return res;
	}
	int count(int arr[], int n, int x) {
	    int left=search(arr,x,true,n),right=search(arr,x,false,n); 
	    if(left <0 || right <0)
	    return 0;
	    else 
	    return right-left+1;
	}
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, x;
        cin >> n >> x;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.count(arr, n, x);
        cout << ans << "\n";
    }
    return 0;
}

// } Driver Code Ends